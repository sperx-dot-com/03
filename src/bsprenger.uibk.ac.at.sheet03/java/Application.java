public class Application {

    public static void main(String[] args) {
        Subscriber bernie = new ConcreteSubscriber("Bernie");
        Subscriber kevin = new ConcreteSubscriber("Kevin");
        IVBStation uni = new IVBStation();
        uni.registerSubscriber(bernie);
        uni.registerSubscriber(kevin);
        Station uniklinik = new Station(24, 1);

        uni.setStation(uniklinik);

        IVBStation messe = new IVBStation();
        messe.registerSubscriber(bernie);
        Station messehalle = new Station(5, 2);
        messe.setStation(messehalle);




    }
}
