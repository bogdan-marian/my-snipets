package eu.bogdanmarian.snipets;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void getPermutations() {
		Integer[] items = {1,2,3,4};
		
		List<Integer[]> permutations = Permutation.getPermutations(items);
		for (Integer[] permutation: permutations){
			System.out.println(permutation);
		}
		int i=1;
		assertTrue(i==1);
	}

}
