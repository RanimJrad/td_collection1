package td_collection1;

import java.util.HashSet;

public class Titulaire {
	
	String nom;
    HashSet<Compte> comptes;

    Titulaire(String n) {
        nom = n;
        comptes = new HashSet<>();
    }

    void ajouterCompte(Compte compte) {
    	comptes.add(compte);
    }

    void afficheComptes() {
        for (Compte compte : comptes) {
            System.out.println("Compte numéro " + compte.numero);
        }
    }

    void deposer(int numeroCompte, double montant) {
        for (Compte compte : comptes) {
            if (compte.numero == numeroCompte) {
                compte.depot(montant);
                break;
            }
        }
    }

    void retirer(int numeroCompte, double montant) {
        for (Compte compte : comptes) {
            if (compte.numero == numeroCompte) {
                compte.retrait(montant);
                break;
            }
        }
    }

}
