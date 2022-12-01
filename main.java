import java.util.Scanner;
public class SayiKontrol {
    public static void main(String[] args) {
        int number,sum=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();
            if (number%4==0){
                sum += number;
            }
        }while (number%2==0);
    System.out.print("Girilen Çift Sayılardan 4'e Bölünebilenlerin Toplamı: "+ sum);

    }
}
