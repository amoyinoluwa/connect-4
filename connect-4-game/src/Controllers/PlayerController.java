package Controller;

import java.util.ArrayList;

import restService.request.RegisterPlayerRequest;
import restService.response.PlayerResponse;


public class PlayerController {
   
    
    public static PlayerResponse registerPlayer(RegisterPlayerRequest request){

        try{
            //clearly this will cause errors!
            return new PlayerResponse();

        } catch (Exception ex) {

            PlayerResponse response = new PlayerResponse();
            return response;
        }
    }
}
