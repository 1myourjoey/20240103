package com.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String [] arr = {"김사랑","김하나","김두울", "김세엣"};
		
		String[] newArr = new String[arr.length];
		
		for (String str : newArr) {
			System.out.println(str);
		}// 195p 배열복사
		System.arraycopy(arr, 0, newArr, 0, newArr.length);
		for(String str : newArr) {
			System.out.println(str);
		} // 더 좋아진 배열복사
		String [] newArr1 = Arrays.copyOf(arr, arr.length);
		for (String str:newArr1) {
			System.out.println(str);
		}

	}

}
