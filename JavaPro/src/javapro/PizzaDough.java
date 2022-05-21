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
public class PizzaDough {
    
     ArrayList <Ingredients> arr = new ArrayList<>(); 
    private int doughSize ; 
    private  double  doughCal ; 
     private double weight ;

    public PizzaDough() {
    }

    public PizzaDough(int doughSize, double doughCal, double weight) {
        this.doughSize = doughSize;
        this.doughCal = doughCal;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    public PizzaDough(int doughSize, double doughCal) {
        this.doughSize = doughSize;
        this.doughCal = doughCal;
    }


    public int getDoughSize() {
        return doughSize;
    }

    private void setDoughSize() {
        if(weight<300){
            doughSize=1;
            return;
        }
        if(weight<600){
            doughSize=2;
            return;
            
        }
        else doughSize=3;
    }

    public double getDoughCal() {
        return doughCal;
    }

    public void setDoughCal(double doughCal) {
        this.doughCal = doughCal;
    }
    
     public void add(Ingredients di ){
        arr.add(di); 
        doughCal += di.getCal();
        weight += di.getWeight(); 
        setDoughSize();
    }

    @Override
    public String toString() {
        return "PizzaDough{" + "doughSize=" + doughSize + ", doughCal=" + doughCal + '}';
    }

   
    
    
    
    
}
