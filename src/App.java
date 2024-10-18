public class App {
    public static void main(String[] args) throws Exception {
        Mac mac = new Mac("Apple", 3200, 8, "M4", "Lithium", "Face ID");
        mac.tampilMac();

        System.out.println();
        Windows windows = new Windows("Asus", 2300, 16, "Intel I5 U1432", "Lithium", "Touchscreen");
        windows.tampilWindows();

        System.out.println();
        PC pc = new PC("Acer", 3500, 64, "AMD Rayzen 7", 24);
        pc.tampilPc();
    }
}
