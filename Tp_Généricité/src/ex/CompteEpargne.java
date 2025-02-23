package ex;

public class CompteEpargne<T> extends Compte<T> {
	protected double tauxInteret;

	public CompteEpargne(int numCompte, int solde,double tauxInteret,T devise) {
		super(numCompte, solde,devise);
		this.tauxInteret=tauxInteret;
		
	}
	public void calculerInteret() {
		solde+=solde*tauxInteret;
	}
	public void afficherSolde() {
		System.out.println("compte epargne - solde :"+solde+" "+devise);
	}
	

}
