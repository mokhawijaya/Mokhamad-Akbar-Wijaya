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
     public static void insertionSort(int[] A) {
        // TODO code application logic here
        for (int i=1;i<A.length;i++) {
            int key = A[i];
            int j = i-1;
            while ((j>=0)&&(A[j]>key)){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
        }
    }
     public static void tampil(int data[]){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        int A[]={25,7,9,13,3};
        Nomor1.tampil(A);
        Nomor1.insertionSort(A);
        Nomor1.tampil(A);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Data Yang akan dicari : ");
        int key = input.nextInt();
        for (int i=0;i<A.length;i++){
            if(key == A[i]){
                System.out.println("Data "+key+" Berada di Indeks ke : "+i);
                break;
            }
        }
          System.out.println("Mokhamad Akbar Wijaya(20090037)");
    }
}
