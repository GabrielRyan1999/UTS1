/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Transaksi;

/**
 *
 * @author user only
 */
public class Test2 {
    public static void main(String[] args) {
        Transaksi trans1 = new Transaksi(
                "Puspa", // namaPembeli, 
                "buku", // namaBarang, 
                1, // jumlah 
                1000 // harga barang
        );
        // keluarannya
        // Puspa,buku,1000,1
        System.out.println(trans1.toString());
        
    }
}
