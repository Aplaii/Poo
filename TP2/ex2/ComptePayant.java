package TP2;

public class ComptePayant extends CompteBancaire {
	public ComptePayant(int g) {
		super(g);
	}
	
	public ComptePayant(int g, int m) {
		super(g, m);
		
	}
	
	public void transfer(double m) {
		super.setSolde(super.getSolde() + m - 5);
	}
	
	public boolean virement (double m, CompteBancaire c) {
		if((m + 5) > super.getSolde()) {
			return false;
		}
		
		c.transfer(m-5);
		super.setSolde(super.getSolde()-m-5);
		return true;
		
	}
}
