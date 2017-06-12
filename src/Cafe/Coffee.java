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
public class Coffee extends CaffeinBevarage{
    public void brew(){
        System.out.println("コーヒーを入れます。");
    }
    public void addCondiments(){
        System.out.println("砂糖とミルクを加えます。");
    }
}
