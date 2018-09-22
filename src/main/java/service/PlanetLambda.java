package service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.PlanetaryRequest;
import model.PlanetaryResponse;

public class PlanetLambda implements RequestHandler<PlanetaryRequest, PlanetaryResponse> {
    
    @Override
    public PlanetaryResponse handleRequest (PlanetaryRequest planetaryRequest, Context context) {
        //context.getLogger().log("got request "+planetaryRequest.toString());
        PlanetaryResponse planetaryResponse = new PlanetaryResponse();
        planetaryResponse.setResponse(planetaryRequest.getDateOfBirth());
        return planetaryResponse;
    }
}
