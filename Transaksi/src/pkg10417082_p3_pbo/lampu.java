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
public class lampu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String lampu;
        
        System.out.print("Input nama warna : ");
        lampu = baca .nextLine();
        switch (lampu){
        case "merah":
            System.out.println("Lampu merah, berhenti!!");
        break;
        case "kuning":
            System.out.println("Lampu kuning, berhati-hati!");
        break;
        case "hijau":
            System.out.println("Lampu hijau, silahkan :)");
        break;
        default:
            System.out.println("Warna lampu salah!!");
        }
    }
    
}
