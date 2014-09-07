package io.brianweiser.cracking;

import java.util.HashSet;

public class ArrayString {
	public static boolean allUnique(String str) {
		HashSet<Character> set = new HashSet<Character>(str.length(), 1);
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (set.contains(c)) {
				return false;
			} else {
				set.add(c);
			}
		}
		
		return true;
	}
}
