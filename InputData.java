import java.util.Scanner;
public class InputData{

public static void main(String data[]){
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	int i = 0;
	System.out.println("Enter a Number : ");
	i = sc1.nextInt();
	
	System.out.println("Enter a Name : ");
	String name= sc2.nextLine();
	System.out.println("Enter Reg Number : ");
	String reg= sc2.nextLine();
	System.out.printf("Your Enter Number is %d \n",i);
	System.out.printf("Your Enter Name is %s \n",name);
	System.out.printf("Your reg Number is %s \n",reg);
	}

}