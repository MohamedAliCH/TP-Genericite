package ex;

public class Test {

	public static void main(String[] args) {
	GestionnaireDeComptes gestion = new GestionnaireDeComptes();	
	Compte<String>c1=new Compte<String>(1,2000,"EUR");
	CompteCourant<String>c2=new CompteCourant<String>(2,3000,-2000,"EUR");
	CompteCourantSecurise<String>c3=new CompteCourantSecurise<String>(3,4500,"mohamed","EUR");
	CompteEpargne<String>c4=new CompteEpargne<String>(3,5900,1,"EUR");
	gestion.ajouterCompte(c1);
    gestion.ajouterCompte(c2);
    gestion.ajouterCompte(c3);
    gestion.ajouterCompte(c4);
	try {
		c3.deposer(400,"mohame");
	}catch(AccesInterditException ex) {
		System.out.println(ex.getMessage());
	}
	c4.calculerInteret();
	Compte.transfert(400,c1,c2);
	gestion.afficherComptes();
	}

}
