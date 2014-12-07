import java.util.*;
import java.io.*;
import java.nio.file.*;


public class Main {
	public static void main(String[] args) throws Exception {
		List<Object> blobs = new ArrayList<Object>();		
		
		int count = 1;

		while (true) {
			blobs.add(loadFile());
			if (++count % 50 == 0) {
				printStatistics();
			}
		}
	}

	public static Object loadFile() throws Exception {		
		return Files.readAllBytes(Paths.get(new File("large.blob").toURI()));
	}

	public static void printStatistics() {
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
