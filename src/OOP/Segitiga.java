package OOP;

public class Segitiga {
    // Attribut atau variabel
    private int tinggi = 5;
    private int panjang = 10;
    private int lebar = 5;


    //Constructor
    public Segitiga(int panjang, int tinggi, int lebar){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    // Method menghitung volume segitiga
    public int volume(int p, int t, int l){
        return p*t*l;
    }


    //Setter Getter
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

}
