package com.jj;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Exercici1 {


    public static String fitxerOrigen = "fitxers_examen_2019_2020";
    public static File file = new File(fitxerOrigen);
    public static String[] directorisList = file.list();



    public static void main(String[] args) throws IOException {

        int existeix = 0;

        for (int i = 0; i < directorisList.length; i++) {
            System.out.println(directorisList[i]);
            if (!directorisList[i].equals("exercici1"))
            {
               existeix++;
            }
        }
        System.out.println("======================");
        if (existeix== directorisList.length)
        {
            System.out.println("no esixteix els directoris que vols trobar");
            System.out.println("es crearan uns nous");

            String ex1 = fitxerOrigen + "/exercici1";
            File nouExercici1 = new File(ex1);
            nouExercici1.mkdir();
            String patataN = ex1 +"/patata";
            File novaPatata = new File(patataN);
            novaPatata.mkdir();
            String nouIndex = patataN + "/index.txt";
            File nouIn = new File(nouIndex);
            nouIn.createNewFile();

            FileWriter escriuIndex = new FileWriter(nouIn);
            escriuIndex.write("hola\n");
            escriuIndex.write("que ace");
            escriuIndex.close();

            File dirCp = new File(fitxerOrigen +"/dirACopiar");

            FileUtils.copyDirectory(new File(fitxerOrigen + "/dirACopiar"), novaPatata);

        }
        else
        {
            FileUtils.copyFileToDirectory(new File(fitxerOrigen + "/exercici1/patata/index.txt"), new File(fitxerOrigen));
            File [] arxius = new File(fitxerOrigen +"/exercici1/patata").listFiles();

            ArrayList<String> lista = new ArrayList<>();
            for (File comprovacio :
                    arxius)
            {
                String noms = comprovacio.getName();
                //System.out.println(noms);
                lista.add(noms);
            }
            copiarNomEnFitxers(lista);

            for (File comprovacio :
                    arxius)
            {
                if (comprovacio.isDirectory())
                {
                    FileUtils.deleteDirectory(comprovacio);
                }
                else
                {
                    comprovacio.delete();
                }
            }


            FileUtils.copyFileToDirectory(new File(fitxerOrigen + "/index.txt"), new File(fitxerOrigen + "/exercici1/patata"));

            if (FileUtils.contentEquals(new File(fitxerOrigen + "/index.txt"), new File(fitxerOrigen + "/exercici1/patata/index.txt")))
            {
                System.out.println("el contigunt dels 2 fitxers index es el mateix");
            }
            else
            {
                System.out.println("el contingut dels 2 fitxers index ES DIFERENT");
            }


            System.out.println("el directori exercici1 ja existeix");
        }

    }


    public static void copiarNomEnFitxers(ArrayList introduccio) throws IOException {
        File index1 = new File(fitxerOrigen +"/index.txt");
        FileWriter introduccioIndex = new FileWriter(index1);
        for (Object lis :
                introduccio)
        {
            introduccioIndex.write(String.valueOf(lis)+ "\n");
        }
        introduccioIndex.close();
    }
}
