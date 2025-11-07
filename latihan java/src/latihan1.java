import java.util.Scanner;
public class latihan1 {

    public static void main(String[] args) {
        // latihan 1 membuaat program sederhana dengan output 
        // nim, nama, angkatan, ipk, dan prodi
        System.out.println("Nim : 256612004");
        System.out.println("Nama : Hamim Abdul Latif");
        System.out.println("Angkatan : 2025");
        System.out.println("IPK : 4");
        System.out.println("Prodi : Teknik Informatika\n");

        // latihan 2 menghitung luas persegi panjang
        Scanner input = new Scanner(System.in);
        System.out.println("Hitung luas Persegi");
        System.out.print("Masukan Panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Masukan Lebar : ");
        double lebar = input.nextDouble();

        double luas = panjang*lebar;

        System.out.println("Luas Perseginya adalah : "+luas);



    }
}