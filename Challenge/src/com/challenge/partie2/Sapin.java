package com.challenge.partie2;

import java.lang.reflect.Array;
import java.util.*;

public class Sapin {
    static Map<String,String > list=new TreeMap<>();
    static int nbLignes;
    public static String ep;
    public static String gui;
    public static void StoreUserInput(){
        Scanner scanner=new Scanner(System.in);
        do{

            System.out.println("Enter un nombre entre 8 et 35:");
            nbLignes=scanner.nextInt();
            scanner.nextLine();
        }
        while(nbLignes<8 || nbLignes>35 );
        do{

            System.out.println("Quel symbole voulez-vous pour les épines du sapin?");
            ep=scanner.nextLine();
            System.out.println("Quelles guirlandes voulez-vous mettre ?");
            gui=scanner.nextLine();
            if(ep==gui){
                System.out.println("taille de guirlandes doit être de 3 a 25 caractères et elles ne peuvent pas contenir le même caractère que celui utilisé pour les épines");

            }
        }while(ep==gui || (gui.length()<3 || gui.length()>25) );

        list.put("guirlande",gui);
        list.put("epine",ep);
        System.out.println("epine: " +list.get("epine"));
        System.out.println("guirlande: " +list.get("guirlande"));
        scanner.close();
    }
}
