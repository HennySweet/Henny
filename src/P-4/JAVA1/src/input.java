import java.util.Scanner;

public class input {
    public static void main(String[] Args) {

        // setup variabel
        String nama, alamat;
        int usia, gaji;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Pendataan Karyawan PT.ABC");
            System.out.println("Nama Karyawan : ");

            nama = keyboard.next();

            System.out.println("Alamat : ");

            alamat = keyboard.next();

            System.out.println("Usia : ");

            usia = keyboard.nextInt();

            System.out.println("Gaji : ");

            gaji = keyboard.nextInt();
        }

        // cetak ke layar

        System.out.println("-----------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Gaji : " + gaji);

    }
}
