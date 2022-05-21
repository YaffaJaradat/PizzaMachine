/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;

import java.util.ArrayList;


/**
 *
 * @author yaffa Jaradat
 */
public class PizzaPan {
    private int panSize ;
    private String type ; 
    private  double  panCal ; 
    private PizzaDough dough ; 
    private double weight;
     private Logger logger;
    
    public PizzaPan(Logger logger){
        this.logger = logger;
    }
    
    public void addIngreident(){
        this.logger.log("Ingreident was added");
    }

    
    ArrayList<Ingredients> arr = new ArrayList<>();
    
    public PizzaPan() {
    }

//    public PizzaPan(Size panSize, String type, double panCal, PizzaDough dough) {
//        this.panSize = panSize;
//        this.type = type;
//        this.panCal = panCal;
//        this.dough = dough;
//    }

    public PizzaPan( int panSize, String type, double panCal, PizzaDough dough, double weight) {
        this.panSize = panSize;
        this.type = type;
        this.panCal = panCal;
        this.dough = dough;
        this.weight = weight;
    }

    public PizzaPan(double panCal, PizzaDough dough) {
        //        this.panSize = panSize;
        this.panCal = panCal;
        this.dough = dough;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

    public int getPanSize() {
        return panSize;
    }

    public void setPanSize(int panSize) {
        this.panSize = panSize;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPanCal() {
        return panCal;
    }

    public void setPanCal(double panCal) {
        this.panCal = panCal;
    }

    public PizzaDough getDough() {
        return dough;
    }

    public void setDough(PizzaDough dough) {
        this.dough = dough;
    }
     public void pour(PizzaDough d)throws PanDoesnotFitTheDoughException{
        if(d.getDoughSize()>panSize){
            throw new PanDoesnotFitTheDoughException();
            /* we choosed > not = because we can put a small dough in a medium pan*/
        }
             this.dough = d; 
             panCal+= d.getDoughCal(); 
             weight+= d.getWeight(); 
        
        
     }
       public void add(Ingredients pi) throws AmountNotRecommendedException {
        if(pi.getWeight()>pi.getWeight()*panSize){
            /* if the pizza was medium => reco weight will double*/
            throw new AmountNotRecommendedException();
        }
        arr.add(pi);
        panCal += pi.getCal();
        weight += pi.getWeight();
    }

    @Override
    public String toString() {
        return "PizzaPan{" + "panSize=" + panSize + ", type=" + type + ", panCal=" + panCal + ", dough=" + dough + '}';
    }
    
}
