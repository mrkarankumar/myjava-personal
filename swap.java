import java.util.Scanner;

public class swap {

  public static void main (String[] args){


Scanner input = new Scanner(System.in);

System.out.println("welcome to swaping  station \n\n");

System.out.println("Enter value of A");

int a = input.nextInt();

System.out.println("Enter value of B");

int b = input.nextInt();

int c = a;

a = b;
b = c;

System.out.println("SWAPING DONE ");
System.out.println("value of A  " +a);

System.out.println("value of B " +b);



  }




}