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
  public class MyLogger implements Logger{

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
    
    
}

