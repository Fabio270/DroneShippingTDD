import DeliverDrone.Drone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

public class DeliverDroneTest {
    @Test
    @DisplayName("Should the drone get non fitting box measurements and return N")
    void shouldTheDroneGetNonFittingBoxAndWindowMeasurementsAndReturnN(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Drone drone = new Drone();
        drone.getMeasurements(75, 100, 50, 100, 30);
        drone.isBoxFitting();
        String printedOutput = outputStream.toString().trim();
        assertThat(printedOutput).isEqualTo("N");
    }

    @Test
    @DisplayName("Should the drone get fitting box measurements and return S")
    void shouldTheDroneGetFittingBoxAndWindowMeasurementsAndReturnS(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Drone drone = new Drone();
        drone.getMeasurements(30, 50, 80, 80, 60);
        drone.isBoxFitting();
        String printedOutput = outputStream.toString().trim();
        assertThat(printedOutput).isEqualTo("S");
    }
}
