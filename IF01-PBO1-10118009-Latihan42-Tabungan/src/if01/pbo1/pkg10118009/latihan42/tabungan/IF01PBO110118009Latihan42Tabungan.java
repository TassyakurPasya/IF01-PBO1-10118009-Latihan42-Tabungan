/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan42.tabungan;

import java.util.Scanner;

/**
 *Nama : Tassyakur Pasya
 * Kelas : IF-01 
 * NIM : 10118009
 * Deskripsi Program : Tabungan
 * @author LENOVO
 */
public class IF01PBO110118009Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo;
    
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Scanner input = new Scanner(System.in);
        saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
    }
    
}
