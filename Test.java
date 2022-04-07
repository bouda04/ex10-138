import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] data = {2,2,-1,2,17};
		
		SortedArray s = new SortedArray(data);
		s.insertionSort();
		System.out.println(Arrays.toString(data));
		System.out.println(s.getCnt());
	}

}
