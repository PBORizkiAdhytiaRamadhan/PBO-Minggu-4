package com.company;

public class Main {
    static int kalkulasi(int x, int y){
        return x + y;
    }

    static double kalkulasi(double x, double y) {
        return x - y;
    }

    static String kalkulasi(String x, String y) {
        String hasil = x + " " + y;
        return hasil;
    }

    static String kalkulasi(String x, int y) {
        String hasil = "Nama " + x + ", Umur " + y + " Tahun";
        return hasil;
    }

    public static void main(String[] args) {
	int nilai1 = kalkulasi(8,5);
	double nilai2 = kalkulasi(4.3,6.26);
	String nilai3 = kalkulasi("Rizki Adhytia", "Ramadhan");
	String nilai4 = kalkulasi("Adhyt", 17);
    System.out.println("int: " + nilai1);
    System.out.println("double: " + nilai2);
    System.out.println("string: " + nilai3);
    System.out.println("keterangan: " + nilai4);
    }
}
