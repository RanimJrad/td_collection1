package td_collection1;

import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		Banque b = new Banque("ATB");

        Titulaire t1 = new Titulaire("Ranim");
        Titulaire t2 = new Titulaire("Ahmed");

        b.creerCompte(t1, 1001);
        b.creerCompte(t2, 2001);

        t2.deposer(2001, 1670);
        t1.deposer(1001, 500);
        t2.retirer(1002, 200);
        
        

        b.afficheComptes();
        t1.afficheComptes();
        t2.afficheComptes();
        
        System.out.println("apres trie");
        SoldeComparator CS =new SoldeComparator();
        Collections.sort(b.ListCompte,CS);
        
        for (Compte compte : b.ListCompte) {
            System.out.println("Compte numéro " + compte.numero + " - Solde : " + compte.solde);
        }
	}

}
