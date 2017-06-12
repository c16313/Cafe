/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;

/**
 *
 * @author c16313
 */
public class BevarageTest {
    public static void main(String[] args) {
        Tea mytea = new Tea();
        mytea.prepareRecipe();
        System.out.println();
        
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
        System.out.println();
        
        CoffeeWithHook customerCoffee = new CoffeeWithHook();
        customerCoffee.prepareRecipe();
    }
}
