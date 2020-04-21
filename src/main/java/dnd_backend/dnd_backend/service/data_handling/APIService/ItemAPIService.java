package dnd_backend.dnd_backend.service.data_handling.APIService;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.service.data_handling.RemoteURLReader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemAPIService {

	@Autowired
	private RemoteURLReader remoteURLReader;

	private final static int LIMIT_OF_ITEMS = 20;
	private String url = "";
	private ArrayList<Item> items = new ArrayList<>();

	public List<Item> getAllItems() throws IOException {

		this.setApiPath("https://www.dnd5eapi.co/api/equipment");
		String result = remoteURLReader.readFromUrl(url);
		JSONObject json = new JSONObject(result);
		JSONArray jsonArray = json.getJSONArray("results");
		addItemsToList(jsonArray);

		return items;
	}

	private void addItemsToList(JSONArray jsonArray) {
		for(int itemObjectIndex = 0; itemObjectIndex < LIMIT_OF_ITEMS; itemObjectIndex ++) {

			JSONObject itemObject = jsonArray.getJSONObject(itemObjectIndex);
			String itemUrl = itemObject.getString("url");

			JSONObject detailedItemObject = getNestedFetchData(itemUrl);
			JSONObject itemCostObject = (JSONObject) detailedItemObject.get("cost");

			Item assembledItemFromFetches = new Item(detailedItemObject.get("name").toString(),
					itemCostObject.get("unit").toString(),
					Double.parseDouble(itemCostObject.get("quantity").toString()));

			items.add(assembledItemFromFetches);
		}
	}

	private JSONObject getNestedFetchData(String url) {
		try {

			String result = remoteURLReader.readFromUrl("https://www.dnd5eapi.co" + url);
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