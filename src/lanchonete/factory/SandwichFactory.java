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
public class SandwichFactory {
    
    public Makeable mount(String type){
        switch(type){
            case "CG": return new SandwichCG(); 
            case "JP": return new SandwichJP(); 
            case "RT": return new SandwichRT(); 
            default: return null;
        }
    }
}
