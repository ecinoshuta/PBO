import static java.lang.Math.*;

public class Kerucut extends Lingkaran {
    private double tinggi, s;
    private double LuasKerucut, VolumeKerucut;

    public Kerucut(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.s = sqrt((pow(tinggi, 2) + pow(r, 2)));
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getS() {
        return s;
    }

    public double LuasKerucut() {
        double r = getR();
        LuasKerucut = LuasLingkaran() + (PI * r * s);

        return LuasKerucut;
    }

    public double VolumeKerucut() {
        double r = getR();
        VolumeKerucut = 1/3f * PI * pow(r, 2) * tinggi;

        return VolumeKerucut;
    }
}
