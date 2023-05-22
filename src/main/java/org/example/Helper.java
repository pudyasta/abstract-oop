package org.example;


import java.util.Scanner;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);
    private static String[][] obj = {{"Teknik","FT"}, {"Vokasi","SV"}, {"Ilmu Budaya","FIB"}};
    public static String readString(String intro) {
        System.out.print(intro+" : ");
        return scanner.nextLine();
    }
    public static int readInt(String intro) {
        System.out.print(intro+" : ");

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input must be an integer. Try again: ");
            }
        }
    }
    public static String getFakultas(String kode){
        String code = "NA";
        for (int i = 0 ; i < obj.length;i++){
            if(obj[i]!=null){
                if(kode == obj[i][1]){
                    code = obj[i][0];
                    break;
                }
            }else{
                break;
            }
        }
        return code;
    }

    public static String getKodeFakultas(String fakultas){
        String code = "NA";
        for (int i = 0 ; i < obj.length;i++){
            if(obj[i]!=null){
                if(fakultas == obj[i][0]){
                    code = obj[i][1];
                    break;
                }
            }else{
                break;
            }
        }
        return code;
    }
}
