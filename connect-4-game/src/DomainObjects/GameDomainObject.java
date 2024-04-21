package DomainObjects;

import DataObject.GameDataObject;
import DataObject.PlayerDataObject;

public class GameDomainObject {
    private int gameId;
    private PlayerDomainObject player1;
    private PlayerDomainObject player2;
    private PlayerDomainObject currentTurnPlayer;
    private PlayerDomainObject winner;
    private int cols = 7;
    private int rows = 6;
    private String gameState;
    private BoardDomainObject gameBoard;

    public GameDomainObject(int gameId, PlayerDomainObject player1, PlayerDomainObject player2) {
        this.gameId = gameId;
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard = new BoardDomainObject(rows, cols);
        this.currentTurnPlayer = player1; //player1 will always start
        this.gameState = GameDataObject.GAME_PLAYING;
        this.winner = null;
    }

    public GameDomainObject(GameDomainObject gameDomainObject) { //copy constructor
        this.gameId = gameDomainObject.gameId;
        this.player1 = gameDomainObject.player1;
        this.player2 = gameDomainObject.player2;
        this.gameBoard = gameDomainObject.gameBoard;
        this.currentTurnPlayer = gameDomainObject.currentTurnPlayer;
        this.gameState = gameDomainObject.gameState;
        this.winner = gameDomainObject.winner;
    }

    public GameDomainObject(GameDataObject gDataObject) {
        this.player1 = new PlayerDomainObject(gDataObject.player1);
        this.player2 = new PlayerDomainObject(gDataObject.player2);
    }

    public PlayerDomainObject GetPlayerOne() {
        return this.player1;
    }

    public PlayerDomainObject GetPlayerTwo() {
        return this.player2;
    }

    public PlayerDomainObject GetCurrentTurnPlayer() {
        return this.currentTurnPlayer;
    }

    public BoardDomainObject GetGameBoard() {
        return this.gameBoard;
    }

    public PlayerDomainObject GetWinner() {
        return this.winner;
    }

    public String GetGameState() {
        return this.gameState;
    }

    public int GetGameId() {
        return this.gameId;
    }
    //initialize game board with zeros?
    //add 1 each time a player makes a valid move in a column
    //validate whether move player can play, column is is in range
    //if column is full (gameBoard[col] == 6), return "column is full"
    //if board is full, this.gameState = GameDataObject.GAME_COMPLETE
}
