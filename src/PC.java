public class PC extends Komputer {
    private int ukuranMonitor;

    PC () {}

    PC (String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, int ukuranMonitor) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}
