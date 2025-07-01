# The-Doomed-Dice-Challenge-SECURIN---Sample-task-
This is one of the sample tasks given by securin, for their interview process preparation

**Problem Statement: The Doomed Dice Challenge**

The below problems must be solved & implemented in Python/Java/Ruby/C++/Go.

You are given two six-sided dice, Die A and Die B, each with faces numbered from 1 to 6.
You can only roll both the dice together & your turn is guided by the obtained sum.
Example: Die A = 6, Die B = 3. Sum = 6 + 3 = 9

You may represent Dice as an Array or Array-like structure.
Die A = [1, 2, 3, 4, 5, 6], where the indices represent the 6 faces of the die & the value on each face.

Part-A (15–20 Minutes):
1. How many total combinations are possible? Show the math along with the code!
2. Calculate and display the distribution of all possible combinations that can be obtained when rolling both Die A and Die B together. Show the math along with the code!
   Hint: A 6 x 6 Matrix.
3. Calculate the probability of all possible sums occurring among the number of combinations from (2).
   Example: P(Sum = 2) = 1/X as there is only one combination possible to obtain Sum = 2. Die A = Die B = 1

```java
import java.util.*;
class Calculate{
	public void Dice_Combo(int[] Dice1,int[] Dice2) {

		int count=0;
		for(int i=1;i<=Dice1.length;i++) {
	 	   for(int j=1;j<=Dice2.length;j++) {
	 		   System.out.print("(" + i + "," + j + ")");
	 		   count++;
	 	   }
	 	   System.out.println();
	    }
	    System.out.println("Therefore the total possible Combinations are :" + count);

	 	   System.out.println();
	}
	
	public void Sum_Distributions(int[] Dice1,int[] Dice2) {

		int count=0;
		for(int i=1;i<=Dice1.length;i++) {
		 	   for(int j=1;j<=Dice2.length;j++) {
		 		   System.out.print("("+(i+j)+")");
		 		   count++;
		 	   }
		 	   System.out.println();
		    }

	 	   System.out.println();
	}
	HashMap<Integer,Integer> sums=new HashMap<>();
	public void Sum_Probabilities(int[] Dice1,int[] Dice2) {

		int count=0;
		for(int i=1;i<=Dice1.length;i++) {
		 	   for(int j=1;j<=Dice2.length;j++) {
		 		   sums.put((i+j),sums.getOrDefault(i+j,0)+1);
		 		   count++;
		 	   }
		 	   System.out.println();
		}
		for(Map.Entry<Integer,Integer> entry:sums.entrySet()) {
			double result= (double) entry.getValue()/count;
			System.out.printf("P(Sum = %d) = %d/36 = %.2f\n", entry.getKey(), entry.getValue(), result);
		}
	}
}
public class PARTA_A {
	public static void main(String[] args) {
       int[] Dice1= {1,2,3,4,5,6};
       int[] Dice2= {1,2,3,4,5,6};
       int choice=0;
       Scanner sc=new Scanner(System.in);
       

	   Calculate obj1=new Calculate();
       while(choice!=4) {
    	   System.out.println("1. To Show all possible Dice Combination(2 Dice rolled together).");
           System.out.println("2. To Show all possible Dice Combination sum(2 Dice rolled together).");
           System.out.println("3. To Show all possible Dice Combination(2 Dice rolled together).");
           System.out.println("4. Exit");
           System.out.println("\n");
           

           System.out.println("Enter Your Choice: ");
           
    	   choice=sc.nextInt();
    	   switch(choice) {
           case 1:
        	   obj1.Dice_Combo(Dice1, Dice2);
        	   break;
           case 2:
        	   obj1.Sum_Distributions(Dice1, Dice2);
        	   break;
           case 3:
        	   obj1.Sum_Probabilities(Dice1, Dice2);
        	   break;
           case 4:
        	   System.out.println("Exiting...");
        	   break;
           default:
        	   System.out.println("Invalid Choice.\n");
        	   break;
           }
           
       }

	   System.out.println("Exited.");
	}
}
