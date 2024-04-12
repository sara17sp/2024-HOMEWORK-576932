package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest{

    private Borsa borsa;

    @Before
    public void setUp(){
        borsa = new Borsa();
    }

    @Test
    public void testBorsaEmpty() {
        assertTrue(borsa.isEmpty());
    }

    @Test
    public void testVerificaPeso() {
        assertFalse(borsa.addAttrezzo(new Attrezzo("Prova", (borsa.getPesoMax() + 1))));
    }

    @Test
    public void testRemoveAttrezzo() {
        assertEquals(null, borsa.removeAttrezzo("not_found"));
    }

}
