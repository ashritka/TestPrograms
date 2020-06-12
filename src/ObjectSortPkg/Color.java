package ObjectSortPkg;

import java.util.*;
public class Color{
   // public String name;
    private int r;
    private int g;
    private int b;
    private String name;

    Color(String name, int red, int green, int blue){
        this.name = name;
        this.r = red;
        this.g = green;
        this.b = blue;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}