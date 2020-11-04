import java.util.Scanner;

public class namnhuan {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int year;

        System.out.println("enter a year");
        year = scanner.nextInt();


        if (year %4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("%d  la 1 nam nhuan" ,year);
                }else {
                    System.out.printf("%d khong phai namw nhuan" , year);
                }
            }else {
                System.out.printf("%d la nam nhuan",year);
            }
        }else {
            System.out.printf("%d khong phai nam nhuan",year);
        }
    }
}
