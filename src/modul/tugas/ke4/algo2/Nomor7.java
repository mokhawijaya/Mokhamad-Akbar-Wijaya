/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.tugas.ke4.algo2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nomor7 {
     public  static  void tampil(int []data){
         
     for(int i=0; i<data.length; i++){
                System.out.print(data[i]+ " ");
     }
     System.out.println();
     }
     
    public  static  void Sorting(int []A){
         for(int i=1; i<A.length; i++){
          int key = A[i];
          int j = i-1;
          while ((j>= 0) &&  (A[j]>key)){
          A[j +1] = A[j];
          j--;
          }
          A[j + 1]= key;
          }
        
    }
    public static void Searching(int A[]){
        int key =13 ;
        System.out.println("Isi data adalah : ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        for (int i =0; i<A.length; i++){
            if(key == A[i]){
               System.out.print("Data " + key + " Berada Di Indeks Ke : " + i);
               break;
            }
        }
        System.out.println("\n");
    }
   
    
    
    public static void main(String[] args) {
    System.out.println("Program Pengurutan InsertionSort dan Sequential Searching");
          int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : ");
           Nomor7.tampil(data);
           Nomor7.Sorting(data);
         System.out.println("Data Sesudah Diurutkan : ");
           Nomor7.tampil(data);
           Nomor7.Searching(data);
           System.out.println();
            System.out.print("Mokhamad Akbar Wijaya(20090037)");
           
    }    
 
   

}
