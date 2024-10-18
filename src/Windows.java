public class Windows extends Laptop {
    private String fitur;

    Windows () {}

    Windows (String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai, String fitur) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, jenisBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur: " + fitur);
    }
}
