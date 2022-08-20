package bg;
import java.util.*;
public class Fibbo {
	
		  public static void main(String[] args) {
			int n,fst=0,sst=1  ;
			System.out.println("Enter a number");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			for(int i=0;i<n;i++) {
				System.out.print(fst+",");
				int nst=fst+sst;
				fst=sst;
				sst=nst;
					
					

		    /*int n = 10, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; i++) {
		      System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;*/

		    }
		  }
		}
