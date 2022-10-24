package OOP;

public class SegitigaController extends Segitiga{
    public SegitigaController(int panjang, int tinggi, int lebar) {
        super(panjang, tinggi, lebar);
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(10,5,5);
        segitiga.getPanjang();
        segitiga.getLebar();
        segitiga.getTinggi();

        System.out.println(segitiga.volume(10,5,5));

    }
}
