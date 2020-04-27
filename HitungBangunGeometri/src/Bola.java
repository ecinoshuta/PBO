import static java.lang.Math.*;

public class Bola extends Lingkaran {
    private double sudut;
    private double KelilingTembereng2D, LuasTembereng2D;
    private double KelilingJuring2D, LuasJuring2D;
    private double PanjangBusurTembereng2D, PanjangBusurJuring2D;
    private double VolumeBola;

    public Bola(double r, double sudut) {
        super(r);
        this.sudut = sudut;
    }

    public double getSudut() {
        return sudut;
    }

    public double kelilingTembereng2D() {
        double r = getR();
        KelilingTembereng2D = ((sudut / 360) * 2 * PI * r) + (2 * r * sin((sudut / 2)));

        return KelilingTembereng2D;
    }

    public double luasTembereng2D() {
        double r = getR();
        LuasTembereng2D = ((sudut / 360) * LuasLingkaran()) - (0.5 * pow(r, 2) * sin(sudut));

        return LuasTembereng2D;
    }

    public double kelilingJuring2D() {
        double r = getR();
        KelilingJuring2D = ((sudut / 360) * KelilingLingkaran()) + (2 * r);

        return KelilingJuring2D;
    }

    public double luasJuring2D() {
        LuasJuring2D = (sudut / 360) * LuasLingkaran();

        return LuasJuring2D;
    }

    public double panjangBusurTembereng2D() {
        double r = getR();
        PanjangBusurTembereng2D = (sudut / 360) * 2 * PI * r;

        return PanjangBusurTembereng2D;
    }

    public double panjangBusurJuring2D() {
        PanjangBusurJuring2D = (sudut / 360) * KelilingLingkaran();

        return PanjangBusurJuring2D;
    }


    public double VolumeBola() {
        double r = getR();
        VolumeBola = 0.75f * PI * pow(r, 3);

        return VolumeBola;
    }

//    public void VolumeYembereng3D(){
//        volume = (float) (1*Math.PI/3*Math.pow(tinggi,2)*(Math.pow(r,3)-tinggi));
//        System.out.println("\nVolume = 1/3 x"+Math.PI+" / "+Math.pow(tinggi,2)+" x "+(Math.pow(r,3)+"-"+tinggi));
//        System.out.println("Volume = "+volume);
//    }
//
//    public void LuasPermukaanTembereng3D(){
//        luasPermukaan = (float)(2*Math.PI*r*tinggi);
//        tampil.pesanln("Luas Permukaan = "+2+" x "+Math.PI+" x "+r+" x "+tinggi);
//        tampil.pesanln("Luas Permukaan = "+luasPermukaan);
    }
}
