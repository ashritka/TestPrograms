package ObjectSortPkg;

import java.util.*;
//import java.io.*;
class Main{
    public static void main(String[] args){
        List<Color> colors = new ArrayList<Color>();
        colors.add(new Color("Red",5,2,3));
        colors.add(new Color("Orange",15,12,13));
        colors.add(new Color("Green",25,22,23));
        colors.add(new Color("Blue",35,32,33));

        Collections.sort(colors, new Sort.SortByName());
        for (Color a : colors) {
            System.out.println(a.getName());
        }
        Collections.sort(colors, new Sort.SortByRGB());
        for (Color a : colors) {
            System.out.println(a.getName());
        }
    }
}