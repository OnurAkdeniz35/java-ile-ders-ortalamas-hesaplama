import java.util.Scanner ;


public class Deneme {
    public static void main(String [] args){
       
        int mat,fizik,kimya,tarih;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik noturunz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        int toplam = mat + fizik + kimya + tarih ;
        double ortalama = toplam / 4.0 ;

        System.out.println("Notlar toplamı : " + toplam);
        System.out.println("Notlarınızın ortalaması : " + ortalama);

        String sonuc = ortalama >= 60 ? "Başarılı" : "Başarısız" ;
        
        System.out.println("Sizin durumunuz : " + sonuc);

    }
}