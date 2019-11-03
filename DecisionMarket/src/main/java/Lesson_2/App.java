package Lesson_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        double diemso = 0;
        System.out.println("\n Vui long nhap diem so");
        Scanner sc = new Scanner(System.in);
        diemso = sc.nextDouble();

        if(diemso<5)
            System.out.println("\n xem loai khong dat");
        else if (diemso>5)
            System.out.println("\n xem loai dat");
        else
            System.out.println("\n xem loai dat");

    }
}
