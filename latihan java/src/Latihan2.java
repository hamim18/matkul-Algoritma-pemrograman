import java.util.Scanner;
public class Latihan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Masukan ANGKA = ");
        int angka = input.nextInt();
        cek apakah angka positip atau bukan 
        if (angka > 0 && angka !=0){
            System.out.println("angka "+angka+" adalah positif");
        }else if (angka == 0) {
            System.out.println("0 tidak positif atau negatif");
        }else{
            System.out.println("angka "+angka+" adalah negatif");
        }*/

        /*System.out.print("Masukan umur anda =");
        int angka = input.nextInt();
        //tentukan anak akan dewasa atau remaja
        if (angka<13) {
            System.out.println("umur anda "+angka+" tahun, sekarang anda fase anak anak");
        }else if (angka >= 13 && angka<=18) {
            System.out.println("umur anda "+angka+" tahun, sekarang anda fase remaja");
        }else if (angka >18 && angka<=60) {
            System.out.println("umur anda "+angka+" tahun, sekarang anda fase dewasa");
        }else{
            System.out.println("umur anda "+angka+" tahun, sekarang anda fase lansia");
        }*/

        System.out.print("masukkan total belanjaan Rp; ");
        int Tbelanja= input.nextInt();
        int diskon;
        double jDiskon;
        double jumlah;
        //validasi input
        if (Tbelanja>0){
            if (Tbelanja>=1000000) {
                diskon=20;
                jDiskon=Tbelanja*diskon/100;
                jumlah=Tbelanja-jDiskon;
                System.out.println("total belanjaan Rp "+Tbelanja);
                System.out.println("potongan harga "+diskon+" %, Rp "+jDiskon);
                System.out.println("total bayar Rp "+jumlah);
            }else if (Tbelanja<1000000 && Tbelanja>=500000) {
               diskon=10;
                jDiskon=Tbelanja*diskon/100;
                jumlah=Tbelanja-jDiskon;
                System.out.println("total belanjaan Rp "+Tbelanja);
                System.out.println("potongan harga "+diskon+" %, Rp "+jDiskon);
                System.out.println("total bayar Rp "+jumlah); 
            }else if (Tbelanja<500000 && Tbelanja>=100000) {
                diskon=5;
                jDiskon=Tbelanja*diskon/100;
                jumlah=Tbelanja-jDiskon;
                System.out.println("total belanjaan Rp "+Tbelanja);
                System.out.println("potongan harga "+diskon+" %, Rp "+jDiskon);
                System.out.println("total bayar Rp "+jumlah);
            }else{
                diskon=0;
                jDiskon=Tbelanja*diskon/100;
                jumlah=Tbelanja-jDiskon;
                System.out.println("total belanjaan Rp "+Tbelanja);
                System.out.println("potongan harga "+diskon+" %, Rp "+jDiskon);
                System.out.println("total bayar Rp "+jumlah);
            }
        }else{
            System.out.println("Masukan angka positif dan bukan 0");
        }
    }
}