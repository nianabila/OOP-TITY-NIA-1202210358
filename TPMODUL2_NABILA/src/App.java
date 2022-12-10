public class App {
    public static void main(String[] args) throws Exception {
        Perangkat device = new Perangkat("Adata", 2, 1.80F);
        device.informasi();
        System.out.print("\n");

        Laptop komputer = new Laptop("Seagate", 8, 2.40F, true);
        komputer.informasi();
        komputer.bukaGame( "Dota 2");
        komputer.kirimEmail( "niceyuk@gmail.com");
        komputer.kirimEmail( "annarji@gmail.com", "rusmangc@gmail.com");
        System.out.print("\n");

        Handphone gawai = new Handphone("Sandisk",  3,  2.20F, false);
        gawai.informasi();
        gawai.telfon(628122122);
        gawai.kirimSMS(62852112);
        gawai.kirimSMS(628121212,629292211);
    }
} 