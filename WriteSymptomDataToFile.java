package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter{

	@Override
	public void SetSymptoms(TreeMap<String, Integer> map) {
		// TODO Auto-generated method stub
		//ecrire les resultats nombre d'occurence pour chaque symptom
	
				FileWriter writer;
				try {
					writer = new FileWriter ("result.out");
					for(Entry<String, Integer> entry : map.entrySet())
					{
						System.out.println(entry.getKey() + " : " + entry.getValue());
						
						writer.write(entry.getKey() + " : " + entry.getValue());
					}
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
		
		
	}

}
