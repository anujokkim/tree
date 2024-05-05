import java.util.Scanner;
class positiveNegative
{
    public static void main (String args[])
    {
        int num;
        Scanner joki=new Scanner(System.in);
         num=joki.nextInt();
         if(num>0)
         {
            System.out.println(num +"is positive ");
         }
         else
         {
            System.out.println(num +"is negative");
         }

    }
}
