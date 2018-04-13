/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.factory;

import java.util.Scanner;

/**
 *
 * @author Bond
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Makeable san = new SandwichFactory().mount(sc.next());
        san.prepare();
        System.out.println(san);
    }
    
}
