package ex4_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TEST_personne {
	
//	personne p=new personne.builder("", "prenom", null, null, "placard").build();


	private personne LeBricoleur;
	@Before
	public void init() {
		LeBricoleur =  new personne.builder("", "prenom", null, null, "placard").build();
		
	}
	@Test
	public void testCreation() {
		assertFalse(LeBricoleur == null);// aucun bricoleur ne peut etre null 
										// ca n'a pas de sens mais je test quand meme
		
	}
	@Test
	public void test_prenom() {
		assertEquals(LeBricoleur.getPrenom() ,"prenom");
	}

	@Test
	public void test_modif_prenom() {
		personne LeMaconneur =  new personne.builder("", "prenom", null, null, "placard").prenom("LeGenieDuBeton").nom("bob").build();
		
		assertEquals(LeMaconneur.getPrenom() ,"LeGenieDuBeton");
		assertEquals(LeMaconneur.getNom() ,"bob");
		
	}
	@Test
	public void TEST_numero() {
	assertNull(	LeBricoleur.getNum_tel());
		
	}

	
}
