package ex4_1;

public abstract class composite {
	
	public abstract String getNom();
	
	void parcourProfondeur(composite p) {
		System.out.println(p.getNom());
	}
	void parcourProfondeur(groupe_de_personne g) {
		int i=0;
		while (i<g.getSubordoné().size()) {
			parcourProfondeur(g.getSubordoné().get(i));// liste de composite
			i++;
		}
	}
	
}
