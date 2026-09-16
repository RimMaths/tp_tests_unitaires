package ex03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class CompteurTest {
    private Compteur compteur;
    @BeforeEach
    void setUp() {
        compteur = new Compteur();
        System.out.println("Debut du test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Fin du test");
    }

    @Test
    void valeurInitialeEstZero() {
        assertEquals(0, compteur.getValeur());
    }

    @Test
    void incrementerUneFoisDonneUn() {
        compteur.incrementer();

        assertEquals(1, compteur.getValeur());
    }

    @Test
    void incrementerTroisFoisPuisReinitialiserDonneZero() {
        compteur.incrementer();
        compteur.incrementer();
        compteur.incrementer();

        compteur.reinitialiser();

        assertEquals(0, compteur.getValeur());
    }


}
