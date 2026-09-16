package ex08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void convertir1Retourne1() {


        assertEquals("1", fizzBuzz.convertir(1));
    }

    @Test
    void convertir3RetourneFizz() {

        assertEquals("Fizz", fizzBuzz.convertir(3));
    }

    @Test
    void convertir5RetourneBuzz() {

        assertEquals("Buzz", fizzBuzz.convertir(5));
    }

    @Test
    void convertir15RetourneFizzBuzz() {
        

        assertEquals("FizzBuzz", fizzBuzz.convertir(15));
    }
}
