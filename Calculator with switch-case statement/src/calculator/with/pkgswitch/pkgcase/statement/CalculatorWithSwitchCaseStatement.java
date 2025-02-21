
package calculator.with.pkgswitch.pkgcase.statement;

import java.util.Scanner;

public class CalculatorWithSwitchCaseStatement {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("your first number ?");
    double a =0;
    a = input.nextDouble();
    System.out.println("your second number ?");
    int b = 0 ;
    b = input.nextInt();
    System.out.println("yapmak istedigin islem nedir? ?");
    System.out.println("+ ise 1\n- ise 2\n* ise 3\n/ise 4 e tikla");
    int c = input.nextInt();
    double sonuc=0;
    switch(c){
        case 1: 
         sonuc = a+b;
             System.out.print("sonuc :"+sonuc);
     break;
        case 2:
            sonuc= a-b;
                  System.out.print("sonuc :"+sonuc);
     break;
        case 3: 
            sonuc= a*b;
                System.out.print("sonuc :"+sonuc);
          break;
        case 4:
            if (b != 0) {
                    sonuc = a / b;
                    System.out.println("sonuc: " + sonuc);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
        default:
             System.out.print("gecerli bir işlem sec");

    }
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
