package restService.response;

public class GameDetailsResponse {
    private final String errorMessage;
    private final boolean requestStatus;
    private final int gameId;
    // private final int playerOneId;
    // private final int playerTwoId;
    // private final int currentTurnPlayer;
    // private final String gameStatus;
    // private final int gameWinner;

    public GameDetailsResponse(int gameId) {
        this.gameId = gameId;
        this.requestStatus = requestStatus;
        this.errorMessage = errorMessage;
    }

    public boolean getRequestStatus() {
        return this.requestStatus;
    }
}
