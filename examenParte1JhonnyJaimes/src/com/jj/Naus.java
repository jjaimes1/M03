package com.jj;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Naus
{
    public static Set<Naus_Dades> setDeNaus = new LinkedHashSet<Naus_Dades>();


    public static void menu_1() {



        String str = "2001-12-01 23:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataTmp = LocalDateTime.parse(str, formatter);
        LocalDateTime today= LocalDateTime.now();

        setDeNaus.add(new Naus_Dades("Agamemnon", "destructor", "Omega", today, "Enviat a la flota de Babylon 5"));
        setDeNaus.add(new Naus_Dades("Achilles", "destructor", "Omega", today, "Enviat a la flota de Babylon 5"));
        setDeNaus.add(new Naus_Dades("Cortez", "explorador", "Explorer", dataTmp, "Enviat a l'espai profund"));
        setDeNaus.add(new Naus_Dades("Excalibur", "creuer pesat", "Hyperion", dataTmp, "Enviat a la flota de Babylon 5"));
        setDeNaus.add(new Naus_Dades("Prometheus", "creuer pesat", "Hyperion", dataTmp, "Enviat a la flota de Babylon 5"));
        setDeNaus.add(new Naus_Dades("Excalibur", "destructor", "Omega", today, "Enviat a la flota de Mart"));
        setDeNaus.add(new Naus_Dades("Orion", "destructor", "Omega", today, "Enviat a la flota de Mart"));
        setDeNaus.add(new Naus_Dades("Nimrod", "destructor", "Omega", today, "Enviat a la flota de Mart"));


         //System.out.println(setDeNaus);
    }

    //public static void main(String[] arg)
    public static void menu_2()
    {
        PriorityQueue<String> nausOrdenades = new PriorityQueue<>();


        for (Naus_Dades datos : setDeNaus)
        {
            nausOrdenades.add(datos.getNom() + ": "+ datos.getTipus() + " del model " + datos.getModel() + " construit el " + datos.getDataConstruccio() + ". Descripcio: "+ datos.getDescripcio());
        }

        while (!nausOrdenades.isEmpty())
        {
            System.out.println(nausOrdenades.remove());
        }

        //System.out.println(nausOrdenades);


    }

    public static void menu23()
    {
        Scanner in = new Scanner(System.in);
        String descripcio;

        System.out.println("Text que voleu buscar dins de la descrpicio: ");
        descripcio = in.nextLine();

        for (Naus_Dades lista : setDeNaus)
        {
            if (lista.getDescripcio().contains(descripcio))
            {
                System.out.println(lista.getNom());
                System.out.println("    Tipus = " + lista.getTipus());
                System.out.println("    Model = " + lista.getModel());
                System.out.println("    Data de construccio = " + lista.getDataConstruccio());
                System.out.println("    Descripcio = " + lista.getDescripcio());
            }
        }

    }

    //public static void main(String[] args)
    public static void menu_24()
    {
        menu_1();
        LinkedList<Naus_Dades> linkedList = new LinkedList<>();



        linkedList.addAll(setDeNaus);
        Collections.sort(linkedList, new NauComparadorTipus());
        System.out.println(linkedList);

    }

    public static void menu_31()
    {
        Scanner in = new Scanner(System.in);
        String dataNova;

        System.out.println("Data fins a laqual s'esborraran les naus [yyyy-mm-dd]: ");
        dataNova = in.nextLine();
        dataNova = dataNova + " 00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataTmp = LocalDateTime.parse(dataNova, formatter);
/*        for (Naus_Dades lista : setDeNaus)
        {
            if (lista.getDataConstruccio().isBefore(dataTmp))
            {
                System.out.println(lista.getNom() + "(" + lista.getTipus() + " de model " + lista.getModel() + "): data de construccio " + lista.getDataConstruccio() + " ¡¡BORRADO!!");
                setDeNaus.remove(lista);
                //System.out.println(lista + "¡¡BORRADA!!");
            }
            else
            {
                System.out.println(lista);
            }
        }

*/
        Iterator<Naus_Dades> lista1 = setDeNaus.iterator();
        while (lista1.hasNext())
        {
            Naus_Dades lista2 = (Naus_Dades) lista1.next();

            if (lista2.getDataConstruccio().isBefore(dataTmp))
            {
                System.out.println(lista2.getNom() + "(" + lista2.getTipus() + " de model " + lista2.getModel() + "): data de construccio " + lista2.getDataConstruccio() + " ¡¡BORRADO!!");
                lista1.remove();
            }
            else
            {
                System.out.println(lista2.getNom() + "(" + lista2.getTipus() + " de model " + lista2.getModel() + "): data de construccio " + lista2.getDataConstruccio());
            }
        }
    }

    public static void menu_32()
    {
        Scanner in = new Scanner(System.in);
        String dataNova;

        System.out.println("Data fins a laqual s'esborraran les naus [yyyy-mm-dd]: ");
        dataNova = in.nextLine();
        dataNova = dataNova + " 00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataTmp = LocalDateTime.parse(dataNova, formatter);



        Iterator<Naus_Dades> lista1 = setDeNaus.iterator();
        while (lista1.hasNext())
        {

            Naus_Dades lista2 = (Naus_Dades) lista1.next();

            setDeNaus.removeIf((Naus_Dades naus_dades)  -> lista2.getDataConstruccio().isBefore(dataTmp));
        }
        menu_2();

    }





    public static boolean menu_11()
    {
        System.out.println("introdueix: ");
        System.out.println("nom, tipus, model, data construcció i descripció");

        Scanner in = new Scanner(System.in);
        System.out.print("Nom: ");
        String nom = in.next();
        System.out.print("Tipus: ");
        String tipus = in.next();
        System.out.print("Model: ");
        String model = in.next();

        System.out.print("Data de construccio (AAAA-MM-DD): ");
        String data1 = in.next();
        data1 = data1+ " 00:01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataConstruccio = LocalDateTime.parse(data1, formatter);

        System.out.print("Descripcio: ");
        String descripcio = in.next();

        if (setDeNaus.contains(nom) && setDeNaus.contains(tipus) && setDeNaus.contains(model)) {
            System.out.println("ERROR: NO S'HA INTRODUIT PER DUPLICAT");
            return false;
        }
        else
        {
            setDeNaus.add(new Naus_Dades(nom, tipus, model, dataConstruccio, descripcio));
            return true;
        }
    }

    public static void numNausVsTipus()
    {

        Map<String, Integer> contador = new HashMap<>();

        for (Naus_Dades datos : setDeNaus) {
            Integer oldCount = contador.get(datos.getTipus());
            if ( oldCount == null ) {
                oldCount = 0;
            }
            contador.put(datos.getTipus(), oldCount + 1);
        }

        for (Map.Entry<String, Integer> imp : contador.entrySet()) {
            System.out.println("Tipus = "+ imp.getKey() + ": num de naus = " + imp.getValue());
        }

    }

    public static void menu_22()
    {
        String opcio="";
        Scanner sc = new Scanner(System.in);

        ArrayList<Naus_Dades> arrayListDelSetDeNaus = new ArrayList<Naus_Dades>();
        arrayListDelSetDeNaus.addAll(setDeNaus);

        ListIterator<Naus_Dades> listIterator = arrayListDelSetDeNaus.listIterator();
        TreeSet<String> treeSet = new  TreeSet();

        while (listIterator.hasNext())
        {
            Naus_Dades naus_dades= listIterator.next();
            treeSet.add(naus_dades.getTipus());
        }
        System.out.println(treeSet);



            System.out.println("Escollir el tipus de nau a llistar:");
            System.out.println("0. " + treeSet.first().toString() );
            System.out.println("1. destructor");
            System.out.println("2. explorador \n");
            System.out.println("50. sortir del MENU 22 (naus de un tipus) \n");
            System.out.print("opció?: ");

         while (!opcio.equals("50"))
         {
             if ((opcio.equals("0")) || (opcio.equals("1")) || (opcio.equals("2")))
             {
                 break;
             }
             opcio = sc.next();

             switch (opcio)
             {
                 case "0":
                     System.out.println("0000000000");
                     break;

                 case "1":
                     System.out.println("111111111");
                     break;

                 case "2":
                     System.out.println("22222222");
                     break;

                 case "50":

                     break;

                 default:
                     System.out.println("Tipus de nau inexistent, selecciona de 0 a 2: ");
                     break;
             }
         }
        System.out.println("fin");


    }

}
