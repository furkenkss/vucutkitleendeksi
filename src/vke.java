import java.util.Scanner;
//Kilo (kg) / Boy(m) * Boy(m)
public class vke {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        float kilo,boy;

        System.out.print("Kilo bilgisini giriniz: ");
        kilo=inp.nextFloat();
        System.out.print("Boy bilgisini (metre cinsinden ör:1,85) giriniz: ");
        boy=inp.nextFloat();

        double endeks=kilo/(boy*boy);

        System.out.print("Vücut Kitle Endeksi: "+endeks);

    }
}
