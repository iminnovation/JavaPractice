package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class MapSortingByValue {
 
    public static void main(String abc[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Monitor", 12200);
        map.put("Mouse", 145);
        map.put("CPU", 12000);
        map.put("WindowsCD", 500);
        map.put("Keyboard", 550);
        map.put("Webcam", 1200);
        map.put("UPS", 1800);
        //Declare Set as String and Integer
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {	//Sort value using compareTo.
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println("Sorting by price"+entry.getKey()+" > "+entry.getValue());
        }
    }
}