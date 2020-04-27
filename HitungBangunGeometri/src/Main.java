import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.print("Masukkan jari-jari atas: ");
        double rAtas = input.nextDouble();
        System.out.print("Masukkan sudut: ");
        double sudut = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextInt();

        Lingkaran lingkaran = new Lingkaran(r);
        Bola bola = new Bola(r, sudut);
        Tabung tabung = new Tabung(r, tinggi);
        Kerucut kerucut = new Kerucut(r, tinggi);
        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r, tinggi, rAtas);

        System.out.printf("1.  Luas Lingkaran = %f \n", lingkaran.LuasLingkaran());
        System.out.printf("2.  Keliling Tembereng 2D = %a \n", bola.kelilingTembereng2D());
        System.out.printf("3.  Luas Tembereng 2D = %a \n", bola.luasTembereng2D());
        System.out.printf("4.  Keliling Juring 2D = %a \n", bola.kelilingJuring2D());
        System.out.printf("5.  Luas Juring 2D = %a \n", bola.luasJuring2D());
        System.out.printf("6.  Panjang Busur Tembereng 2D = %a \n", bola.panjangBusurTembereng2D());
        System.out.printf("7.  Panjang Busur Juring 2D = %a \n", bola.panjangBusurJuring2D());
        System.out.printf("8.  Volume Bola = %a \n", bola.volumeBola();
        System.out.printf("12.  Luas Permukaan Kerucut = %a \n", kerucut.LuasKerucut());
        System.out.printf("13. Volume Kerucut = %a\n", kerucut.VolumeKerucut());
        System.out.printf("14. Luas Permukaan Tabung = %f \n", kerucutTerpancung.luasKerucutTerpancung());
        System.out.printf("15. Volume Kerucut = %f \n", kerucutTerpancung.volumeKerucutTerpancung());
        System.out.printf("16. Luas Permukaan Tabung = %f \n", tabung.luasTabung());
        System.out.printf("17. Volume Kerucut = %f \n", tabung.volumeTabung());

    }
}