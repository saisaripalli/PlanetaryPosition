package model;

import com.google.common.base.MoreObjects;

public class PlanetaryResponse {
    
    private String response;
    
    public String getResponse () {
        return response;
    }
    
    public void setResponse (String response) {
        this.response = response;
    }
    
    @Override
    public String toString () {
        return MoreObjects.toStringHelper(this)
                .add("response", response)
                .toString();
    }
}
