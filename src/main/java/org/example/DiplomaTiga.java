package org.example;

public class DiplomaTiga extends Diploma {

    private int tanggunganLabCount = 0;

    public DiplomaTiga(String nama, String nim, int tahun_masuk) {
        super(nama, nim, tahun_masuk);
    }

    public DiplomaTiga(String nama, String fakultas, double ipk, int jumlah_sks, int tahun_masuk, int nomer_urut) {
        super(nama, fakultas, ipk, jumlah_sks, tahun_masuk, nomer_urut);
    }

    public int getTanggunganLabCount() {
        return tanggunganLabCount;
    }
    @Override
    public void setSyaratLulus() {
        int publikasiCount = Helper.readInt("Input jumlah publikasi");
        this.tanggunganLabCount = publikasiCount;
    }
    @Override
    public void getLulus() {
        if(getJumlah_sks() >= 110
            && tanggunganLabCount == 0
        ){
            System.out.println("Lulus");
        }else{
            System.out.println("Belum");
        }
    }

}
