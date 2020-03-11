package ex4_1;


import java.util.ArrayList;
import java.util.List;

public class groupe_de_personne extends composite{

	private final List<composite> groupe;
	
	public groupe_de_personne() {
		this.groupe=new ArrayList<composite>();
	}
	
	public List<composite> getSubordoné() {
		return groupe;
	}
	public void add(composite e) {
		this.groupe.add(e);
	}
	
	public String getNom() {
		return "";
		
	
	}
	
}
