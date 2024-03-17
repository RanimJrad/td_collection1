package td_collection1;

import java.util.ArrayList;

public class Banque {
	String nom;
    ArrayList<Compte> ListCompte;

    Banque(String n) {
        ListCompte = new ArrayList<>();
        nom = n;
    }

    void creerCompte(Titulaire titulaire, int numeroCompte) {
        Compte nouveauCompte = new Compte(numeroCompte);
        ListCompte.add(nouveauCompte);
        titulaire.ajouterCompte(nouveauCompte);
    }

    void afficheComptes() {
        for (Compte compte : ListCompte) {
            System.out.println("Compte dans la banque est numéro " + compte.numero);
        }
    }

}
