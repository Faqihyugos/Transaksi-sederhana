/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10417082_p3_pbo;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int pl1,pl2,hrg1,hrg2,hrg3,hrg4,hrg5;
       int hsl = 0;
       int jml1k =0;
       
        System.out.println("==========================================");
        System.out.println("              Daftar Menu makanan         ");
        System.out.println("==========================================");
        System.out.println("|  KODE  |       MAKANAN      |  HARGA   |");
        System.out.println("|   11   | GURAME SAUS PADANG |   96000  |");
        System.out.println("|   12   | KEPITING SAUS TIRAM|  116000  |");
        System.out.println("|   13   | KEPITING SAUS ASIN |  110000  |");
        System.out.println("|   14   | UDANG SAUS TIRAM SP|  100000  |");
        System.out.println("|   15   | KANGKUNG SAUS TIRAM|   15000  |");
        System.out.println("------------------------------------------");
        System.out.println("==========================================");
        System.out.println("\n");
        
        System.out.print("Masukkan kode makanan : ");
        pl1 = input.nextInt();
        if (pl1 == 11) {
            System.out.println("Makanan       : GURAME SAUS PADANG");
            System.out.println("Harga makanan : Rp.96000");
            hrg1 = 96000;
            System.out.print("Masukkan jumlah beli : ");
            int jml1 = input.nextInt();
            jml1k = jml1 * hrg1;
        } else if (pl1 == 12) {
            System.out.println("Makanan       : KEPITING SAUS TIRAM");
            System.out.println("Harga makanan : Rp.116000");
            hrg1 = 116000;
            System.out.print("Masukkan jumlah beli : ");
            int jml1 = input.nextInt();
            jml1k = jml1 * hrg1;
        } else if (pl1 == 13) {
            System.out.println("Makanan       : KEPITING SAUS ASIN");
            System.out.println("Harga makanan : Rp.110000");
            hrg1 = 110000;
            System.out.print("Masukkan jumlah beli : ");
            int jml1 = input.nextInt();
            jml1k = jml1 * hrg1;
        } else if (pl1 == 14) {
            System.out.println("Makanan       : UDANG SAUS TIRAM SP");
            System.out.println("Harga makanan : Rp.100000");
            hrg1 = 100000;
            System.out.print("Masukkan jumlah beli : ");
            int jml1 = input.nextInt();
            jml1k = jml1 * hrg1;
        } else if (pl1 == 15) {
            System.out.println("Makanan       : KANGKUNG SAUS TIRAM");
            System.out.println("Harga makanan : Rp.15000");
            hrg1 = 15000;
            System.out.print("Masukkan jumlah beli : ");
            int jml1 = input.nextInt();
            jml1k = jml1 * hrg1;
        }
        System.out.println("\n");
        System.out.println("==========================================");
        System.out.println("                  Pembayaran              ");
        System.out.println("==========================================");
        System.out.println("Total Harga   : Rp."+jml1k);
        System.out.print("Uang pembayaran : Rp.");
        int msk = input.nextInt();
        hsl = msk - jml1k;
        if (hsl > 0) {    
            System.out.println("Uang Kembalian : Rp."+hsl);
            System.out.println("Terimakasih atas kunjuangan anda");
        }else{
            System.out.println("Uang anda kurang");
        }
        System.out.println("------------------------------------------");
        System.out.println("==========================================");
    }
}
