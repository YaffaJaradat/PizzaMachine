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
public class AmountNotRecommendedException extends Exception{
       @Override
    public String getMessage(){
        return "Too much used , choose less amount";
    } 
}
