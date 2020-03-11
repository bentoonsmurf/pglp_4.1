package ex4_1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TEST_groupe {
	
	composite patron;
	personne employe1;
	personne employe2;
	groupe_de_personne g;
	groupe_de_personne g2;
	
	@Before
	public void init() {
	 patron =  new personne.builder("", "prenom", null, null, "placard").build();
	 employe1 =  new personne.builder("", "emp1", null, null, "placard").build();
	 employe2 =  new personne.builder("", "emp2", null, null, "placard").build();
	
	 g=new groupe_de_personne();
	g.add(patron);

	 g2=new groupe_de_personne();
	g.add(g2);
	g2.add(employe1);
	g2.add(employe2);
	}
	
	@Test 
	public void liste_nule() {

		assertFalse(g==null);
		assertFalse(g.getSubordoné()==null);

		assertFalse(g2==null);
		assertFalse(g2.getSubordoné()==null);

		assertFalse(patron==null);
		assertFalse(employe1==null);
		assertFalse(employe2==null);
		
	}
	@Test 
	public void nombre_de_personne() {
		assertEquals(g.getSubordoné().size() , 2);

		assertEquals(g2.getSubordoné().size() , 2);
		
	}
	
}
