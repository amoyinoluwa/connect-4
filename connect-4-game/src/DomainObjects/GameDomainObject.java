package DomainObjects;

public class GameDomainObject {
    private int gameId;
    private String playerOneId;
    private String playerTwoId;
    private boolean gameStatus;
    private int[][] gameBoard;

    public GameDomainObject(int gameId, String playerOneId, String playerTwoId, int[][] gameBoard, boolean gameStatus) {
        this.gameId = gameId;
        this.playerOneId = playerOneId;
        this.playerTwoId = playerTwoId;
        this.gameBoard = gameBoard;
        this.gameStatus = gameStatus;
    }
}
