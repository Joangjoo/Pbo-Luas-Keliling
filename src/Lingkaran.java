import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class Lingkaran {
    Scanner x = new Scanner(System.in);
    private double phi;
    private double jari;

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public Lingkaran(){
        this.jari = 0;
        this.phi = 3.14;
    }

    double Hasil(){
        return phi * jari * jari;
    }

    public void output3(){
        System.out.print("Masukkan Jari Jari : ");
        jari = x.nextDouble();
        System.out.print("Hasil Luas Lingkaran : " + Hasil());
    }
}
