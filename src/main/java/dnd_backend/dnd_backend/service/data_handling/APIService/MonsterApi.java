package dnd_backend.dnd_backend.service.data_handling.APIService;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.model.Monster;

import dnd_backend.dnd_backend.service.data_handling.RemoteURLReader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Component
public class MonsterApi {

    private ArrayList<Monster> Monsters = new ArrayList<>();
    @Autowired
    private RemoteURLReader remoteURLReader;




    public List<Monster> getMonstersTotal() throws IOException {

        this.setApiPath("https://www.dnd5eapi.co/api/monsters");
        String result = remoteURLReader.readFromUrl("");
        JSONObject json = new JSONObject(result);
        JSONArray jsonArray = json.getJSONArray("monsters");

        return Monsters;
    }

    public void setApiPath(String apiPath) {
        String url = "";
        url = apiPath;
    }


}
