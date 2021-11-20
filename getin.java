import java.util.Scanner;
public class getin {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the username :");
        String name=obj.nextLine();
        System.out.println("The username is " + name);
    }
    
}
