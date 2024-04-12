package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {

	private Giocatore giocatore;
	private Borsa borsa;
	
	@Before
	public void setUp() {
		giocatore = new Giocatore(20, borsa);
	}
	
	@Test
    public void testGetBorsa() {
        assertEquals(borsa, giocatore.getBorsa());
    }

    @Test
    public void testGetCFU() {
        assertEquals(20, giocatore.getCFU());
    }

}
