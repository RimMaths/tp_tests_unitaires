package ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateurEmailTest {

    @Test
    void emailValideTest() {
        ValidateurEmail v = new ValidateurEmail();

        assertTrue(v.estValide("rim@gmail.com"));
    }

    @Test
    void emailSansArobaseTest() {
        ValidateurEmail v = new ValidateurEmail();

        assertFalse(v.estValide("rimgmail.com"));
    }

    @Test
    void emailNullTest() {
        ValidateurEmail v = new ValidateurEmail();

        assertFalse(v.estValide(null));
    }

    @Test
    void emailVideTest() {
        ValidateurEmail v = new ValidateurEmail();

        assertFalse(v.estValide(""));
    }
}
