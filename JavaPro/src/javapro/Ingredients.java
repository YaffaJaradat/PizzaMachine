/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;

/**
 *
 * @author yaffa Jaradat
 */
public class Ingredients {
    private String name ; 
    private double weight ; 
    private double cal ;
    private Logger logger;
    
    
    public Ingredients(Logger logger){
        this.logger = logger;
        
    }
    
    public void setName(String name){
        this.logger.log("Ingredient name has changed");
        this.name = name;
    }

    public Ingredients() {
    }

    public Ingredients(String name, double weight, double cal) {
        this.name = name;
        this.weight = weight;
        this.cal = cal;
    }

    public Ingredients(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

  

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    @Override
    public String toString() {
        return  "   " + name + "   with Weight:  " + weight +"  gram"+ "   and Calories :  " + cal +" Calories " ;
    }
    
    
    
}
