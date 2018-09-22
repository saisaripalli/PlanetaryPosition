package model;

public class PlanetaryRequest {
    
    private String dateOfBirth;
    private String timeOfBirth;
    private String latitude;
    private String longitude;
    
    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setTimeOfBirth (String timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }
    
    public void setLatitude (String latitude) {
        this.latitude = latitude;
    }
    
    public void setLongitude (String longitude) {
        this.longitude = longitude;
    }
    
    public String getDateOfBirth () {
        return dateOfBirth;
    }
    
    public String getTimeOfBirth () {
        return timeOfBirth;
    }
    
    public String getLatitude () {
        return latitude;
    }
    
    public String getLongitude () {
        return longitude;
    }
    
    @Override
    public String toString () {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("dateOfBirth", dateOfBirth)
                .add("timeOfBirth", timeOfBirth)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .toString();
    }
}
