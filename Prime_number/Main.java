package Prime_number;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to check weather number is prime or not");
        int number=scan.nextInt();
        if(m.isPrime(number)==true){
            System.out.println("yes! \n"+number+" is  prime number");
        }else{
            System.out.println("No! \n"+number+" is  not a prime number");
        }
        scan.close();
    }

    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
    }

}

