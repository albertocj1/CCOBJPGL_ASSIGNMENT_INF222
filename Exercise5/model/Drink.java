package model;

public class Drink {
    
    private String taste;
    private String alc_content;
    private String classification;

    public String getTaste(){
        return this.taste;
    }

    public String getAlcohol(){
        return this.alc_content;
    }

    public String getClassification(){
        return this.classification;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }

    public void setAlcohol(String alc_content){
        this.alc_content = alc_content;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }
    
}
