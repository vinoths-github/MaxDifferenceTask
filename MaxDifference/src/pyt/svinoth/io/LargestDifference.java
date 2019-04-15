package pyt.svinoth.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LargestDifference {

	public static void main(String[] args) {
		Integer a[], n,i;
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new Integer[n];
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Maximum Difference : " + calculateDifference(a,n));
		
	}

	private static Integer calculateDifference(Integer[] a, Integer n) {
		Integer i,imax = 1, imin = 0, currmin = 0, diff = 0;
		//Stack<Integer> st = new Stack<>();
		for(i=1;i<n;i++) {
			if(a[i] < a[currmin]) {
				currmin = i;
			}
			if(a[imax] < a[i]) {
				imax = i;
				if(a[currmin] < a[imin]) {
					imin = currmin;
				}
				/*for(int j=imin;j<imax;j++) {
					if(a[imin] > a[j])
						imin = j;
				}*/
			}
			if(diff < (a[imax]-a[imin]))
				diff = a[imax] - a[imin];
			System.out.println("imax:"+ imax);
			System.out.println("imin:"+ imin);
			System.out.println(diff);
		}
		return diff;
	}
}
