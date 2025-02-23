package ex;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class GestionnaireDeComptes {
    private HashMap<Integer, Compte<?>> comptes;
    public GestionnaireDeComptes() {
        comptes = new HashMap<>();
    }
    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numCompte, compte);
    }
    public Compte<?> rechercherCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }
    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }
    public void afficherComptes() {
        ArrayList<Compte<?>> listeComptes = new ArrayList<>(comptes.values());
        Collections.sort(listeComptes, new Comparator<Compte<?>>() {
            public int compare(Compte<?> c1, Compte<?> c2) {
                return Double.compare(c2.solde, c1.solde);
            }
        });
        for (Compte<?> compte : listeComptes) {
            compte.afficherSolde();
        }
    }
}
