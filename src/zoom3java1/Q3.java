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
public class Q3 {

    public static void main(String[] args) {

        String str1 = "MATH 101 - GROUP 1";
        String str2 = "MATH 102 - GROUP 2";
         System.out.println("str2 = "+str2.length());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.indexOf('1'));
        System.out.println(str1.indexOf('1', 7));
        char ch = str1.charAt(str2.length() - 12);
        System.out.println("ch =" + ch);
        System.out.println(str1.charAt(str2.length() - 19)); 
        System.out.println(str1.substring(10).equals(str2.substring(10)));
        System.out.println(str2.toLowerCase());
        System.out.println(str1.toUpperCase());

    }
}
