/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Tabungan {
    private int saldo;
    
    
    
    
    public Tabungan(int saldo){
        int jumlah;
        Scanner input=new Scanner(System.in);
        this.saldo = saldo;
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = input.nextInt();
        System.out.println("saldo Anda Sekarang : "+ambilUang(jumlah));
    }
    public int ambilUang(int jumlah){
        return  saldo - jumlah;
        
    }
}
