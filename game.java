import acm.program.*;
import java.util.Scanner;
public class game{

public void run() {
    Scanner obj=new Scanner(System.in);
    
    int term;
    term = readInt("Enter a number: ");
    while( term !=1){
        term = hailEqn(term);
        counter++;
}

System.out.println("The process took " + counter + " to reach 1");
}

private int hailEqn(int term){
    int result = 0;
    if( term % 2 == 0){
        result = term /2;
        System.out.println( term + " is even, so I take half: " + result);
        return result;
    }
    else{
        result = 3 * term + 1;
        System.out.println( term + " is odd, so I take 3n + 1: " + result);
        return result;
}

}

private int term = 0;
private int counter = 0;
}