/**
* Dog class.
*/
public class Dog extends Pet {
   /***/
   public static final double BASE_RATE = 12;
   
   /**
   * Dog constructor.
   * @param ownerNameIn Name of owner.
   * @param petNameIn Name of pet.
   * @param breedIn Breed of pet.
   * @param weightIn Weight of pet.
   * @param daysIn Days of stay.
   */
   public Dog(String ownerNameIn, String petNameIn, String breedIn,
            double weightIn, int daysIn) {
            
            super(ownerNameIn, petNameIn, breedIn, weightIn, 
                  daysIn);
   }
   
   /**
   * @return Boarding cost.
   */
   public double boardingCost() {
      double cost = (BASE_RATE + weight * 0.05) * days;
      
      return cost;
   }
   
  
   
} 
   