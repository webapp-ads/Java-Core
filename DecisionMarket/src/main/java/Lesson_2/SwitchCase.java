package Lesson_2;

import java.util.Scanner;

public class SwitchCase {

    public static void main( String[] args )
    {
        int Numbers = 0;
        int Totals = 0;
        System.out.println("1. com canh chua");
        System.out.println("2. com canh chua");
        System.out.println("3. com canh chua");
        System.out.println("4. com canh chua");
        System.out.println("5. com canh chua");
        System.out.println("6. com canh chua");
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so tuong ung voi menu");
        Numbers = sc.nextInt();

        System.out.println("Vui long nhap so tuong ung voi menu");
        Totals = sc.nextInt();

        switch (Numbers) {
            case 1:
                System.out.println("1. com canh chua " + "So Luong: " + Totals);
                break;
            case 2:
                System.out.println("2. com canh chua " + "So Luong: " + Totals);
                break;
            case  3:
                System.out.println("3. com canh chua " + "So Luong: " + Totals);
                break;
            default:
                System.out.println("vu long chon mon tren danh sach menu");
        }

    }
}
