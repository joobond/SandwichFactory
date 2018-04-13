/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.factory.Snackbar;

import lanchonete.factory.Makeable;
import lanchonete.factory.Sandwich.SandwichJP;

/**
 *
 * @author Bond
 */
public class SnackbarJP extends Snackbar{

    @Override
    public Makeable createSandwich() {
        return new SandwichJP();
    }
    
}
