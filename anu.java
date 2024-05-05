import java.util.Scanner;

class anu{

    public static void main(String args[]){
        Scanner lol=new Scanner(System.in);
        String name=lol.nextLine();
        int age=lol.nextInt();
        lol.nextLine();
        String address=lol.nextLine();
        System.out.println("my name is "+ name);
        System.out.println("my age is "+age);
        System.out.println("my address is "+ address);

    }
}