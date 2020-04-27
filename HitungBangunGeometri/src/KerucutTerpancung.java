import static java.lang.Math.*;

public class KerucutTerpancung extends Kerucut {
    private double rAtas, tinggi2, tinggi1, s2;
    private double luasKerucutTerpancung, volumeKerucutTerpancung;

    public KerucutTerpancung(double r, double tinggi, double rAtas) {
        super(r, tinggi);
        this.rAtas = rAtas;
        this.tinggi1 = (getTinggi() * rAtas) / r;
        this.tinggi2 = (tinggi1 * (r - rAtas)) / rAtas;
        this.s2 = sqrt((pow((r - rAtas), 2) + pow(tinggi2, 2)));
    }

    public double getrAtas() {
        return rAtas;
    }

    public double getTinggi2() {
        return tinggi2;
    }

    public double getS2() {
        return s2;
    }

    public double luasKerucutTerpancung() {
        double r = getR();
        luasKerucutTerpancung = PI * s2 * (r + rAtas);

        return luasKerucutTerpancung;
    }

    public double volumeKerucutTerpancung() {
        double r = getR();
        volumeKerucutTerpancung = 1 / 3f * PI * tinggi2 * (pow(r, 2) + (r * rAtas) + pow(rAtas, 2));

        return volumeKerucutTerpancung;
    }


}
