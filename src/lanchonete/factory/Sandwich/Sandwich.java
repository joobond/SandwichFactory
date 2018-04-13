/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.factory.Sandwich;

import lanchonete.factory.Makeable;

/**
 *
 * @author Bond
 */
public abstract class Sandwich implements Makeable{
    
    String bread;
    String cheese;
    String ham;
    boolean salad;
    
    @Override
    public abstract void prepare();
    
    @Override
    public abstract String getType();
    
    @Override
    public String toString(){
        String r = "Sandwich "+ this.getType() +" was prepared \n";
        r += "BREAD: " + this.bread + "\n";
        r += "CHEESE: " + this.cheese + "\n";
        r += "HAM: " + this.ham + "\n";
        r += "SALAD: " + (this.salad ? "Yes" : "No") + "\n";
        return r;
    }
}
