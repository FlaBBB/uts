public class Laptop extends Komputer {
    private String jenisBaterai;

    Laptop () {}

    Laptop (String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.jenisBaterai = jenisBaterai;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai: " + jenisBaterai);
    }
}
