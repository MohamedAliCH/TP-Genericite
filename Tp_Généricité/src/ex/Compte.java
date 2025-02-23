package ex;

public class Compte<T> {
	protected int numCompte;
	protected double solde;
	protected T devise;
	public Compte(int numCompte,int solde,T devise) {
		this.numCompte=numCompte;
		this.solde=solde;
		this.devise = devise;
	}
	public void deposer(double montant) {
		solde+=montant;
	}
	
	public void retirer(double montant) {
		solde-=montant;
	}
	
	public void afficherSolde() {
		System.out.println("compte - solde ="+solde+devise);
	}
	
	public static void transfert(int montant,Compte c1,Compte c2) {
		c1.retirer(montant);
		c2.deposer(montant);
	}
	
}
