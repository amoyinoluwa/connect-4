package DataAccess;

import java.util.ArrayList;

import DataObject.PlayerDataObject;
import DomainObjects.PlayerDomainObject;

public class PlayerDataAccess {
    private static ArrayList<PlayerDataObject> players = new ArrayList<PlayerDataObject>();
    private static int nextId = 0;

    public PlayerDataAccess() {
        initialize();
    }

    private void initialize() {
        players.add(new PlayerDataObject(1, "joseph", "joseph"));
        players.add(new PlayerDataObject(2, "dare", "dare"));
    }

    private static int getNextId() {
        int thisId = nextId;
        nextId++;
        return thisId;
    }

    public static ArrayList<PlayerDataObject> GetAllPlayers() {
        ArrayList<PlayerDataObject> allPlayers = new ArrayList<PlayerDataObject>();
        for (PlayerDataObject player: players) {
            allPlayers.add(new PlayerDataObject(player));
        }
        return allPlayers;
    }

    public static PlayerDataObject AddPlayer(PlayerDataObject player) {
        players.add(player);
        return player;
    }

    public static PlayerDataObject GetPlayerById(int id) {
        for (PlayerDataObject player: players) {
            if (player.getPlayerId() == id) {
                return new PlayerDataObject(player);
            }
        }
        return null;
    }

}
