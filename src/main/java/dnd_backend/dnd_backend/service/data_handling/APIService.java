package dnd_backend.dnd_backend.service.data_handling;

import dnd_backend.dnd_backend.model.Item;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class APIService {

	@Autowired
	private RemoteURLReader remoteURLReader;

	private String url = "";

	public List<Item> getAllItems() throws IOException {
		ArrayList<Item> items = new ArrayList<>();
		this.setApiPath("https://www.dnd5eapi.co/api/equipment");
		String result = remoteURLReader.readFromUrl(url);
		JSONObject json = new JSONObject(result);
		JSONArray jsonArray = json.getJSONArray("results");

		jsonArray.forEach(resultObject -> {
			System.out.println(resultObject.getClass());
			String itemUrl = resultObject.getString("url");
			System.out.println(itemUrl);
			JSONObject itemObject2 = getNestedFetchData(new JSONObject(resultObject).get("url").toString());
			JSONObject itemCostObject = new JSONObject(itemObject2.get("cost"));
			items.add(new Item(resultObject.get("name").toString(),
					itemCostObject.get("unit").toString(),
					Double.parseDouble(itemCostObject.get("quantity").toString())));
		});

		return items;
	}

	public JSONObject getNestedFetchData(String url) {
		try {

			String result = remoteURLReader.readFromUrl(url);
			return new JSONObject(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setApiPath(String apiPath) {
		this.url = apiPath;
	}

}