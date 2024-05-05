import java.util.Scanner;
class maths1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a*b*c;
        System.out.println("multiply"+ d);
        int e=a+b+c;
        System.out.println("added"+e);
        int f= d/e;
        System.out.println(f);
            }
}