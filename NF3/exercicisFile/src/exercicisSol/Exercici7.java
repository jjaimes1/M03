package exercicisSol;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Crear un programa que llegeixi un fitxer de text, per a cada caràcter
 * guardarem les seves repeticions i guardarem un fitxer de sortida que
 * contingui. Caracter, repeticions, percentatge.
 * 
 *
 */
public class Exercici7 {
	public static void main(String[] args) throws IOException {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String arxiu = "a.txt";
		File file1 = new File("a.txt");
		FileReader freader =  new FileReader(file1);
			int llegit=-1;
			int total = 0;
			while ((llegit = freader.read()) > 0) {
				if ( map.containsKey(new Character((char)llegit))) {
					map.put(new Character((char) llegit), map.get(new Character((char)llegit)) + 1);
				} else {
					map.put(new Character((char) llegit), new Integer(1));
				}
				total++;
			}

			escriureResultatsArxiu(map, total);


			freader.close();

	}

	private static void escriureResultatsArxiu(Map<Character, Integer> map,
			int total) throws IOException {
		FileWriter fwriter = null;
		try {
			fwriter = new FileWriter(new File("resultat.txt"));
			Set<Character> set = map.keySet();
			for (Character character : set) {
				fwriter.write("caràcter: " + character + " repeticions: "
						+ map.get(character) + " percentatge: "
						+ map.get(character) * 100 / total+"% \n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			fwriter.close();
		}
	}
}
