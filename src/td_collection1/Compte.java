package td_collection1;

public class Compte implements Comparable<Compte> {
	
	int numero;
    double solde;

    Compte(int numero) {
        this.numero = numero;
        solde = 0.0;
    }

    void retrait(double m) {
        solde = solde - m;
    }

    void depot(double m) {
        solde = solde + m;
    }
    
    public int compareTo(Compte c) {
    	if (this.solde>c.solde){
            return 1;
        }
        if (this.solde<c.solde){
            return -1;
        }
        return 0;
    }

}
