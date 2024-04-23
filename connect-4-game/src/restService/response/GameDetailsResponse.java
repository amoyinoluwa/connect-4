package restService.response;

import DomainObjects.GameDomainObject;

public class GameDetailsResponse {
    private final String errorMessage;
    // private final boolean requestStatus;
    private final int gameId;
    private final int playerOneId;
    private final int playerTwoId;
    // private final int currentTurnPlayer;
    // private final String gameStatus;
    // private final int gameWinner;

    // public GameDetailsResponse(int gameId) {
    //     this.gameId = gameId;
    // }

    public GameDetailsResponse(GameDomainObject gDomainObject) {
        this.errorMessage = null;
        this.gameId =  gDomainObject.GetGameId();
        this.playerOneId = gDomainObject.GetPlayerOne().getPlayerId();
        this.playerTwoId = gDomainObject.GetPlayerTwo().getPlayerId();
    }
    // public boolean getRequestStatus() {
    //     return this.requestStatus;
    // }

    public GameDetailsResponse(String errMsg) {
        this.errorMessage = errMsg;
        this.gameId = -1;
        this.playerOneId = -1;
        this.playerTwoId = -1;

    }
}
