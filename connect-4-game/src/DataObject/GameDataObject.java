package DataObject;

import DomainObjects.GameDomainObject;

public class GameDataObject {
    public final static String GAME_PLAYING = "Playing";
    public final static String GAME_COMPLETE = "Complete";
    public PlayerDataObject player1;
    public PlayerDataObject player2;
    public BoardDataObject board;
    public int gameId = 0;

    public GameDataObject(PlayerDataObject player1, PlayerDataObject player2, BoardDataObject board, int gameId) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.gameId = gameId;
    }

    public GameDataObject(GameDomainObject gDomainObject) {
        this.player1 = new PlayerDataObject(gDomainObject.GetPlayerOne());
        this.player2 = new PlayerDataObject(gDomainObject.GetPlayerTwo());
        this.board = new BoardDataObject(gDomainObject.GetGameBoard());
        this.gameId = gDomainObject.GetGameId();
    }

    public GameDataObject(GameDataObject gDataObject) {
        this.player1 = gDataObject.player1;
        this.player2 = gDataObject.player2;
        this.board = gDataObject.board;
        this.gameId = gDataObject.gameId;
    }
}
 