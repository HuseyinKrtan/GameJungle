package gameJungle;

public abstract class Location {


    Player player = new Player();

    String locationName ="";

    void location (){
        boolean onLocation =false;

    }


    public Location(Player player, String locationName) {
        this.player = player;
        this.locationName = locationName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
