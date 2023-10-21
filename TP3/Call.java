package TP3;

public class Call {
    FeaturePhone n1;
    FeaturePhone n2;
    public Call(FeaturePhone n1, FeaturePhone n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public String toString(){
        return this.n1.getNum() + " - "+ this.n2.getNum();
    }

}
