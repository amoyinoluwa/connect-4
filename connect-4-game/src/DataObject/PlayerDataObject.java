package DataObject;

import DomainObjects.PlayerDomainObject;

public class PlayerDataObject {
    public int playerId;
    public String username;

public PlayerDataObject(int playerId, String username) {
    this.playerId = playerId;
    this.username = username;
}

public PlayerDataObject(PlayerDomainObject pDomainObject) {
    this.playerId = pDomainObject.getPlayerId();
    this.username = pDomainObject.getPlayerUsername();
}

public PlayerDataObject(PlayerDataObject pDataObject) {
    this.playerId = pDataObject.playerId;
    this.username = pDataObject.username;
}
}