import java.util.ArrayList;
import java.util.List;

public abstract class RentalService {

    private List<Subscriber> subsrciberList = new ArrayList<Subscriber>();

    public void notifySubscriber(Station station){
        for (Subscriber subscriber: subsrciberList){
            subscriber.update(station);
        }
    }

    public void  registerSubscriber(Subscriber subscriber){
        subsrciberList.add(subscriber);
    }

    public void  removerSubscriber(Subscriber subscriber){
        subsrciberList.remove(subscriber);
    }
}
