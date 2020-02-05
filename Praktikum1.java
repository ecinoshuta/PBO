/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner nama = new Scanner (System.in);
        System.out.print("Masukan Nama = ");
        String UserName = nama.nextLine ();
       
        
        
        Scanner umur = new Scanner (System.in);
        System.out.print("Masukan umur = ");
        int Umur = umur.nextInt ();
        
         System.out.println("Nama aink " + UserName);
        System.out.println("Umure Saya " + Umur);
        
       if (Umur <= 17)
       {System.out.println("Bocah");
       }
       else if (Umur > 17){
           System.out.println("Ketuaan");
       }
        }
    
}

