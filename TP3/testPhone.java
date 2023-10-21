package TP3;

public class testPhone {
    public static void main (String [] args) {

        FeaturePhone f1 = new FeaturePhone("Xiaomi", "S3", 769604161, "Bouygues");
        FeaturePhone f2 = new FeaturePhone("Xiaomi", "S3", 769688821, "Bouygues");
        // FeaturePhone f3 = new FeaturePhone("Xiaomi", "S2", 769688821, "Bouygues");

        SmartPhone s1 = new SmartPhone("Xiaomi", "S3", 88585884, "Orange", "Android", true, true);
        SmartPhone s2 = new SmartPhone("Xiaomi", "S3", 885141884, "Orange", "Android", true, true);

        // System.out.println(f1.equals(f2));
        // System.out.println(f2.equals(f3));

        FeaturePhone [] phones = {f1,f2,s1,s2};

        for (int i = 0; i<phones.length; i++){
            phones[i].setBloque(false);
            phones[i].affiche();
        }
        System.out.println("-------------");


            // Méthode foreach

        for (FeaturePhone featurePhone : phones) {
            featurePhone.setBloque(false);
            featurePhone.affiche();
        }

        Call c = new Call(f1, s2);
        System.out.println(c);

    }
}
