import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int armut,elma,domates,muz,patlıcan;
        double armutKG=2.17,elmaKG=3.67,domatesKG=1.11,muzKG=0.95,patlıcanKG=5.00;
        double tutar;
        System.out.print("Armut Kac kilo ? :");
        armut = scan.nextInt();
        System.out.print("Elma Kac kilo ? :");
        elma = scan.nextInt();
        System.out.print("Domates Kac kilo ? :");
        domates = scan.nextInt();
        System.out.print("Muz Kac kilo ? :");
        muz = scan.nextInt();
        System.out.print("Patlıcan Kac kilo ? :");
        patlıcan = scan.nextInt();

        tutar = (armut*armutKG)+(elma*elmaKG)+(domates*domatesKG)+(muz*muzKG)+(patlıcan*patlıcanKG);
        System.out.println("Toplam tutar : "+tutar);
    }
}
