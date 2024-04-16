import DeliverDrone.Drone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

public class DeliverDroneTest {
    private Drone drone;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        drone = new Drone();
    }

    @ParameterizedTest
    @CsvSource({
            "75, 100, 50, 100, 30",
            "101, 60, 50, 100, 30",
            "50, 70, 90, 60, 65"
    })
    @DisplayName("Should the drone get non fitting box measurements and return N")
    void shouldTheDroneGetNonFittingBoxAndWindowMeasurementsAndReturnN(int a, int b, int c, int h, int l) {
        drone.getMeasurements(a, b, c, h, l);
        drone.isBoxFitting();
        String printedOutput = outputStream.toString().trim();
        assertThat(printedOutput).isEqualTo("N");
    }

    @ParameterizedTest
    @CsvSource({
            "50, 30, 100, 80, 60",
            "30, 50, 80, 80, 60",
            "80, 60, 100, 80, 60"
    })
    @DisplayName("Should the drone get fitting box measurements and return S")
    void shouldTheDroneGetFittingBoxAndWindowMeasurementsAndReturnS(int a, int b, int c, int h, int l) {
        drone.getMeasurements(a, b, c, h, l);
        drone.isBoxFitting();
        String printedOutput = outputStream.toString().trim();
        assertThat(printedOutput).isEqualTo("S");
    }
}
