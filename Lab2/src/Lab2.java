
public class Lab2 {
	
	//Implement linear search
	public static int linearSearch(String[] listNames, String key) {
		
		for(int i = 0;i < listNames.length ;i++){
			//checks names -> not case sensitive
			if (  listNames[i].toLowerCase().equals(key.toLowerCase())  ) {
				System.out.println("LinearSearch implemented:  Match found @ index :" + i );
				return 1;
				}  	
		}
		System.out.println("LinearSearch implemented:  no match");
		return -1;
	}
			//(str1.equals(str2))check if same
	//----------------------------------------------------------------------------------
	
	//Binary search  RECURSIVELY 
	
	public static int binarySearch(String[] listNames,String key, int low, int high) {
	
		if (low <= high) {
			int mid = (low+high)/2;
			
			if(listNames[mid].toLowerCase().equals(key)) {
				System.out.println("Binary Search implemented: Match found @ index :" + mid );
				return mid;
			}
			
			/*  .compareToIgnoreCase returns an INTEGER
			 	you are comparing string1 and string2
			 	if string1 comes BEFORE string2 alphabetically, then a negative number is returned
			 	if string1 is the same as string2, zero is returned
			 	if string1 comes AFTER string2 alphabetically, then a positive number is returned
			*/
			
			if(listNames[mid].compareToIgnoreCase(key) < 0 ) { 
				System.out.println("Searching upper Half");
				return binarySearch(listNames, key, mid+1 , high);
				
			}		
			if(listNames[mid].compareToIgnoreCase(key) > 0) {
				System.out.println("Searching lower Half");
				return binarySearch(listNames, key, low, mid-1);
				
			}
		}
		System.out.println("Binary Search implemented:  the key does not exist in list");
		return -1; //
		
		
	}
		
	
	
	public static void main(String[] args) {
		
		//list of 26 names already in alpha order
		String[] listOfNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivan", "Julia", "Katherine", "Liam", "Mia", "Noah", "Olivia", "Penelope", "Quinn", "Ryan", "Sofia", "Theodore", "Uma", "Victor", "Willow", "Xander", "Yasmine", "Zachary"
		};
		
		
		
		linearSearch(listOfNames,  "zaChaRy");
		
		
		binarySearch(listOfNames,"zachary",0,26); 
	
		
	
		
	}
}
