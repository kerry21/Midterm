import static org.junit.Assert.*;

import org.junit.Test;

public class junitTest {

	@Test
	public void test() {
		Sorting sort = new Sorting();
		int[] a  ={2,9,4,7,3,8};
		sort.insertionSort(a);
		sort.isSorted(a);
		Sorting.quicksort(a);
		Sorting.swap(a, 1, 3);

	}
	

	
	
	@Test
	public void test1() {
		Sorting s = new Sorting();
		int[] a  ={1,2,3,4,5};
		s.insertionSort(a);
		s.isSorted(a);
		Sorting.quicksort(a);
		Sorting.swap(a, 3, 1);

	}
	@Test
	public void test2() {
		Sorting s = new Sorting();
		int[] a  ={6,2,1,2,2,2,2,2,2,2,22,2,2,2,2,2,3};
		s.insertionSort(a);
		s.isSorted(a);
		Sorting.quicksort(a);
		Sorting.swap(a, 1, 3);

	}
	@Test
	public void test3() {
		Sorting s = new Sorting();
		int[] a  ={17,13,8,4,7,6,5,4,3,14,13,12,11,10,2,1};
		s.insertionSort(a);
		s.isSorted(a);
		Sorting.quicksort(a);
		Sorting.swap(a, 1, 3);

	}
}


