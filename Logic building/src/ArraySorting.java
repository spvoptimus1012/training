import java.util.Arrays;
public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 2, 4};
		
		Arrays.sort(arr);

	//	for (int i : arr)
	//		System.out.println(i);
		
	//	System.out.println("-- Sorted arrays with Java API");
	//	Arrays.sort(arr);	
	//	for (int i : arr)
	//	{
	//		System.out.println(i);
			
			// Write your logic of sorting array
		//}

		//begin BubbleSort(arr)  
		//   for all array elements  
		//      if arr[i] > arr[i+1]  
		//         swap(arr[i], arr[i+1])  
		 //     end if  
		//   end for     
		//   return arr     
		//end BubbleSort  
		long start = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<i-1; j++) {
				if(arr[i] < arr[j]) {
					int x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
					
				}
			
		}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + "ms");
		//print the array
		for (int i : arr)
			System.out.println(i);
		
        // Outer loop
		//start = System.currentTimeMillis();
        //for (int i = 0; i < arr.length; i++) {
 
         //   for (int j = i + 1; j < arr.length; j++) {
 
             //   int temp = 0;
             //   if (arr[j] < arr[i]) {
             //   	if arr[i] > arr[i+1]  
           	//	         swap(arr[i], arr[i+1]) }
 
                    // Swapping
            //        temp = arr[i];
          //          arr[i] = arr[j];
           //         arr[j] = temp;
          //      }
          //  }
          //  end = System.currentTimeMillis();
         //   System.out.println(arr[i] + " ");
    //    }
	}
}
        
        
        
    

	


