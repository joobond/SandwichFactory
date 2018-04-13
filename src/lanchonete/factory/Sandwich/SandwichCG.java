/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.factory.Sandwich;

/**
 *
 * @author Bond
 */
public class SandwichCG extends Sandwich{

    @Override
    public void prepare() {
        this.bread = "Integral Bread";
        this.cheese = "Cheese Plate";
        this.ham = "Chicken Ham";
        this.salad = !true;  
    }
    
    @Override
    public String getType() {
        return "CG";
    }
    
}
