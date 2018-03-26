import java.util.Comparator;

public class BoardingCostComparator implements Comparator<Pet> {
   
   public int compare(Pet p1, Pet p2) {

      if (p1.boardingCost() > p2.boardingCost()) {
         return 1;
      }
      
      else if (p1.boardingCost() < p2.boardingCost()) {
         return -1;
      }
      
      return 0;
   }
}
