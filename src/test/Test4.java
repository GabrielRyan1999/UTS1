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
public class Test4 {
    public static void main(String[] args) {
        // tampil exception "Nama Barang lebih dari 25 karakter"
        Transaksi trans2 = new Transaksi(
                "Puspa", // namaPembeli, 
                "buku tulis kotak-kotak cap burung gelatik", // namaBarang, 
                1, // jumlah 
                1000 // harga barang
        );
    }
}
