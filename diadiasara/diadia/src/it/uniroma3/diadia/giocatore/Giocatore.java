package it.uniroma3.diadia.giocatore;

public class Giocatore {
	private int CFU;
	private Borsa borsa;
	
	public Giocatore(int CFU, Borsa borsa) {
		this.borsa = borsa;
		this.CFU = CFU;
	}
	
	public Borsa getBorsa() {
		return borsa;
	}
	
	 
	public int getCFU() {
		return CFU;	
	} 
	
	  
	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}
	 
	public void setCFU(int cFU) {
		CFU = cFU;
	}
}
