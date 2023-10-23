package TP1;

public class Cercle {
	
	private Point centre;
	private double rayon;
	
	
	public Cercle(Point centre, double r) {
		this.centre = centre;
		this.rayon = r;
	}
	
	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}
	
	public String toString() {
		return "Rayon: " + this.rayon + ", Centre:" + this.centre.toString();
	}
	
	
	
}
