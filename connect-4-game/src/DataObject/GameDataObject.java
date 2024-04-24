package DataObject;

import DomainObjects.GameDomainObject;

public class GameDataObject {

    public PlayerDataObject player1;
    public PlayerDataObject player2;
    public String board;
    public int gameId;
    public int winner;
    public int currentTurnPlayer;
    public String status;


    // public GameDataObject(PlayerDataObject player1, PlayerDataObject player2, String board, int gameId) {
    //     this.player1 = player1;
    //     this.player2 = player2;
    //     this.board = board;
    //     this.gameId = gameId;
    // }

    public GameDataObject(GameDomainObject object) {
        this.gameId = object.GetGameId();
        this.player1 = new PlayerDataObject(object.GetPlayerOne());
        this.player2 = new PlayerDataObject(object.GetPlayerTwo());
        this.board = object.GetGameBoard();
        this.gameId = object.GetGameId();
        this.winner = object.GetWinner();
        this.currentTurnPlayer = object.GetCurrentTurnPlayer();
        this.status = object.GetGameStatus();
    }

    public GameDataObject(GameDataObject object) {
        this.player1 = object.player1;
        this.player2 = object.player2;
        this.board = object.board;
        this.gameId = object.gameId;
        this.winner = object.winner;
        this.currentTurnPlayer = object.currentTurnPlayer;
        this.status = object.status;
    }

    public int getWinner() {
        return this.winner;
    }

    public int getGameId() {
        return this.gameId;
    }

    public int getCurrentTurnPlayer() {
        return this.currentTurnPlayer;
    }

    public String getStatus() {
        return this.status;
    }

    public String getBoard() {
        return this.board;
    }
}
 