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
public abstract class CaffeinBevarage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("お湯を沸かします。");
    }
    public abstract void brew();
    public void pourInCup(){
        System.out.println("カップに注ぎます。");
    }
    public abstract void addCondiments();
}
