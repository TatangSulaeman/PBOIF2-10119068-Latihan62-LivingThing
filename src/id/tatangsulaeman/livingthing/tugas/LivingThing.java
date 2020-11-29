/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.livingthing.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Living Thing
 * 
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
