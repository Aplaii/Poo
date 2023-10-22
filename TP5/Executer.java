package TP5;
import java.util.List;
import java.util.ArrayList;

public class Executer {
    
    private List<Property> props = new ArrayList<>();


    public Executer(){

    }

    public void addProperty(Property p){
        this.props.add(p);
    }

    public List<Property> getProps(){
        return this.props;
    }

    public void getProperty(int n){
        System.out.println(this.props.get(n));
    }

    public int getNbVehicles(){
        int nb = 0;
        for(int i = 0; i < this.props.size(); i++){
            if(this.props.get(i) instanceof Vehicle){
                nb++;
            }
        }
        return nb;
    }

    public int getMensualite(){
        int v = 0;
        for(int i = 0; i < this.props.size(); i++){
            if(this.props.get(i) instanceof Housing){
                v+= this.props.get(i).getCostByMonth();
            }
        }
        return v;
    }

    public int getNbLoge(){
        int v = 0;
        for(int i = 0; i < this.props.size(); i++){
            if(this.props.get(i) instanceof Housing){
                Housing g = (Housing) this.props.get(i);
                v+= g.getNbPersonnes();
            }
        }
        return v;
    }

    public int getEntretienVehicle(){
        int v = 0;
        for(int i = 0; i < this.props.size(); i++){
            if(this.props.get(i) instanceof Vehicle){
                Vehicle g = (Vehicle) this.props.get(i);
                v += g.getCostByMonth();
            }
        }
        return v;
    }
    




}
