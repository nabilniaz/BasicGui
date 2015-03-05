import javax.swing.JOptionPane;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
int num1, num2, num3, num4, num5, sum, average;
System.out.println("Enter 5 numbers.");
Scanner numbers = new Scanner(System.in);
num1 = numbers.nextInt();
num2 = numbers.nextInt();
num3 = numbers.nextInt();
num4 = numbers.nextInt();
num5 = numbers.nextInt();
sum = num1+num2+num3+num4+num5;
average = sum/5;

if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1>=num5){
	System.out.println("The max number of those you entered is " + num1);}

else if (num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5)
{System.out.println("The max number of those you entered is " + num2);
}
else if (num3>=num1 && num3>=num2 && num3>=num4 && num3>=num5){
	System.out.println("The max number of those you entered is " + num3);
}
	else if (num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5){
		System.out.println("The max number of those you entered is " + num4);
	}
	else if (num5>=num1 && num5>=num2 && num5>=num3 && num5>=num4)
		System.out.println("The max number of those you entered is " + num5);



if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1<=num5){
	System.out.println("The min number of those you entered is " + num1);}

else if (num2<=num1 && num2<=num3 && num2<=num4 && num2<=num5)
{System.out.println("The min number of those you entered is " + num2);
}
else if (num3<=num1 && num3<=num2 && num3<=num4 && num3<=num5){
	System.out.println("The min number of those you entered is " + num3);
}
	else if (num4<=num1 && num4<=num2 && num4<=num3 && num4<=num5){
		System.out.println("The min number of those you entered is " + num4);
	}
	else if (num5<=num1 && num5<=num2 && num5<=num3 && num5<=num4)
		System.out.println("The min number of those you entered is " + num5);

System.out.println("The sum is " + sum);
System.out.println("The average is " + average);

}

}
