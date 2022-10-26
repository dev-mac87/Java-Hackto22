package OOP;

public class PersegiPanjang implements BagunDatar{

    @Override
    public void volume() {
        int panjang = 15, lebar = 10, tinggi = 5;
        int volume= panjang * lebar * tinggi;
        System.out.println("Volume Persegi Panjang = " + volume);
    }

    @Override
    public void luas() {
        int panjang = 15, lebar = 10;
        int luas= panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    @Override
    public void keliling(){
        int panjang = 15, lebar = 10;
        int keliling = (panjang*2)+(lebar*2);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
}
