package Lesson_2;

public class Operator {
    public static void  main(String[] args)
    {
        int x =9;
        x++;
        System.out.println("Gia tri cua x:"+x);

        int y = x%3;
        System.out.println("Gia tri cua y: " +y);

        if(y==x)
            System.out.println("y = x = " + y);
        else if (y!=x)
            System.out.println("y != x " + "y = " + y);

        /*Toan tu dieu kien*/
        int j =0;
        j=x>0?10:-10;
        System.out.println("gia tri j =" +j);
    }
}
