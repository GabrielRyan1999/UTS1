/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Nota;
import model.Transaksi;

/**
 *
 * @author user only
 */
public class Test5 {
    public static void main(String[] args) {
        Transaksi trans1 = new Transaksi(
                "Puspa", // namaPembeli, 
                "buku", // namaBarang, 
                1, // jumlah 
                1000 // harga barang
        );
        
        Transaksi trans2 = new Transaksi(
                "Puspa", // namaPembeli, 
                "pensil", // namaBarang, 
                2, // jumlah 
                2000 // harga barang
        );
        Transaksi trans3 = new Transaksi(
                "Puspa", // namaPembeli, 
                "penggaris", // namaBarang, 
                3, // jumlah 
                3000 // harga barang
        );
        
        Nota nota = new Nota();
        nota.tambahTransaksi(trans1);
        nota.tambahTransaksi(trans2);
        nota.tambahTransaksi(trans3);
        // menampilkan seluruh transaksi pada nota. 
        // Tampilan sbb:
        //        Puspa,buku,1000,1
        //        Puspa,pensil,2000,2
        //        Puspa,penggaris,3000,3
        for (int i = 0; i < nota.getDaftarTransaksi().size(); i++) {
            System.out.println(nota.getDaftarTransaksi().get(i));
        }
    }
}
