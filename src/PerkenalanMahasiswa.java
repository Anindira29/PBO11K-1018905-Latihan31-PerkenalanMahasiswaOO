/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Perkenalan Mahasiswa
 */
public class PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static Mahasiswa mhs = new Mahasiswa();
    public static void tampilNama(String nama, String nim) {
        mhs.nama = nama;
        mhs.nim = nim;
        mhs.perkenalanDiri();
    }
    public static void main (String[] args){
        tampilNama ("Rizki adam kurniawan", "10110269");
        tampilNama ("Indra Tiola", "10110270");
        tampilNama ("Robi transil ganefi", "10110271");
        tampilNama ("Muhamad nur awaludin", "10110269");
    }
    
}
