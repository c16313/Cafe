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
public class Tea extends CaffeinBevarageWithHook{
    
    Scanner stdIn = new Scanner(System.in);
    public int ans;
    
    public void brew(){
        System.out.println("紅茶を浸します。");
    }
    public void addCondiments(){
        if(ans == 0)
            System.out.println("レモンを加えます。 レモンティーです。");
        if(ans == 1)
            System.out.println("ミルクを加えます。 ミルクティーです。");
        if(ans == 2)
            System.out.println("ストレートティーです。");
    }
    public boolean customerWantsCondiments(){
        System.out.print("レモンかミルク？ レモン(0)/ミルク(1)/なし(2) ->");
        if(getUserInput() == 0) return true;
        else return false;
    }
    
    private int getUserInput(){
        ans = stdIn.nextInt();
        return ans;
    }
}
