import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		
		int count = 1;
		while (true) {
			numbers.add(rand.nextInt());
			if (count++ % 10000 == 0) {

				System.out.println(numbers.size() + "\n\n\n====\n\n\n");

				int mb = 1024*1024;
         
		        //Getting the runtime reference from system
		        Runtime runtime = Runtime.getRuntime();
		         
		        System.out.println("##### Heap utilization statistics [MB] #####");
		         
		        //Print used memory
		        System.out.println("Used Memory:"
		            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
		 
		        //Print free memory
		        System.out.println("Free Memory:"
		            + runtime.freeMemory() / mb);
		         
		        //Print total available memory
		        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
		 
		        //Print Maximum available memory
		        System.out.println("Max Memory:" + runtime.maxMemory() / mb);

			}
		}
	}
}
