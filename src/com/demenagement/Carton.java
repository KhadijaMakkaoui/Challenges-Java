package com.demenagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carton {
    private int id;
    private int max_cartons;
    private String size;

    private List<Enum> objets=new ArrayList<>();
    private List<Carton> cartons=new ArrayList<>();


    public Carton(int id, List<Enum> objets) {
        this.id = id;
        this.objets = objets;
    }
    public List<Enum> getObjets() {
        return objets;
    }

    public void setObjets(List<Enum> objets) {
        this.objets = objets;
    }

    public List<Carton> getCartons() {
        return cartons;
    }

    public void setCartons(List<Carton> cartons) {
        this.cartons = cartons;
    }
    public static void displayObjets(){
        final int[] i = {1};
        Arrays.stream(Objet.values()).forEach(objet -> {
            System.out.println(i[0] +"-"+objet);
            i[0]++;
        });
       //System.out.println(Arrays.asList(Objet.values()));
    }

}
