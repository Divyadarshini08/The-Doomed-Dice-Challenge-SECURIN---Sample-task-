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
