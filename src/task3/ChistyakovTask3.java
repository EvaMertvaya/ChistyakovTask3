/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ChistyakovTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите ваше имя: ");
        String name1 = input.nextLine();
       
        System.out.println("Введите вашу фамилию: ");
        String name2 = input.nextLine();
       
        System.out.println("Введите ваш год рождения: ");
        String year = input.nextLine();
       
       
        System.out.println("Введите ваш месяц рождения(На английском): ");
        String month = input.nextLine();
       
        System.out.println("Введите ваш день рождения: ");
        String day = input.nextLine();
       
        System.out.printf(name1 +" "+ name2 + " родился "+ day +" "+ month +" "+ year +" "+"года");
    }
   
}
        
    
    
}
