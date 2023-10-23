package TP1;

public class main {

	public static void main(String[] args) {
		Point p0 = new Point (1,5);
		Point p1 = new Point (1,0);
		
		Vecteur v0 = new Vecteur (1,1,"1.0");
		Vecteur v1 = new Vecteur (2,1, "1.2");
		// System.out.print(p0.translater(v0));
		
		System.out.println(v0.equals(v0));
		
		System.out.print(p0.moyen2(p1));

	}

}
