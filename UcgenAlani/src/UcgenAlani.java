import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı

        int kenar1,kenar2,kenar3,U,cevre,alan;
        System.out.print("1.Kenar Uzunluğu: ");
        kenar1= girdi.nextInt();
        System.out.print("2.Kenar Uzunluğu: ");
        kenar2= girdi.nextInt();
        System.out.print("3.Kenar Uzunluğu: ");
        kenar3= girdi.nextInt();

        U=(kenar1+kenar2+kenar3)/2;
        cevre=2*U;
        System.out.println("Üçgenin Çevresi:"+cevre);

        alan=U*(U-kenar1)*(U-kenar2)*(U-kenar3);
        System.out.print("Üçgenin Alanı:"+alan);







    }

}
