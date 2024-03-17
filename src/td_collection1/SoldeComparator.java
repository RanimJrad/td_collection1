package td_collection1;

import java.util.Comparator;


public class SoldeComparator implements Comparator<Compte>{
	
	public int compare(Compte c1, Compte c2) {
		if (c1.solde>c2.solde){
            return 1;
        }
        if (c1.solde<c2.solde){
            return -1;
        }
        return 0;
	}

}
