public class Application {

    public static void main(String[] args) {
        Subscriber bernie = new ConcreteSubscriber("Bernie");
        Subscriber kevin = new ConcreteSubscriber("Kevin");

        StationObserver uni = new StationObserver();
        uni.registerSubscriber(bernie);
        uni.registerSubscriber(kevin);

        Station uniklinik = new Station(1, 1);
        uni.setStation(uniklinik);

        uniklinik.rentBike();
        uni.setStation(uniklinik);

        StationObserver messe = new StationObserver();
        messe.registerSubscriber(bernie);
        Station messehalle = new Station(5, 2);
        messe.setStation(messehalle);




    }
}
