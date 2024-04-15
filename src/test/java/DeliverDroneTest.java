import DeliverDrone.Drone;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeliverDroneTest {
    @Test
    @DisplayName("Should the drone get non fitting box measurements and return N")
    void shouldTheDroneGetNonFittingBoxAndWindowMeasurementsAndReturnN(){
        Drone drone = new Drone();
        drone.getMeasurements(75, 100, 50, 100, 30);
        drone.isBoxFitting();
        Assertions.assertThat(drone.isBoxFitting()).isFalse();
    }

    @Test
    @DisplayName("Should the drone get fitting box measurements and return S")
    void shouldTheDroneGetFittingBoxAndWindowMeasurementsAndReturnS(){
        Drone drone = new Drone();
        drone.getMeasurements(30, 50, 80, 80, 60);
        drone.isBoxFitting();
        Assertions.assertThat(drone.isBoxFitting()).isTrue();
    }
}
