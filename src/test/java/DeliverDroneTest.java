import DeliverDrone.Drone;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeliverDroneTest {
    @Test
    @DisplayName("Should the drone get non fitting box measurements and return N")
    void shouldTheDroneGetBoxAndWindowMeasurementsAndReturnN(){
        Drone drone = new Drone();
        drone.getMeasurements(75, 100, 50, 100, 30);
        drone.isBoxFiting();
        Assertions.assertThat(drone.isBoxFiting()).isFalse();
    }

    @Test
    @DisplayName("Should the drone get fitting box measurements and return S")
    void shouldTheDroneGetBoxAndWindowMeasurementsAndReturnS(){
        Drone drone = new Drone();
        drone.getMeasurements(30, 50, 80, 80, 60);
        drone.isBoxFiting();
        Assertions.assertThat(drone.isBoxFiting()).isTrue();
    }
}
