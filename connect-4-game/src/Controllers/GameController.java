package Controllers;

import DomainObjects.GameDomainObject;
import DomainObjects.PlayerDomainObject;
import Models.GameModel;
import Models.PlayerModel;
import restService.request.CreateGameRequest;
import restService.request.GameDetailsRequest;
import restService.response.CreateGameResponse;
import restService.response.GameDetailsResponse;

public class GameController {
    public GameDetailsResponse GetGameDetails(GameDetailsRequest request) {
        try {
            GameDomainObject gameDomain = GameModel.GetGameByGameId(request.getGameId());
            return new GameDetailsResponse(gameDomain);
        } catch (Exception ex) {
            return new GameDetailsResponse(ex.getMessage());
        }
    }

    public CreateGameResponse CreateGame(CreateGameRequest request) {
        try {
            PlayerDomainObject player1 = PlayerModel.GetPlayerById(request.getPlayer1Id());
            PlayerDomainObject player2 = PlayerModel.GetPlayerById(request.getPlayer2Id());
            GameDomainObject gameObject = new GameDomainObject(request.getGameId(), player1, player2, "Playing", "");
            GameDomainObject gameToReturn  = GameModel.AddGame(gameObject);
            return new CreateGameResponse(gameToReturn);
        } catch (Exception ex) {
            return new CreateGameResponse(ex.getMessage());
        }
    }
}
