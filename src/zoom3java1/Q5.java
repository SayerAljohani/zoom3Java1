/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoom3java1;

/**
 *https://stacktraceguru.com/java/remove_spaces_from_string
 * @author sayee
 */
public class Q5 {
    public static void main(String[] args) {
        String str ="Hi, Sayer! How are you?";
        System.out.println("Result: " + str.replaceAll("\\s",""));
        System.out.println("Result: " + str.replaceAll(" ",""));
    }
}
