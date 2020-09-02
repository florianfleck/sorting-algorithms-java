
public class Gnomesort
{
    
    int Array[] = new int [100000];
    
    
    public Gnomesort()
    {
        
        
        for(int i=0; i<=99999 ; i++){
            Array[i] = i;
            
        }
       
        
        long sta = System.nanoTime(); 
        Gnomesort(Array);             
        long sto = System.nanoTime(); 
        long d2 = sto-sta;            
        System.out.println(d2);       
    }

 
    public int[] Gnomesort(int []Array)
    {
        for(int index=1;index<Array.length;){
            if(Array[index-1]<=Array[index]){
                index++;
            }    
            else{ int remember = Array[index];
                  Array[index] = Array[index-1];
                  Array[index-1] = remember;
                  index--;
                  if(index == 0){
                      index=1;
                    }    
                }
            }    
        return Array;    
    }
    
    public int RandomNumbers() {
 
            int randomNumber = (int)(Math.random()*100); 
                                                       
            
            return randomNumber;                         
    }
}
    
    
    
    
    

