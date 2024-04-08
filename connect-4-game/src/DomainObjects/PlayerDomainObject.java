package DomainObjects;

public class PlayerDomainObject {
    private String playerId;
    private int gameId;

    public PlayerDomainObject(String playerId, int gameId) {
        this.playerId = playerId;
        this.gameId = gameId;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public int getGameId() {
        return this.gameId;
    }
}
