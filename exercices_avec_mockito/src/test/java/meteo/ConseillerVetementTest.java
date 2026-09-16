package meteo;

import org.example.meteo.ConseillerVetements;
import org.example.meteo.MeteoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ConseillerVetementTest {

    @Test
    void temperatureInferieureA10ConseilleManteau() {

        // Arrange
        MeteoService meteoMock = mock(MeteoService.class);

        when(meteoMock.getTemperature("Niort"))
                .thenReturn(5.0);

        ConseillerVetements conseiller =
                new ConseillerVetements(meteoMock);

        // Act
        String resultat =
                conseiller.conseiller("Niort");

        // Assert
        assertEquals(
                "Porter un manteau",
                resultat
        );

        verify(meteoMock)
                .getTemperature("Niort");
    }

    @Test
    void temperatureSuperieureA10ConseilleTenueLegere() {

        // Arrange
        MeteoService meteoMock = mock(MeteoService.class);

        when(meteoMock.getTemperature("Niort"))
                .thenReturn(18.0);

        ConseillerVetements conseiller =
                new ConseillerVetements(meteoMock);

        // Act
        String resultat =
                conseiller.conseiller("Niort");

        // Assert
        assertEquals(
                "Tenue legere",
                resultat
        );

        verify(meteoMock)
                .getTemperature("Niort");
    }
}