import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        Num = input.nextInt();
        int count = 0;
        int sum = 0;
        for (int i=1; i<Num; i++){
            if (i%3==0 && i%4==0){
                sum +=i;
                count++;
            }
        }
        if (count !=0){
            System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması :" + sum/count);
        }else {
            System.out.println("0'dan girdiğiniz sayıya kadar 3'e ve 4'e tam bölünen sayı bulunmuyor.");
        }
    }
}