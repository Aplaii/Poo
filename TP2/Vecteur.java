package TP2;

public class Vecteur {
	private double dx;
	private double dy;
	private String nom;
	private final static double epsilon = 0.0001;
	
	public Vecteur (double x, double y, String nom) {
		this.setDx(x);
		this.setDy(y);
		this.setNom(nom);
	}
	
	public Vecteur (Point p1, Point p2, String nom) {
		double x = p2.getAbscisse()- p1.getAbscisse();
		double y = p2.getOrdonne() - p1.getOrdonne();		
		this.setDx(x);
		this.setDy(y);
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) {
		this.nom = n;
	}
	
	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}
	
	public String toString() {
		return "dx: "+this.dx + ", dy:" + this.dy;
	}
	
	public Vecteur addition (Vecteur v) {
		double x = this.getDx()+ v.getDx();
		double y = this.getDy() + v.getDy();
		return new Vecteur(x,y, this.getNom()+" "+ v.getNom());
	}
	
	public void scalaire(double s) {
		this.setDx(s*this.getDx());
		this.setDy(s * this.getDy());
	}
	
	public double norme () {
		return Math.sqrt((this.getDx()*this.getDx() + this.getDy()* this.getDy()));
	}
	
	public boolean comparaison1 (Vecteur v) {
		return (this.getDx() == v.getDx() ) && (this.getDy() == v.getDy());
	}
	
	public boolean comparaison2 (Vecteur v) {
		return (Math.abs(this.getDx() - v.getDx()) <= epsilon) && 
				(Math.abs(this.getDy() - v.getDy()) <= epsilon);
	}
	
	public boolean equals(Object v) {
		if (this == v) {
			return true;
		}
	if(! (v instanceof Vecteur) ){return false;}
	
		Vecteur vect=(Vecteur)v;
		return  Double.compare(vect.norme(), this.norme())==0;
	
	}
	
	public boolean equal(Vecteur v) {
		return (v.dx == this.getDx()) && (v.dy == this.getDy());
	}
	
	public void rotation (int angle) {
		
		this.setDx(Math.cos(angle)*this.getDx()- Math.sin(angle) * this.getDy());
		this.setDy(Math.sin(angle)*this.getDx() + Math.cos(angle) * this.getDy());
	}
	
	public boolean colineaire(Vecteur v) {
		return (Math.abs(this.getDx()/ v.getDx()) <= epsilon) && (Math.abs(this.getDy()/v.getDy()) <= epsilon);
		
	}
	
	public boolean orthogonal(Vecteur v) {
		return (this.getDx() * v.getDx() + this.getDy() * v.getDy()) == 0 ;
	}
	
	
	
}
