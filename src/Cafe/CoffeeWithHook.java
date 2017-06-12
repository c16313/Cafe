/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;
import java.util.Scanner;

/**
 *
 * @author c16313
 */
public class CoffeeWithHook extends CaffeinBevarageWithHook{
    
    Scanner stdIn = new Scanner(System.in);
    private int ans = 0;
    
    public void brew(){
        System.out.println("コーヒーを入れます。");
    }
    public void addCondiments(){
        System.out.println("砂糖とミルクを加えます。");
    }
    public boolean customerWantsCondiments(){
        System.out.print("砂糖とミルクを加えますか？ y(1)/n(0) ->");
        if(getUserInput() == 1) return true;
        else return false;
    }
    
    private int getUserInput(){
        ans = stdIn.nextInt();
        return ans;
    }
}
