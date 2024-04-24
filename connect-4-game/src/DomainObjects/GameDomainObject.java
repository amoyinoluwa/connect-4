package DomainObjects;

import DataObject.GameDataObject;
import Models.PlayerModel;
import restService.request.CreateGameRequest;

public class GameDomainObject {
    private int gameId;
    private PlayerDomainObject player1;
    private PlayerDomainObject player2;
    private int currentTurnPlayer;
    private int winner;
    private String status;
    // private BoardDomainObject gameBoard;
    private String gameBoard;

    public GameDomainObject(int gameId, PlayerDomainObject player1, PlayerDomainObject player2, String status, String board) {
        this.gameId = gameId;
        this.player1 = player1;
        this.player2 = player2;
        this.currentTurnPlayer = player1.getPlayerId(); //player1 will always start
        this.status = status;
        this.gameBoard = board;
        this.winner = -1;
    }

    public GameDomainObject(GameDomainObject gameDomainObject) { //copy constructor
        this.gameId = gameDomainObject.gameId;
        this.player1 = gameDomainObject.player1;
        this.player2 = gameDomainObject.player2;
        this.gameBoard = gameDomainObject.gameBoard;
        this.currentTurnPlayer = gameDomainObject.currentTurnPlayer;
        this.status = gameDomainObject.status;
        this.winner = gameDomainObject.winner;
    }

    public GameDomainObject(GameDataObject gDataObject) {
        this.player1 = new PlayerDomainObject(gDataObject.player1);
        this.player2 = new PlayerDomainObject(gDataObject.player2);
        this.gameId = gDataObject.getGameId();
        this.winner = gDataObject.getWinner();
        this.currentTurnPlayer = gDataObject.getCurrentTurnPlayer();
        this.status = gDataObject.getStatus();
        this.gameBoard = gDataObject.getBoard();
    }

    public PlayerDomainObject GetPlayerOne() {
        return this.player1;
    }

    public PlayerDomainObject GetPlayerTwo() {
        return this.player2;
    }

    public int GetCurrentTurnPlayer() {
        return this.currentTurnPlayer;
    }

    public String GetGameBoard() {
        return this.gameBoard;
    }

    public int GetWinner() {
        return this.winner;
    }

    public String GetGameStatus() {
        return this.status;
    }

    public int GetGameId() {
        return this.gameId;
    }
}
