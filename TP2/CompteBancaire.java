package TP2;

public class CompteBancaire {
	private double solde;
	private int identif;
	
	public CompteBancaire (int g) {
		this.setSolde(0);
		this.identif = g;
	}
	
	public CompteBancaire (int g, int m) {
		this.setSolde(m);
		this.identif = g;
	}
	
	public boolean virement(int m, CompteBancaire c) {
		if(m < getSolde()) {
			return false;
		}
	c.transfer(m);
	this.setSolde(this.getSolde() - m);
	return true;
	
	}
	
	public void transfer(double d) {
		if(d < 0) {return;}
		this.setSolde(this.getSolde() + d);
	}
	
	public String toString() {
		return "Solde: "+ this.getSolde() + "\nIdentif: " + this.identif;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double d) {
		this.solde = d;
	}
	
}
