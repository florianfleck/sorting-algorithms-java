
public class CountingSort
{
    
    int Array[] = new int [100000];
    
  
    public CountingSort()
    {
        
     
    
        
    
     long sta = System.nanoTime();
     countingSort(Array); 
     long sto = System.nanoTime();
     long d2 = sto-sta;
     System.out.println(d2);   
    }


   public int[] countingSort(int[] Numbers) {
	
	int max = Numbers[0];
	for (int i = 1; i < Numbers.length; i++) {
		
		if (Numbers[i] > max)
			max = Numbers[i];
	}

	
	int[] sortedNumbers = new int[max+1];

	
	for (int i = 0; i < Numbers.length; i++) {
		
		sortedNumbers[Numbers[i]]++;
	}

	
	int insertPosition = 0;

	
	for (int i = 0; i <= max; i++) {
		
		for (int j = 0; j < sortedNumbers[i]; j++) {
			
			Numbers[insertPosition] = i;
			insertPosition++;
		}
	}
	return Numbers;
}
    
}
