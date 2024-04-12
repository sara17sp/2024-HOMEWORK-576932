package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;

public class PartitaTest {

    private Partita partita;
    
    @Before
    public void setUp() {
        this.partita = new Partita();
    }
    
    @Test
    public void testFinita() {
        partita.setCfu(0);
        assertTrue(partita.isFinita());
    }
    
    @Test
    public void testVittoria() {
        partita.getLabirinto().setStanzaCorrente(partita.getLabirinto().getUscita());
        assertTrue(partita.vinta());
    }
    
    @Test
    public void testSconfitta() {
        partita.getLabirinto().setStanzaCorrente(partita.getLabirinto().getEntrata());
        assertFalse(partita.vinta());
    }
}
