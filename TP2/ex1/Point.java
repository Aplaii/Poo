package TP2;

public class Point {
	private double x;
	private double y;
	private final static double epsilon = 0.0001;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public double getAbscisse() {
		return this.x;
	}
	
	public double getOrdonne() {
		return this.y;
	}
	
	public boolean estConfondu(Point p) {
		
		return (Math.abs(this.x - p.getAbscisse())<=epsilon) && (Math.abs(this.y - p.getOrdonne())<=epsilon);
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow((this.x-p.getAbscisse()),2)+Math.pow((this.y - p.getOrdonne()),2));
	}
	
	public String toString() {
		return "x: " + this.x +", y: " +this.y;
	}	
	
	public Point translater (Vecteur v) {
		double dx = v.getDx();
		double dy = v.getDy();
		return new Point(this.x + dx, this.y + dy);
	}
	
	public Point moyen1(Point p) {
		double x = (this.x + p.getAbscisse()) / 2;
		double y = (this.y + p.getOrdonne()) / 2;
		return new Point(x,y);
	}
	
	public Point moyen2 (Point p) {
		double dx = (p.getAbscisse()- this.x) / 2;
		double dy = (p.getOrdonne() - this.y) / 2;
		Vecteur v = new Vecteur(dx, dy, "vecteur");
		return translater(v);
	}
}
