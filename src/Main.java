import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        double kg, boy, vki;

        //Kullanicidan kilo ve boy bilgileri alindi.
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.print("Lutfen Kilonuzu Giriniz : ");
        kg = scan.nextDouble();

        System.out.println("-------------------------------");
        System.out.print("Lutfen Boyunuzu Virgul Kullanarak Metre Cinsinden Giriniz : ");
        boy = scan.nextDouble();

        //Vucut kitle indeksi hesaplandi ve kullaniciya bilgisi verildi.
        vki = kg / (boy * boy);

        System.out.println("-------------------------------");
        System.out.print("Vucut Kitle Indeksiniz : " + vki);
    }
}
