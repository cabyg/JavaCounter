/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacounter;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaCounter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();

        System.out.println( number / 100 + (number % 100) / 10 + number % 10);
    }
}
        
