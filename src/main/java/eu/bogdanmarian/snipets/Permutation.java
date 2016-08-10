package eu.bogdanmarian.snipets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
	public static Set<Integer[]> getPermutations(Integer[] num) {
		if (num == null) {
			throw new IllegalStateException("You are trying to generate permutations of a null array");
		}

		Set<Integer[]> perms = new HashSet<>();

		/**
		 * the base case
		 */
		if (num.length == 0) {
			perms.add(new Integer[0]);
			return perms;
		}

		/**
		 * select the first item and then sub permutation of the remaining items
		 * and then insert the first item into each position of each sub
		 * permutation recursively
		 */

		int first = num[0];
		Integer[] remainder = Arrays.copyOfRange(num, 1, num.length);
		Set<Integer[]> subPerms = getPermutations(remainder);
		for (Integer[] subPerm : subPerms) {
			for (int i = 0; i <= subPerm.length; i++) {
				Integer[] newPerm = Arrays.copyOf(subPerm, subPerm.length + 1);
				for (int j = newPerm.length - 1; j > i; --j) {
					newPerm[j] = newPerm[j - 1];
				}
				newPerm[i] = first;
				perms.add(newPerm);
			}
		}

		return perms;
	}
}
