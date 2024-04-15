import DeliverDrone.Drone;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeliverDroneTest {
    @Test
    @DisplayName("Should the drone get non fitting box measurements and return N")
    void shouldTheDroneGetBoxAndWindowMeasurements(){
        Drone drone = new Drone();
        drone.getMeasurements(75, 100, 50, 100, 30);
        drone.isBoxFiting();
        Assertions.assertThat(drone.isBoxFiting()).isFalse();
    }
}
