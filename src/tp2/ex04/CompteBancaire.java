package ex04;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde = solde + montant;
    }

    public void retirer(double montant)throws SoldeInsuffisantException {
        //c'est là où on lève une exception
        //doit lever
        //une SoldeInsuffisantException
        // (a creer) si le montant demande est superieur au solde
            if (montant > solde) {
                throw new SoldeInsuffisantException(
                        "Solde insuffisant"
                );
            }
            solde = solde - montant;
    }
}
