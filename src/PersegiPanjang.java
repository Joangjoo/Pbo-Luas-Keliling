import java.util.Scanner;

public class PersegiPanjang {

        Scanner x = new Scanner(System.in);
        private double panjang;

        private double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }

    double hasilluas(){
     return panjang*lebar;
    }

    double hasilKeliling(){
        return panjang+lebar+panjang+lebar;
    }

    public void output2(){
        System.out.print("Masukkan Panjang : ");
        panjang = x.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = x.nextDouble();

        System.out.println("Hasil Luas Persegi Panjang : " + hasilluas());
        System.out.println("Hasil Keliling Persegi : " + hasilKeliling());
    }
}
