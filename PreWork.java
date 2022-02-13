import java.util.Scanner;
public class PreWork{

     
        Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.print("Enter a number:");
    	   Scanner sc = new Scanner(System.in);
    	   try
    	   {
    	   int enteredNum = sc.nextInt();
    	   int reversedNum = 0, temp = enteredNum, remainder = 0; 
    	   while(temp > 0)
    	   {
    		remainder = temp % 10;
    		reversedNum = reversedNum*10 + remainder;
    		temp /= 10;
    	   }
    	   
    	   if(enteredNum == reversedNum)
    	   {
    		   System.out.println(enteredNum+" is a palindrome number."); 
    	   }
    	   else
    	   {
    		   System.out.println(enteredNum+" is not a palindrome number."); 
    	   }
    	   }catch(Exception e)
    	   {
    		   System.out.println("Invalid input");
    	   }
      }

 

            //function to printPattern

       public void printPattern() {
    	   System.out.print("Enter a number:");
    	   Scanner sc = new Scanner(System.in);
    	   try
    	   {
    		   int rows = sc.nextInt();
    		   int columns = 0;
    		   do {
    			   columns = rows;    		
    			   do {
        			   System.out.print("*");
        			   columns--;
        		   }while(columns > 0);
    			   System.out.println();
    			   rows--;
    		   }while(rows > 0);
    		   
    	   }catch(Exception e)
    	   {
    		   System.out.println("Invalid input");
    	   }

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.print("Enter a number:");
     	   Scanner sc = new Scanner(System.in);
        	try
     	   {
        		int num = sc.nextInt();
        		boolean isPrime = true;
        		if(num==0||num==1){  
         		   System.out.println(num+" is not prime number");      
         		  }else{  
         		   for(int i=2;i<=num/2;i++){      
         		    if(num%i==0){      
         		     System.out.println(num+" is not prime number");      
         		     isPrime = false;      
         		     break;      
         		    }      
         		   }      
         		   if(isPrime)  { System.out.println(num+" is prime number"); }  
         		  }
     		   
     	   }catch(Exception e)
     	   {
     		   System.out.println("Invalid input");
     	   }
        	

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           System.out.print("Enter a number:");
     	   Scanner sc = new Scanner(System.in);
        	try
     	   {
        		int num = sc.nextInt();       	
     		   	num = num-2;
     		   	int sum = 0;
     		   	System.out.print(first+", "+second+", ");
     		   	do {
     		   		sum = first+second;
     		   	System.out.print(sum);
     		   		if(num-1>0)
     		   		{
     		   			System.out.print(", ");
     		   		}
     		   	 first = second;
     		   	 second = sum;
     		   	 num--;
     		   	}while(num>0);
     		   System.out.println();
     	   }catch(Exception e)
     	   {
     		   System.out.println("Invalid input");
     	   }
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                PreWork obj = new PreWork();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();


switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
     
