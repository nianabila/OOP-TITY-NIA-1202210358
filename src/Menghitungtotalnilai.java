
public class Menghitungtotalnilai {

    public static void main(String[] args) {
        double totalnilai;
        
        //membuat objek dari class Hitungnilai
        Hitungnilai objekhitung = new Hitungnilai();
        totalnilai =objekhitung.hitungtubes(80)+objekhitung.hitungtugas(80)+objekhitung.hitungquiz(90)+objekhitung.hitungUTS(90)+objekhitung.hitungUAS(75);
        System.out.println( "Nilai Total adalah  "+ totalnilai);
        
        //membuat objek dari class tentukanhurufmutu
        tentukanhurufmutu objekhr = new tentukanhurufmutu(totalnilai);
        
        System.out.println("Huruf Mutu "+objekhr.hurufmutu());
        
    }
    
}
