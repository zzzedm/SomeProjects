package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(5);
		a.add(3);
		a.add(5);
		a.add(2);
		
		for(int i = 0;i<3;++i) {
			System.out.println(a.get(i));
		}
	}
}
