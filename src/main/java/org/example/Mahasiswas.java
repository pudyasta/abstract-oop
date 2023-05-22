package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Mahasiswas implements AcademicActivity{
    private String nama,nim,fakultas;
    private double ipk=0;
    private int jumlah_sks=0,tahun_masuk,nomer_urut;
    private static List<Mahasiswas> semuaMahasiswa = new ArrayList<>();

    public Mahasiswas(String nama, String nim, int tahun_masuk) {
        this.nama = nama;
        this.tahun_masuk = tahun_masuk;
        this.nim = nim;
        this.fakultas = Helper.getFakultas(nim.split("/")[1]);
        semuaMahasiswa.add(this);
    }
    public Mahasiswas(String nama, String fakultas, double ipk, int jumlah_sks, int tahun_masuk, int nomer_urut) {
        this.nama = nama;
        this.fakultas = fakultas;
        setIpk(ipk);
        this.jumlah_sks = jumlah_sks;
        this.tahun_masuk = tahun_masuk;
        this.nomer_urut = nomer_urut;
        setNim(fakultas);
        semuaMahasiswa.add(this);

    }
    private void setNim(String fakultas){
        this.nim =  tahun_masuk+"/"+Helper.getKodeFakultas(fakultas)+"/"+nomer_urut;
    }
    public abstract void getLulus();
    public abstract void setSyaratLulus();
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        while (true) {
            if (ipk <= 4 && ipk >= 0){
                this.ipk = ipk;
                break;
            }else {
                System.out.println("Invalid IPK ");
                ipk = Helper.readInt("IPK");
            }
        }
    }
    public int getJumlah_sks() {
        return jumlah_sks;
    }
    public void setJumlah_sks(int jumlah_sks) {
        this.jumlah_sks = jumlah_sks;
    }
    public int getTahun_masuk() {
        return tahun_masuk;
    }
    public void setTahun_masuk(int tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }
    public int getNomer_urut() {
        return nomer_urut;
    }
    public void setNomer_urut(int nomer_urut) {
        this.nomer_urut = nomer_urut;
    }
    public static void getSemuaMahasiswa() {
        for (Mahasiswas i :
                semuaMahasiswa) {
            System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");
        }
    }
    public static void getMahasiswaDiploma(){
        for (Mahasiswas i :
                semuaMahasiswa) {
            if (i instanceof Diploma) {
                System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");

            }
            }
    }
    public static void getMahasiswaSarjana(){
        for (Mahasiswas i :
                semuaMahasiswa) {
            if (i instanceof Sarjana) {
                System.out.print(i.getNama()+" | "+i.getNim()+" | "+i.getFakultas()+"\n");

            }
        }
    }
    @Override
    public void ambilCourse(String Course) {
        course.add(Course);
        setJumlah_sks(getJumlah_sks()+2);
    }
}
