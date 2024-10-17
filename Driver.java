package BookStore;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        System.out.println("Welcome To Book Store. \n_____________________________________________ \nKau Mau Melihat Data-Data Buku Kami?, Baiklah \n________________________________________________ \nPilih Buku Yang Ingin Kamu Ketahui: (Angka Saja)");
        System.out.println("________ \n1. Novel \n____________ \n2. Text Book");
        int pilihan = kemil.nextInt();
        if( pilihan == 1) {
            System.out.println("Ow, Novel, Baiklah");
            System.out.println("___________ \nJudul Buku: ");
            String title = kemil.next();
            kemil.nextLine();
            System.out.println("____________");
            System.out.println("Genre Buku: ");
            String genre = kemil.next();
            kemil.nextLine();
            System.out.println("______________");
            System.out.println("Tahun Terbit: ");
            int year = kemil.nextInt();
            System.out.println("____________");
            System.out.println("Harga Buku: ");
            double price = kemil.nextDouble();
            System.out.println("____________");
            Novel novel1 = new Novel(title, genre, year, price);
            novel1.print();
        
        }else if( pilihan == 2) {
            System.out.println("Hmmmm, Text Book, Pelajar Ya.....");
            System.out.println("___________________________________________________________");
            System.out.println("Oh ya, Text Book Sekarang Gabung Sama Biography.... Jadi...");
            System.out.println("_______________________________________");
            System.out.println("Mau Text Book Saja Atau Sama Biography?");
            System.out.println("__________________________");
            System.out.println("1. Jika Sama Biography, \n2. Jika Tidak");
            int pilihanBuku = kemil.nextInt();
            switch (pilihanBuku){
                case 1:
                    System.out.println("_____________________________________");
                    System.out.println("Owkee, Dengan Biography juga, Baiklah");
                    System.out.println("___________ \nJudul Buku: ");
                    String title = kemil.next();
                    kemil.nextLine();
                    System.out.println("____________");
                    System.out.println("Mapel Buku: ");
                    String subject = kemil.next();
                    kemil.nextLine();
                    System.out.println("___________________");
                    System.out.println("Biography Tentang: ");
                    String about = kemil.next();
                    kemil.nextLine();
                    System.out.println("______________");
                    System.out.println("Tahun Terbit: ");
                    int year = kemil.nextInt();
                    System.out.println("____________");
                    System.out.println("Harga Buku: ");
                    double price = kemil.nextDouble();
                    System.out.println("________________");
                    Biography biography1 = new Biography(title, subject, about, year, price);
                    biography1.print();
                    break;

                case 2:
                    System.out.println("_________________________");
                    System.out.println("Baik Hanya Text Book Saja");
                    System.out.println("___________ \nJudul Buku: ");
                    title = kemil.next();
                    kemil.nextLine();
                    System.out.println("____________");
                    System.out.println("Mapel Buku: ");
                    subject = kemil.next();
                    kemil.nextLine();
                    System.out.println("______________");
                    System.out.println("Tahun Terbit: ");
                    year = kemil.nextInt();
                    System.out.println("____________");
                    System.out.println("Harga Buku: ");
                    price = kemil.nextDouble();
                    System.out.println("________________");
                    TextBook textbook1 = new TextBook(title, subject, year, price);
                    textbook1.print();

            }
        }
    }
}
