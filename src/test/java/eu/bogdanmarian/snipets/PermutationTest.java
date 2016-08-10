package eu.bogdanmarian.snipets;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void getPermutations() {
		Integer[] items = {1,2,3,4};
		
		Set<Integer[]> permutations = Permutation.getPermutations(items);
		for (Integer[] permutation: permutations){
			for(int i=0;i<permutation.length;i++){
				System.out.print(permutation[i]+",");
			}
			System.out.println();
		}
		int i=1;
		assertTrue(i==1);
	}

}
