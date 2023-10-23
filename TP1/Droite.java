package TP1;

public class Droite {
	private double a;
	private double b;
	final static double epsilon = 0.0001;
	
	
	public Droite(Point p1, Point p2) {
		this.a = (p2.getOrdonne()-p1.getOrdonne())/ (p2.getAbscisse()-p1.getAbscisse());
		this.b = p1.getOrdonne() - (this.a * p1.getAbscisse());
	}
	
	public double getCoefficient() {
		return this.a;
	}
	
	public double getBias() {
		return this.b;
	}
	
	public boolean estParallele(Droite d) {
		return Math.abs(this.a - d.getCoefficient()) <= epsilon;
	}
	
	public boolean appartient (Point p) {
		return Math.abs(p.getOrdonne() - ((this.a*p.getAbscisse() + this.b))) <= epsilon; 
	}
	
	public Point intersection (Droite d) {
		double x = (d.getBias() - this.b)/(this.a - d.getCoefficient());
		double y = this.a * ((d.getBias()- this.b)-(this.a - d.getCoefficient())) + this.b;
		
		return new Point(x,y);
	}
	
	public String toString(){
		return "Coefficient: " + this.a + ", Point à l'origine: "+ this.b;
	}
}
