package TP2.ex1;

public class Polyligne {
	Point [][] points;

	public Polyligne(Point [][] p) {
		this.points = p;
	}
		
	
	public Point [][] getPoints(){
		return this.points;
	}
	
	public void setPoints(Point [][] p) {
		this.points = p;
	}
	
	public int nbPoints() {
		return points.length;
	}
	
	public void translate(Vecteur v) {
		for (int i = 0; i < points.length; i++) {
			points[i][0].translater(v);
		}
	}
	
	public boolean polygone() {
		
		for (int i = 0; i < points.length-1; i++) {
			if (points[i][1] != points[i+1][0]) {
				return false;
			}
		}
		return points[0][0] == points[-1][1];
	}
	
	public void SurE () {
		Point [] [] newlist = new Point [points.length*2][2];
		for (int i = 0; i < (points.length)-1; i++) {
			Point p0 = points[i][0];
			Point p1 = points[i][1];
			Point np = p0.moyen1(p1);
			Point [] a = {p0, np};
			Point [] b = {np, p1};
			newlist[i+i] = a;
			newlist[i+i+1] = b;
		}
		Point c = points[0][0].moyen1(points[-1][1]);
		Point [] d = {points[-1][1], c};
		Point [] e = {c, points[0][0]};
		newlist[-2] = d;
		newlist[-1] = e;
	}
	
	public String toString() {
		String res = "";
		for (int i = 0; i < points.length; i++) {
			res += "" + this.points[i] + " - ";
		}
		return res;
	}
	
		
	
}
