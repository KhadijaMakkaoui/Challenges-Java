package com.challenge.partie1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stars {
    static int space;
    static int nb;
    static int star=1;
    static String s="";
    static List <String> list=new ArrayList<>();

    public static int GetUserInput(){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter un nombre entre 8 et 35:");
            nb=scanner.nextInt();
            scanner.nextLine();
        }while(nb<8 || nb>35);
        scanner.close();
        return nb;
    }

    public static void PrintAllStars(){
        nb=GetUserInput();
        space = nb;
        for(int i=0;i<nb;i++) {


            for (int j = space--; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < star; k++)
                System.out.print("*");
            System.out.println();
            star += 2;
        }
    }
    public static List PrintAllStarsList() {
        nb = GetUserInput();
        space = nb;
        for (int i = 0; i < nb; i++) {
            s="";

            for (int j = space--; j > 0; j--) {

                //System.out.print(" ");
                s=s.concat(" ");
            }

            for (int k = 0; k < star; k++)
                s=s.concat("*");

            list.add(s);
            star += 2;

        }
        return list;
    }
    public static void DisplayStarsList(){
        list=PrintAllStarsList();
        list.forEach(n-> System.out.println(n));
    }
}
