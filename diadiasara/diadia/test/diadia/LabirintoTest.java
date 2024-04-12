package diadia;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {

private Labirinto labirinto;
	
	@Before
	public void SetUp() {
		this.labirinto = new Labirinto();
		
		 Stanza Anticamera = new Stanza("Anticamera");
	     Stanza AulaStudio = new Stanza("AulaStudio");
	     this.labirinto.setStanzaCorrente(Anticamera);
	     this.labirinto.setUscita(AulaStudio);
	}
	
	@Test
	public void testGetStanzaCorrenteIniziale() {
		Stanza Anticamera = new Stanza("Anticamera");
		assertEquals(Anticamera.getNome(),this.labirinto.getStanzaCorrente().getNome());
	}
	
	@Test
	public void tesGetStanzaVincente() {
		Stanza AulaStudio = new Stanza("AulaStudio");
		assertEquals(AulaStudio.getNome(),this.labirinto.getUscita().getNome());
	}
	
	
	
	

}
