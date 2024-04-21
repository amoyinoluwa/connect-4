package Models;

import java.util.ArrayList;

import DataAccess.PlayerDataAccess;
import DataObject.PlayerDataObject;
import DomainObjects.PlayerDomainObject;

public class PlayerModel {
    public static ArrayList<PlayerDomainObject> GetAllPlayers() {
        ArrayList<PlayerDataObject> playerList = PlayerDataAccess.GetAllPlayers();
        ArrayList<PlayerDomainObject> playersToReturn = new ArrayList<PlayerDomainObject>();
        for (PlayerDataObject player: playerList) {
            playersToReturn.add(new PlayerDomainObject(player));
        }
        return playersToReturn;
    }

    public PlayerDomainObject AddPlayer(PlayerDomainObject player) throws Exception {
        validate(player);
        PlayerDataObject playerToAdd = new PlayerDataObject(player);
        PlayerDataAccess.AddPlayer(playerToAdd);
        return new PlayerDomainObject(playerToAdd);
    }

    private void validate(PlayerDomainObject playerDomainObject) throws Exception {
        String pUsername =  playerDomainObject.getPlayerUsername();
        if (pUsername.length() < 6 || pUsername.length() > 20) {
            throw new Exception("Invalid username");
        }

    }
}
