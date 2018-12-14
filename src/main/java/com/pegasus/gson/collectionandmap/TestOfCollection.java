package com.pegasus.gson.collectionandmap;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestOfCollection {

	public static void main(String[] args) {
		
		Gson gson=new Gson();
		//1.Map to json
		Map<String,Object> map=new HashMap<>();
		map.put("name", "Aesop");
		map.put("sex", "male");
		map.put("age", 5);
		//Map 转json
		String jsonMap=gson.toJson(map);
		System.out.println(jsonMap);
		
		//2.json to Map;
		Type type=new TypeToken<Map<String,Object>>() {}.getType();
		Map<String,Object> map2=gson.fromJson(jsonMap, type);
		
		for(Map.Entry<String, Object> entry:map2.entrySet()) {
			System.out.println("key= "+entry.getKey()+" and value= "+entry.getValue());
		}
		
		List<Object> nameList=new ArrayList<>();
		nameList.add("Hello");
		nameList.add(map);
		nameList.add("Aesop");
		
		String jsonNames=gson.toJson(nameList);
		System.out.println(jsonNames);
		
		type=new TypeToken<List<Object>>() {}.getType();
		List<Object> list=gson.fromJson(jsonNames, type);
		for(Object o:list) {
			System.out.println(o);
		}
		
		
		
		
		
	}
}
