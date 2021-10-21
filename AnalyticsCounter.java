package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		//recuperation des symptoms
		List<String> listeSymptoms = new ArrayList<String>();
		ReadSymptomDataFromFile rs = new ReadSymptomDataFromFile("symptoms.txt");
		listeSymptoms = rs.GetSymptoms();
		
		//trie des symptoms 
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		//comptage de nombre d'occurence
		for(String element : listeSymptoms)
		{
			if(map.containsKey(element))
			{
				map.put(element, map.get(element) + 1);
			}
			else
			{
				map.put(element, 1);
			}
		}
		
		//ecriture des symptoms
		WriteSymptomDataToFile ws = new WriteSymptomDataToFile();
		ws.SetSymptoms(map);
		
		
		
		
	
		
		

	}
}
