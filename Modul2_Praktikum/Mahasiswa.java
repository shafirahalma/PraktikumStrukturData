package Modul2_Praktikum;

import Modul1_praktikum.*;

/**
 *
 * @author shafira halmahera
 */
class Mahasiswa {

    private long nim;
    private String nama;
    private String asal;

    public Mahasiswa(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void displayMhs() {
        System.out.print("\tNIM: " + nim);
        System.out.print(", Nama: " + nama);
        System.out.println(", Asal: " + asal);
    }

    public long getNim() {
        return nim;
    }
    public String getnama() {
        return nama;
    }
}
