package exo1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {
    @Test
    void additionTest(){
    Calculatrice c = new Calculatrice();
    assertEquals(3,c.addition(1,2));
}
    @Test
    void soustractionTest() {
        Calculatrice c = new Calculatrice();

        assertEquals(2, c.soustraction(5, 3));
    }

    @Test
    void multiplicationTest() {
        Calculatrice c = new Calculatrice();

        assertEquals(12, c.multiplication(4, 3));
    }

    @Test
    void divisionTest() {
        Calculatrice c = new Calculatrice();

        assertEquals(5, c.division(10, 2));
    }

    @Test
    void divisionParZeroTest() {
        Calculatrice c = new Calculatrice();

        assertThrows(
                ArithmeticException.class,
                () -> c.division(10, 0)
        );
    }
}
