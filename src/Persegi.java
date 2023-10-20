import java.util.Scanner;

public class Persegi {

    Scanner obj = new Scanner(System.in);
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public Persegi(){
        this.sisi = 0;
    }

    double hasil(){
        return sisi*sisi;
    }

    public void output(){
        System.out.print("Masukkan Sisi : ");
        sisi = obj.nextDouble();
        System.out.println("Hasil Luas Persegi : " +hasil());

    }
}
