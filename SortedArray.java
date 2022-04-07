
public class SortedArray {

	private int[] numbers;     
	private int sorted;      
	int cnt;
	
	public SortedArray(int[] a) {
		numbers = a;
		sorted = 1;
		cnt =1;
		}   
	
	public int getCnt() {
		return cnt;
	}
	private void insertElement(int element){
		int i = sorted - 1 ;         
		while (i >= 0 && numbers[i] > element) { 
			 numbers[i+1] = numbers[i];
			 i--;         
		}
		if (i<0 || numbers[i] != element)
			cnt++;
		numbers[i+1] = element;
		sorted++;     
		}     
	
	public void insertionSort(){
		for(int i = 1; i < numbers.length; i++)
			insertElement(numbers[i]);     
		}  
	
	public int[] getNumbers(){ 
		return numbers;    
	}	
}
