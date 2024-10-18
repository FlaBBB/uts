public class Komputer {
    private String merk;
    private int kecepatanProsesor;
    private int sizeMemory;
    private String jenisProsesor;

    Komputer () {}

    Komputer (String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor) {
        this.merk = merk;
        this.kecepatanProsesor = kecepatanProsesor;
        this.sizeMemory = sizeMemory;
        this.jenisProsesor = jenisProsesor;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Prosesor: " + kecepatanProsesor + " MHz");
        System.out.println("Size Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor: " + jenisProsesor);
    }
}
