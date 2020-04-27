import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Tabung extends Lingkaran {
    private double Tinggi;
    private double LuasTabung, VolumeTabung;

    public Tabung(double r, double tinggi) {
        super(r);
        this.Tinggi = tinggi;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public double luasTabung() {
        double r = getR();
        LuasTabung = (2 * LuasLingkaran()) + (2 * PI * r * Tinggi);

        return LuasTabung;
    }

    public double volumeTabung() {
        double r = getR();
        VolumeTabung = PI * pow(r, 2) * Tinggi;

        return VolumeTabung;
    }

}
