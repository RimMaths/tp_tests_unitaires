package ex03;

public class Compteur {
    private int valeur = 0;
    void incrementer(){
        valeur++;
    }
    void reinitialiser(){
        valeur = 0;
    }
    int getValeur(){
        return valeur;
    }

}
