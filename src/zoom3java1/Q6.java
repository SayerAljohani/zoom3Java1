/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoom3java1;

/**
 *
 * @author sayee
 */
public class Q6 {

    public static void main(String[] args) {
        double x;
        x = Math.abs(5.55);
        System.out.println("Math.abs(5.55)=" + x);
        
        x = Math.floor(-6.67);
        System.out.println("Math.floor(-6.67)=" + x);
        
        x = Math.abs(0);
        System.out.println("Math.abs(0)=" + x);
        
        x = Math.ceil(0.0);
        System.out.println("Math.ceil(0.0)=" + x);
        
        x = Math.abs(-6.67);
        System.out.println("Math.abs(-6.67)" + x);
        
        x = Math.ceil(-6.67);
        System.out.println("Math.ceil(-6.67))=" + x);
        
        x = Math.ceil(-Math.abs(-14 + Math.floor(-7.5)));
        System.out.println("Math.ceil(-Math.abs(-14 + Math.floor(-7.5)))=" + x);
    }
}
