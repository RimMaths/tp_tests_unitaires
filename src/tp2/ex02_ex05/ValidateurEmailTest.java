package ex02_ex05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateurEmailTest {

    // reecrivez les tests en utilisant @ParameterizedTest
    //avec @ValueSource ou @CsvSource pour tester au moins 6 emails differents (valides et invalides) en une
    //seule methode de test.
    @ParameterizedTest
    @CsvSource({
            "rim@gmail.com, true",
            "test@yahoo.fr, true",
            "user@outlook.com, true",
            "rimgmail.com, false",
            "rim@gmailcom, false",
            "bonjour, false"
    })
    void testerPlusieursEmails(String email, boolean resultatAttendu) {

        ValidateurEmail v = new ValidateurEmail();

        assertEquals(
                resultatAttendu,
                v.estValide(email)
        );
    }

}
