package DomainObjects;

import DataObject.PlayerDataObject;

public class PlayerDomainObject {
    private int playerId;
    private String username;
    // private int gameId;

    public PlayerDomainObject(int playerId, String username, int gameId) {
        this.playerId = playerId;
        // this.gameId = gameId;
        this.username = username;
    }

    public PlayerDomainObject(PlayerDataObject pObject) {
        this.playerId = pObject.playerId;
        this.username = pObject.username;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    // public int getGameId() {
    //     return this.gameId;
    // }

    public String getPlayerUsername() {
        return this.username;
    }
}
