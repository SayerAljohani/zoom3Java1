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
public class Q4 {

    public static void main(String[] args) {
        String Name = "Sayaer";
        String value = "2.5";
        System.out.println("L= " + Name.length());
        
        System.out.println("LastLetter= " + Name.substring(5));
        System.out.println("LastLetter2= " + Name.substring(Name.length() - 1));
        
        System.out.println("ReplaceChar= " + Name.replace("ay", "*"));
        System.out.println("ReplaceString= " + Name.replace('a', '*'));
        
        System.out.println("Replace= " + Name.replaceFirst("a", "*"));
        
        System.out.println("ReplaceAll= " + Name.replaceAll("a", "*"));
        // double x =(double) value;
        double x = Double.parseDouble(value);
    }
}
