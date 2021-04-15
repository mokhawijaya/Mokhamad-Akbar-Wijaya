/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.tugas.ke4.algo2;

/**
 *
 * @author LENOVO
 */
public class Nomor2 {

    /**
     * @param args the command line arguments
     */
        public static void bubbleSort(int[]A){
        int i=1,j,n=A.length;
        int temp;
        while (i<n){
            j=n-1;
            while(j>=i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                                              
                }
                j=j-1;
            }
            i=i+1;
        }
    }
    public static void tampil(int data[]) {
        for (int i=0; i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int A[]={25,7,9,13,3};
        Nomor2.tampil(A);
        Nomor2.bubbleSort(A);
        Nomor2.tampil(A);
        System.out.println("Mokhamad Akbar Wijaya(20090037)");
    }
    }
    

