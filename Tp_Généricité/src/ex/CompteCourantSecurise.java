package ex;

class AccesInterditException extends Exception{
	public AccesInterditException(String msg) {
		super(msg);
	}
}
public class CompteCourantSecurise<T> extends Compte<T>implements Securisable  {
	protected String id;

	public CompteCourantSecurise(int numCompte, int solde,String id,T devise) {
		super(numCompte, solde,devise);
		this.id=id;	
	}
	public Boolean verifierIdentite(String identifiant){
		if(id.equals(identifiant)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void afficherSolde() {
		System.out.println("compte securise - solde :"+solde+devise);
		}
	
	public void deposer(int montant,String id) throws AccesInterditException{
		if(!verifierIdentite(id)) {
			throw new AccesInterditException("acces interdit : id non valid");
		}
		else montant+=montant;
	}
	
	public void retirer(int montant,String id) throws AccesInterditException{
		if(!verifierIdentite(id)) {
			throw new AccesInterditException("acces interdit;id non valid");
		}
		else montant-=montant;
	}
		
	
	
	
}
