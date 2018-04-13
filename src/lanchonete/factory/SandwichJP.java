/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.factory;

/**
 *
 * @author Bond
 */
public class SandwichJP extends Sandwich{
    
    @Override
    public void prepare() {
        this.bread = "French Bread";
        this.cheese = "Mozzarella Cheese";
        this.ham = "Chicken Ham";
        this.salad = !true;  
    }
    
    @Override
    public String getType() {
        return "JP";
    }
}
