package ex3;

import java.util.ArrayList;

public class Evaluation extends Ressource {

    protected ArrayList<String> questions = new ArrayList<String>();
    protected ArrayList<String> reponses = new ArrayList<String>();
    
    Evaluation(String u){
        super(u);
    }

    public void addQuestion(String q){
        this.questions.add(q);
    }

    public void addReponse(String r){
        this.questions.add(r);
    }

    public ArrayList<String> LireQuestions(){
        return this.questions;
    }

    public ArrayList<String> LireReponses(){
        return this.reponses;
    }

}
