package Controllers;

import DomainObjects.GameDomainObject;
import Models.GameModel;
import restService.request.GameDetailsRequest;
import restService.response.GameDetailsResponse;

public class GameController {
    public static GameDetailsResponse GetGameDetails(GameDetailsRequest request) {
        try {
            GameDomainObject gameDomain = GameModel.GetGameByGameId(request.getGameId());
            return new GameDetailsResponse(gameDomain);
        } catch (Exception ex) {
            return new GameDetailsResponse(ex.getMessage());
        }
    }
}
