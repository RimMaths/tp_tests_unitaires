package ex04;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CompteBancaireTest {
    @Test
    void retraitNormalDiminueLeSolde()
            throws SoldeInsuffisantException {

        // Arrange
        CompteBancaire compte = new CompteBancaire(100.0);

        // Act
        compte.retirer(30.0);

        // Assert
        assertEquals(70.0, compte.getSolde());
    }

    @Test
    void retraitSuperieurAuSoldeLeveUneException() {

        // Arrange
        CompteBancaire compte = new CompteBancaire(50.0);

        // Act + Assert
        assertThrows(
                SoldeInsuffisantException.class,
                () -> compte.retirer(100.0)
        );
    }
}
