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
public class Nomor3 {
    public static void selectionShort(int[]A){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for(pass = 0;pass < n - 1; pass++){
            smallIndex=pass;
            for(j=pass+1;j<n;j++){
                if (A[j]<A[smallIndex]){
                    smallIndex=j;
                }
            }
            temp = A[pass];
            A[pass]=A[smallIndex];
            A[smallIndex]=temp;
            
        }
    }
    public static void tampil(int data[]){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25,7,9,13,3};
        Nomor3.tampil(A);
        Nomor3.selectionShort(A);
        Nomor3.tampil(A);
        System.out.println("Mokhamad Akbar Wijaya(20090037)");
    }
}
