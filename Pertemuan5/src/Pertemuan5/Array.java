/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Array {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] anArray ={100,200,300,400,500,600,700,800,900,100};
        
        System.out.println("Element Pada Indeks 0 : " + anArray[0]);
        System.out.println("Element Pada Indeks 1 : " + anArray[1]);
        System.out.println("Element Pada Indeks 2 : " + anArray[2]);
        System.out.println("Element Pada Indeks 3 : " + anArray[3]);
        System.out.println("Element Pada Indeks 4 : " + anArray[4]);
        System.out.println("Element Pada Indeks 5 : " + anArray[5]);
        System.out.println("Element Pada Indeks 6 : " + anArray[6]);
        System.out.println("Element Pada Indeks 7 : " + anArray[7]);
        System.out.println("Element Pada Indeks 8 : " + anArray[8]);
        System.out.println("Element Pada Indeks 9 : " + anArray[9]);
        
        System.out.println("Menghitung Persigi ");
        int s1,s2,s3,s4;
        int luas;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukan Sisi Pertama : ");
        System.out.print("Sisi ke-1 : ");
        s1 = keyboard.nextInt();
        System.out.println("Masukan Sisi Kedua : ");
        System.out.print("Sisi ke-2 : ");
        s2 = keyboard.nextInt();
        System.out.println("Masukan Sisi Ketiga : ");
        System.out.print("Sisi ke-3 : ");
        s3 = keyboard.nextInt();
        System.out.println("Masukan Sisi Keempat : ");
        System.out.print("Sisi ke-4 : ");
        s4 = keyboard.nextInt();
        
        luas = s1+s2+s3+s4;
        
        System.out.println("Hasil Luas Perseginya Adalah : " +luas);
        
        
        
     
        
        
        
        
        
        
    }
}
