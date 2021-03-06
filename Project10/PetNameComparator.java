import java.util.Comparator;

public class PetNameComparator implements Comparator<Pet> {
   
   public int compare(Pet p1, Pet p2) {

      if (Integer.valueOf(p1.getName().charAt(0)) > Integer.valueOf(p2.getName().charAt(0))) {
         return 1;
      }
      
      else if (Integer.valueOf(p1.getName().charAt(0)) < Integer.valueOf(p2.getName().charAt(0))) {
         return -1;
      }
      
      return 0;
   }
}
