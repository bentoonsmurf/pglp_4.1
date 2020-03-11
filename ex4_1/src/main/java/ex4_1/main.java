package ex4_1;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// afficher
		personne p=new personne.builder("", "prenom", null, null, "placard").build();
		System.out.println(p.getPrenom());
	}

}
