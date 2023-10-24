package TP2.ex2;

public class CompteEpargne extends CompteBancaire{
	
	double interet = 0;
	
	public CompteEpargne(int g) {
		super(g);
	}
	
	public CompteEpargne(int g, int m) {
		super(g, m);
	}
	
	public void setInteret(int i) {
		this.interet = i;
	}
	
	public void calculInteret() {
		this.setSolde(getSolde() * (1+interet/100));
	}


}
