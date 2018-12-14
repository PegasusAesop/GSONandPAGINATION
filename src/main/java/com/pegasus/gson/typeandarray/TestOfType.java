package com.pegasus.gson.typeandarray;

import com.google.gson.Gson;

public class TestOfType {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		//1简单类型转化为json
		String intStr=gson.toJson(1);
		String strStr=gson.toJson("hello,aesop");
		String LongStr=gson.toJson(new Long(10));
		
		System.out.println(intStr);
		System.out.println(strStr);
		System.out.println(LongStr);
		
		//2json 转化为简单数据类型；
		int id1=gson.fromJson("1", int.class);
		Integer id2=gson.fromJson("100", Integer.class);
		Boolean boolean1=gson.fromJson("true", Boolean.class);
		String str=gson.fromJson("pegasus", String.class);
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(boolean1);
		System.out.println(str);
		
		//3java array 转化为json
		String[] strs= {"pegasus","richard","aesop"};
		int[][] intInt= {{1,2,3},{4,5,6},{7,8,9},{0,1,2}};		
		
		String intIntStr=gson.toJson(intInt);
		String Stringstrs=gson.toJson(strs);
		
		System.out.println(intIntStr);
		System.out.println(Stringstrs);
		
		//4json 转化为java array
		int[][] intIntFrom=gson.fromJson(intIntStr, int[][].class);
		for(int i=0;i<intIntFrom.length;i++) {
			for(int j=0;j<intIntFrom[i].length;j++) {
				System.out.print(intIntFrom[i][j]);
				
				if(j<intIntFrom[i].length-1) {
					System.out.print(",");
				}
			}
			System.out.print("\t");
		}
		
		String[] strsArray=gson.fromJson(Stringstrs, String[].class);
		System.out.println();
		for(String str1:strsArray) {
			System.out.println(str1);
			
		}
	}
}
