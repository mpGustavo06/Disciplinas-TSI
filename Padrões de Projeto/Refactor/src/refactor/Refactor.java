package refactor;

import java.io.PrintStream;
import java.util.Scanner;

public class Refactor {

    public static void main(String[] args) {
        Refactor refactor = new Refactor();
        refactor.calculaSomaPA();
    }
    
    private int readNumberOfTerms(){
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);
        
        int num;
        do{
            output.println("Enter the number of terms in the AP: ");
            num = input.nextInt();
        } while (num < 2);
        
        input.close();
        
        return num;
    }
    
    private int readFirstTerm() {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);
        
        int num;
        do{
            output.println("Enter the first term of the AP: ");
            num = input.nextInt();
        } while (num < 1);
        
        input.close();
        
        return num;
    }
    
    private int readReason() {
        PrintStream output = System.out;
        Scanner input = new Scanner(System.in);
        
        int num;
        do{
            output.println("Enter the reason for the AP: ");
            num = input.nextInt();
        } while (num < 1);
        
        input.close();
        
        return num;
    }
    
    public void calculaSomaPA() {
        int j,a1,an,r,t,s;

        
        an = a1 + (n-1) * r;
        
        s = ((a1+an) * n)/2;
        
        for (j=1; j<=n; j++){
            t = a1 + (j-1) * r;
            
            w.printf("a%d = %d\n",j,t);
        }
        
        w.printf("A soma é: %d\n",s);
    }
    
}
