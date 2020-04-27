import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Lingkaran {
    private double r;
    private double LuasLingkaran, KelilingLingkaran;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double KelilingLingkaran() {
        KelilingLingkaran = PI * (r + r);

        return KelilingLingkaran;
    }
    public double LuasLingkaran() {
        LuasLingkaran = PI * pow(r, 2);

        return LuasLingkaran;
    }
}