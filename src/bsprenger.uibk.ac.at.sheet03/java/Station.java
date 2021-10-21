public class Station {
    private int numberFreeBikes;
    private int stationID;

    public Station(int numberFreeBikes, int stationID) {
        this.numberFreeBikes = numberFreeBikes;
        this.stationID = stationID;
    }

    public int getNumberFreeBikes() {
        return numberFreeBikes;
    }

    public void setNumberFreeBikes(int numberFreeBikes) {
        this.numberFreeBikes = numberFreeBikes;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }
}
