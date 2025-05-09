/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insurance;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Insurance {

    public static void main(String[] args) {
        //creating an object for the Scanner class
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the current year:  ");
        //CY stands for current year
        int CY=input.nextInt();
        System.out.println("Enter your birth year:  ");
        //BY stands for birth year
        int BY=input.nextInt();
        
        int premium =calculatePremium(CY,BY);
        //Displaying the  premium amount 
        System.out.println("Your annual premium is $" + premium);}
        public static int calculatePremium (int CY, int BY){
                    int age =CY-BY;
                    int decade =age/10;
                    int premium=(decade+15)*20;
                    return premium;
                    
        
                }
    }

