public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir air = new TransportasiAir(4, 20000) 
        air.informasi();
        air.berlayar();
        air.berlabu();
        System.out.println("\n")
        Sampan sampan = new Sampan(20, 50000, 2)
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabu();
        sampan.berlabu(2);
        System.out.println("\n")
        Kapal kapal = new Kapal(50, 100000, "Diesel")
        kapal.informasi();
        kapal.berlayar();
        kapal.berlabu();
        kapal.berlayar(20);
        System.out.println("\n")
 
    } 
} 
 