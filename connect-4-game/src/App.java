import java.util.ArrayList;

import DataAccess.PlayerDataAccess;
import DataObject.PlayerDataObject;

public class App {
    public static void main(String[] args) throws Exception {
        PlayerDataAccess iniAccess = new PlayerDataAccess();
        PlayerDataObject player = new PlayerDataObject(1, "joseph", "joseph");
        PlayerDataAccess.AddPlayer(player);
        ArrayList<PlayerDataObject> allPlayers = PlayerDataAccess.GetAllPlayers();
        System.out.println("Hello, World!" + allPlayers.size());
    }
}
