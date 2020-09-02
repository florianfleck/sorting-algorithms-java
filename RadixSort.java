
public class RadixSort
{
    
   int Array[] = new int [100000];
   
 
  public RadixSort()
  {
    
    int length = Array.length;  
    long sta = System.nanoTime();
    radixsort(Array, length); 
    long sto = System.nanoTime();
    long d2 = sto-sta;
    System.out.println(d2);
   
  }
   
  public int maximum(int Array[], int length) 
  {
    int max = Array[0]; 
    for (int a = 1; a < length; a++){ 
      if (Array[a] > max){
        max = Array[a]; 
    } 
    } 
    return max; 
  }
   
   
   public void countingsort(int Array[], int length, int faktor) 
  {                                                             
    int output[] = new int[length];
    int a = 0;
    int counting[] = new int[length];
    int t = 0;
    while(counting.length > t){ 
     counting[t] = 0;           
     t++;
    } 
    
    for (a = 0; a < length; a++){
      counting[ (Array[a]/faktor)%10 ]++;
    }
    for (a = 1; a < length; a++){
      counting[a] = counting[a] + counting[a-1];
    }   
    for (a = length - 1; a >= 0; a--)
    {
      output[counting[ (Array[a]/faktor)%10 ] - 1] = Array[a];
      counting[ (Array[a]/faktor)%10 ]--;
    }
     
    for (a = 0; a < length; a++){
      Array[a] = output[a];
    }
    }
     
   public int[] radixsort(int Array[], int length)
   {
     
      int m = maximum(Array, length);
       
      for (int faktor = 1; m/faktor > 0; faktor *= 10){
      countingsort(Array, length, faktor);}
      return Array;
   }
     
 
   public int RandomNumbers() {
 
            int randomNumber = (int)(Math.random()*100); 
            
            return randomNumber;
    }
}

