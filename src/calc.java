import java.util.Scanner;

public class calc
{
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to the online calculator");
		System.out.println("Please choose a function:");
		System.out.println("+		-");
		System.out.println();
		System.out.println("x		/");
		String function = read.next();
		if(function.equals("+"))
		{
			System.out.println("Please enter your first number");
			double number = read.nextDouble();
			System.out.println("Please enter your second number");
			double number1 = read.nextDouble();
			System.out.println("Do you have any other numbers?");
			String ans = read.next();
			if(ans.equalsIgnoreCase("no"))
			{
			double sum = (number + number1);
			System.out.println(number + " + " + number1 + " = " + sum);
			}
			else if(ans.equalsIgnoreCase("yes"))
			{
				System.out.println("Please enter your third number");
			    double number2 = read.nextDouble();
			    System.out.println("Please enter your fourth number, and if you dont have one press enter");
			    read.nextLine();
			    String answer3 = read.nextLine();
			    double number3 = 0;
			    if(answer3.equals("")) {
			    	 double sum = (number + number1 + number2);
					 System.out.println("Your sum is " + sum);
			    }
			    else {
			    	number3 = Double.parseDouble(answer3);
			    	System.out.println("Please enter your fifth number, and if you dont have one press enter");
			    	String answer4 = read.nextLine();
				    double number4 = 0;
				    if(answer4.equals("")){
				    	double sum = (number + number1 + number2 + number3);
						System.out.println("Your sum is " + sum);
				    }
				    else{
				    	number4 = Double.parseDouble(answer4);
				    	double sum = number + number1 + number2 + number3 + number4;
				    	System.out.println("Your answer is " + sum);
				    }
			    }
			    
			    //double sum = (number + number1 + number2 + number3 + number4);
			    //System.out.println("Your sum is " + sum);
			   
			}
			
		}
		else if(function.equalsIgnoreCase("-"))
		{
			System.out.println("Please enter you first number");
			double number = read.nextDouble();
			System.out.println("Please enter your second number");
			double number1 = read.nextDouble();
			System.out.println("Do you have any other numbers?");
			String ans = read.next();
			if(ans.equalsIgnoreCase("no"))
			{
				double sum = (number - number1);
				System.out.println(number + " - " + number1 + " = " + sum);
			}
			else if(ans.equalsIgnoreCase("yes"))
			{
				System.out.println("Please enter your third number");
			    double number2 = read.nextDouble();
			    System.out.println("Please enter your fourth number, and if you dont have one press enter");
			    read.nextLine();
			    String answer3 = read.nextLine();
			    double number3 = 0;
			    if(answer3.equals("")){
			    	double sum = (number - number1 - number2);
			    	System.out.println("Your difference is " + sum);
			    }
			    else{
			    	number3 = Double.parseDouble(answer3);
			    	System.out.println("Please enter your fifth number, and if you dont have one press enter");
				    String answer4 = read.nextLine();
				    double number4 = 0;
				    if(answer4.equals("")){
				    	double sum = (number - number1 - number2 - number3);
				    	System.out.println("Your difference is " + sum);
				    }
				    else{
				    	number4 = Double.parseDouble(answer4);
				    	double sum = (number - number1 - number2 - number3 - number4);
				    	System.out.println("Your differnce is " + sum);
				    }
				    
			    }
			    
			}
		}
		else if(function.equals("x"))
		{
			System.out.println("Please enter you first number");
			double number = read.nextDouble();
			System.out.println("Please enter your second number");
			double number1 = read.nextDouble();
			System.out.println("Do you have any other numbers?");
			String ans = read.next();
			if(ans.equalsIgnoreCase("no"))
			{
				double sum = (number * number1);
				System.out.println(number + " x " + number1 + " = " + sum);
			}
			else if(ans.equalsIgnoreCase("yes"))
			{
				System.out.println("Please enter your third number");
			    double number2 = read.nextDouble();
			    System.out.println("Please enter your fourth number, and if you dont have one press enter");
			    read.nextLine();
			    String answer3 = read.nextLine();
			    double number3 = 0;
			    if(answer3.equals("")){
			    	double sum = (number*number1*number2);
			    	System.out.println("Your product is " + sum);
			    }
			    else{
			    	number3 = Double.parseDouble(answer3);
			    	System.out.println("Please enter your fifth number, and if you dont have one press enter");
			    	String answer4 = read.nextLine();
			    	double number4 = 0;
			    	if(answer4.equals("")){
			    		double sum = (number * number1 * number2 * number3);
			    		System.out.println("Your product is " + sum);
			    	}
			    	else{
			    		number4 = Double.parseDouble(answer4);
			    		double sum = (number * number1 * number2 * number3 * number4);
			    		System.out.println("Your product is " + sum);
			    	}
			    }
			    
			}
		}
		else if(function.equals("/"))
		{
			System.out.println("Please enter you first number");
			double number = read.nextDouble();
			System.out.println("Please enter your second number");
			double number1 = read.nextDouble();
			System.out.println("Do you have any other numbers?");
			String ans = read.next();
			if(ans.equalsIgnoreCase("no"))
			{
				double sum = (number / number1);
				System.out.println(number + " / " + number1 + " = " + sum);
			}
			else if(ans.equalsIgnoreCase("yes"))
			{
				System.out.println("Please enter your third number");
			    double number2 = read.nextDouble();
			    System.out.println("Please enter your fourth number, and if you dont have one enter 1");
			    double number3 = read.nextDouble();
			    System.out.println("Please enter your fifth number, and if you dont have one enter 1");
			    double number4 = read.nextDouble();
			    double sum = (number / number1 / number2 / number3 / number4);
			    System.out.println("Your quotient is " + sum);
			}
		}
	}
}