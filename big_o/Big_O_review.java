package java_review_part_1;
import java.util.*; 


public class Big_O_review {

	//worst case is O(n) 
	public static void findNemo(ArrayList<String> givenArray) {
		//start
		long startTime = System.nanoTime(); 
		
		for (int i = 0; i < givenArray.size(); i++) {
			if(givenArray.get(i) == "nemo") {
				System.out.println("found nemo!");
			}
		}
		
		long elapsedTime = System.nanoTime() - startTime; 
		
	
		
		System.out.println("total time took: "  + (float) elapsedTime/1000000 + " milliseconds");
	}
	
		
	public static void main(String[] args) {
		
		ArrayList<String> aArray = new ArrayList<String>(); 
		aArray.add("nemo");
		
		
		ArrayList<String> aArray2 = new ArrayList<String>(); 

		for(int i = 0; i < 1000; i++) {
			aArray2.add("none"); 
		}
		
		findNemo(aArray);
		findNemo(aArray2);
	}

}
