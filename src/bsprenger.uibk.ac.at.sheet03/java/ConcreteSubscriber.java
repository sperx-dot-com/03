
public class ConcreteSubscriber implements Subscriber{

   private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(Station station) {
        System.out.format("Hello %s! Station %d has %d avaliable bikes\n", this.name, station.getStationID(), station.getNumberFreeBikes());
    }
}
