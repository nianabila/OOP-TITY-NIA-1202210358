
public class tentukanhurufmutu {

   public double totalnilai;
    tentukanhurufmutu(double nilaiakhir){
        totalnilai=nilaiakhir;
    }
        
     public String hurufmutu(){   
         String hurufmutu;
        if ( totalnilai >= 90 ) {
            hurufmutu = "A";
        } else if ( totalnilai >= 80 ){
            hurufmutu = "AB";
        } else if ( totalnilai >= 70 ){
            hurufmutu = "B";
        } else if ( totalnilai >= 60 ){
            hurufmutu = "BC";
        } else if ( totalnilai >= 50 ){
            hurufmutu = "C";
        } else if ( totalnilai >= 40 ){
            hurufmutu = "D";
        } else {
            hurufmutu = "E";
        }
        
        return hurufmutu;
    }
}

    
