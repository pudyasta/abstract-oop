package org.example;

public abstract class Diploma extends Mahasiswas {
    public Diploma(String nama, String nim, int tahun_masuk) {
        super(nama, nim, tahun_masuk);
    }

    public Diploma(String nama, String fakultas, double ipk, int jumlah_sks, int tahun_masuk, int nomer_urut) {
        super(nama, fakultas, ipk, jumlah_sks, tahun_masuk, nomer_urut);
    }

}
