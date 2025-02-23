package ex;

public class CompteCourant<T> extends Compte<T> {
	protected int limit;
	
	public CompteCourant(int numCompte,int solde,int limit,T devise) {
		super(numCompte,solde, devise);
		this.limit=limit;
	}
	
	public void retirer(double montant) {
		if(solde-montant>limit) {
			System.out.println("operation impossible");
		}
		else {
			solde-=montant;
		}
	}
	public void afficherSolde() {
		System.out.println("compte courant - solde :"+solde+" "+devise);
	}
}
