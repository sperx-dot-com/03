public class IVBStation extends RentalService {

    private Station station;


    public Station getStation(){
        return  station;
    }

    public void setStation(Station station){
        this.station = station;
        notifySubscriber(station);
    }


}
