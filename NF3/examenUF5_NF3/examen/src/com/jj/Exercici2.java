package com.jj;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Exercici2
{

    public static String fitxerOrigen = "fitxers_examen_2019_2020";
    public static File file = new File(fitxerOrigen);

    public static void main(String[] args) throws IOException
    {
        File prop = new File(fitxerOrigen + "/fitxerProperties.txt");
        File prop2 = new File(fitxerOrigen + "/fitxerProperties2.txt");
        FileReader propRead = new FileReader(prop);
        BufferedReader readProp = new BufferedReader(propRead);

        FileWriter propWrite2 = new FileWriter(prop2);
        BufferedWriter writeProp = new BufferedWriter(propWrite2);
        String linea;


        String valor1= "Class_Name";
        String valor2 = "Overall_Strength_Index";
        String valor6 = "approximately 30 - 50";

        while ((linea = readProp.readLine()) != null) {
            //System.out.println(linea);
            if (linea.contains(valor1))
            {
                System.out.println("S'ha trobat la clau: " + valor1);
                System.out.println("i el seu valor es: "+ linea.substring(11));
            }
            if (linea.contains(valor2)) {
                System.out.println("S'ha modificar el valor de la clau: "+ valor2);
                writeProp.write(linea+ "_2");
            }
            else {
                writeProp.write(linea+ "\n");
            }
            if (linea.contains("50"))
            {
                System.out.println("S'ha trobat el valor 50");
            }
            if (linea.contains(valor6))
            {
                System.out.println("S'ha trobat el valor: "+ valor6);
            }

            if (linea.contains("227"))
            {
                System.out.println("S'ha trobat el valor: 227");
            }

            if (linea.contains("227_2"))
            {
                System.out.println("S'ha trobat el valor: 227_2");
            }
            else
            {
                System.out.println("NO s'ha trobat el valor: 227_2");
            }

        }
        readProp.close();
        writeProp.close();
        FileUtils.forceDelete(prop);
        FileUtils.copyFile(prop2,prop);
        FileUtils.forceDelete(prop2);
    }
}
