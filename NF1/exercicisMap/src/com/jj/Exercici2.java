/*
 * Copyright (c) 2019.
 * Made by JJ Company
 */

package com.jj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class Exercici2
{
    public static void main(String[] args) {

        IdentityHashMap<String, ArrayList> modelsPerMarca = new IdentityHashMap<String, ArrayList>();
        modelsPerMarca.put("opel", new ArrayList<String>(Arrays.asList("kadet","corsa")));
        modelsPerMarca.put("ford", new ArrayList<String>(Arrays.asList("orion")));


        for (Map.Entry<String, ArrayList> mapeo : modelsPerMarca.entrySet())
        {
            System.out.println("Models de la marca " + mapeo.getKey()+": " + mapeo.getValue());
        }
    }






}
