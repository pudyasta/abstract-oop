package org.example;


public class App 
{
    public static void main( String[] args )
    {

//        DiplomaTiga alek = new DiplomaTiga("Aleksander", "Vokasi",4,18,2018,1989);
        DiplomaTiga alek = new DiplomaTiga("Aleksander","2012/SV/1090",2012);

        alek.getMahasiswaDiploma();
        alek.ambilCourse("Basis Data");
        alek.ambilCourse("AASD");
        alek.ambilCourse("OOP");
        System.out.println("Jumlah SKS : "+AcademicActivity.calculateTotalCredits(alek));

    }
}
