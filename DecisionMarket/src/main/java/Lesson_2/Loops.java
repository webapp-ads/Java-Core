package Lesson_2;

public class Loops {
    public static void  main(String[]args)
    {
       /* for(int i= 1; i <=10;i++)
        {

            if(i==5)
                continue;
            System.out.println("vong lap cho bien i = "+i);
            if(i==5)
                break;
        }*/

        /*int j = 10;
        while (j<5) {
            System.out.println("vong lap while j = " + j);
            j++;
        }*/

        int a = 1; int sums = 0;
        do{
            sums += a;
            a++;

        }while (a<=5);
        System.out.println(sums);


    }
}
