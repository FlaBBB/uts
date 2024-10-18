public class Mac extends Laptop {
    private String security;

    Mac () {}

    Mac (String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai, String security) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, jenisBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security: " + security);
    }
}
