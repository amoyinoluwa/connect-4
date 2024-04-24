package Models;

import DataAccess.GameDataAccess;
import DataObject.GameDataObject;
import DomainObjects.GameDomainObject;

public class GameModel {
    // public boolean makeMove(PlayerDomainObject player, int column) {
    //     if (!validateMove(player, column)) return false;
    //     this.gameBoard[column] += 1;
    //     if (this.currentTurnPlayer == player1) {
    //         this.currentTurnPlayer = player2;
    //     } else this.currentTurnPlayer = player1;

    //     return true;
    // }

    // public boolean validateMove(PlayerDomainObject player, int column){
    //     if (player != this.currentTurnPlayer || column >= NUM_COLS || column < 0 || this.gameBoard[column] == NUM_ROWS) {
    //         return false;
    //     }
    //     return true;
    // }
    public static GameDomainObject AddGame(GameDomainObject game) {
        GameDataObject gameToAdd = new GameDataObject(game);
        GameDataAccess.AddGame(gameToAdd);
        return new GameDomainObject(gameToAdd);
    }

    public static GameDomainObject GetGameByGameId(int gameId) throws Exception {
        GameDataObject gameRetrieved = GameDataAccess.GetGameByGameId(gameId);
        if (gameRetrieved == null) {
            throw new Exception("Invalid GameId");
        }
        return new GameDomainObject(gameRetrieved);
    }
}
