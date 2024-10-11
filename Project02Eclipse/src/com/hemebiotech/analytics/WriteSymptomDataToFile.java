package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile  implements ISymtomWriter{
	
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("result.out"));

				for (Map.Entry<String, Integer > symptome : symptoms.entrySet())
				{
					writer.write(symptome.getKey() + " " + symptome.getValue());
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	

	/*le corps de la méthode writeSymptoms qui écrit les symptômes 
	 * et leurs quantités dans le fichier result.out au même format que précédemment.
	 */
}
