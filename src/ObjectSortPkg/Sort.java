package ObjectSortPkg;

import java.util.*;
public class Sort {
    static class SortByName implements Comparator<Color>
    {
        public int compare(Color a, Color b)
        {
            return a.getName().compareTo(b.getName());
        }
    }

   static class SortByRGB implements Comparator<ObjectSortPkg.Color>
    {
        public int compare(ObjectSortPkg.Color a, ObjectSortPkg.Color b)
        {
            return a.getR() - b.getR();
        }
    }
}
