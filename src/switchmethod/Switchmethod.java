/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchmethod;


import java.util.Scanner;

/**
 *
 * @author user
 */
public class Switchmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        afficherMenu();
        int choice = scan.nextInt();
      
        affichCapital(choice);

    }

    static void afficherMenu() {
        String m = "";
        System.out.print("1.cuba" + "\n" + "2.gabon" + "\n" + "3.norvege" + "\n" + "4.salvador" + 
                "\n" + "5.bresil" + "\n" + "6.iran" + "\n" + "entrez votre choix :");
    }

    static void affichCapital(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Havanna"); 
                break;
            case 2:
                System.out.println("Libreville");
            break;
            case 3:
                System.out.println("Oslo");
            break;
            case 4:
                System.out.println("San salvador");
            break;
            case 5:
                System.out.println("Rio");
            break;
            case 6:
                System.out.println("Teheran");
                break;
        

       
    }
       
    }
    }
