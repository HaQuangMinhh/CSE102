package nhap;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class First_occurence {
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// input 
	public static int[] input() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for ( int i = 0; i < n; i++) {
			arr[i] = rd.nextInt();
		}
		return arr;
	}
	// output 
	public static void output(int[] a) {
		for ( int i : a)
			System.out.println(i+ " ");
		System.out.println();
	}
	// xoa trung
	public static int[] xoa_trung(int[] a) {
		for ( int i = 0; i < a.length ; i++) {
			if ( find_X ( a, a[i], i)) {
				a = xoavt(a, i);
				i--;
			}
		}
		return a;
	}
	// find X
}
