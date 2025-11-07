import java.util.Scanner;
public class Uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Soal no 1 hitung luas dan keliling lingkaran
        System.out.println("Hitung Luas dan Keliling Lingkaran");
        System.out.print("Masukan Jari jari : ");
       double jarijari =  input.nextDouble();
       double phi = 3.14;
       double luas = phi*jarijari*jarijari;
       double kelilling = 2*phi*jarijari;
        System.out.println("Luas lingkaranya adalah : "+luas);
       System.out.println("Keliling lingkaranya adalah : "+kelilling);
*/
       // soal no 2 menghitung biaya produksi
       System.out.println("===Hitung Biaya produksi per unit===");
       System.out.print("Masukan jumlah unit yang diproduksi : ");
       double jumlahProd = input.nextDouble();
       System.out.print("Masukan biaya bahan baku : (Rp) ");
       double bahanBaku = input.nextDouble();
       System.out.print("Masukan biaya tenaga kerja :(Rp.) ");
       double tenagaKerja = input.nextDouble();
       System.out.print("Masukan biaya produksi : (Rp) ");
       double biayaProd = input.nextDouble();

       double totalB = bahanBaku+tenagaKerja+biayaProd;
       double perUnit =totalB/jumlahProd;
       System.out.println("=====Hasil perhitungan====");
       System.out.println("Total Biaya Produksi : (Rp) "+totalB);
       System.out.println("Jumlah Unit yang di produksi : "+jumlahProd+ " Unit");
       System.out.println("Biaya produksi per Unit : (Rp) "+perUnit);
    }
}
