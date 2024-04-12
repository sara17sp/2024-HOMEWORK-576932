package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Giocatore;

public class Labirinto {
	private Stanza entrata;
	private Stanza uscita;

	
	private Stanza stanzaCorrente;
	private Giocatore giocatore;
	
	public Labirinto() {
		creaStanze();
		this.stanzaCorrente = entrata;
		this.entrata = entrata;
		this.uscita = uscita;
	}
	
	/**
     * Crea tutte le stanze e le porte di collegamento
     */
    private void creaStanze() {

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo macete = new Attrezzo("macete",1);
    	
		/* crea stanze del labirinto */
		Stanza anticamera = new Stanza("anticamera");
		Stanza ds2 = new Stanza("ds2");
		Stanza mensa = new Stanza("mensa");
		Stanza campus = new Stanza("campus");
		Stanza aulastudio = new Stanza("aulastudio");
		
		/* collega le stanze */
		anticamera.impostaStanzaAdiacente("nord", aulastudio);
		anticamera.impostaStanzaAdiacente("est", ds2);
		anticamera.impostaStanzaAdiacente("sud", mensa);
		anticamera.impostaStanzaAdiacente("ovest", campus);
		ds2.impostaStanzaAdiacente("est", campus);
		ds2.impostaStanzaAdiacente("ovest", anticamera);
		mensa.impostaStanzaAdiacente("nord", anticamera);
		mensa.impostaStanzaAdiacente("est", ds2);
		mensa.impostaStanzaAdiacente("ovest", campus);
		campus.impostaStanzaAdiacente("est", anticamera);
		campus.impostaStanzaAdiacente("ovest", ds2);
		aulastudio.impostaStanzaAdiacente("sud", anticamera);

        /* pone gli attrezzi nelle stanze */
		mensa.addAttrezzo(lanterna);
		anticamera.addAttrezzo(macete);

		// il gioco comincia nell'anticamera
        this.entrata = anticamera;  
		this.uscita = aulastudio;
    }

	public Giocatore getGiocatore() {
		return giocatore;
	}
	

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	public Stanza getUscita() {
		return uscita;
	}
	
	public Stanza getEntrata() {
		return entrata;
	}
	
	public void setUscita(Stanza uscita) {
		this.uscita = uscita;
	}
	
}
