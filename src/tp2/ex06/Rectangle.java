package ex06;

public class Rectangle {
    private double largeur;
    private double hauteur;
    //constructeur
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    //getters
    public double getLargeur() {
        return largeur;
    }
    public void gethauteur() {
        this.hauteur = hauteur;
    }
    //methode aire
    public double aire() {
        return largeur * hauteur;
    }
    //methode perimetre
    public double perimetre() {
        return 2* (largeur + hauteur);
    }
}
