import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StationTest {

    @Test
    public void rentBike() {
        Station emptyStation = new Station(0, 1);
        Assertions.assertThrows(ArithmeticException.class, emptyStation::rentBike);

    }
}