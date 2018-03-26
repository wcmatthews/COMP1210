/**
* Horse class.
*/
public class Horse extends Pet {
   
   private double exerciseFee;
   /***/
   public static final double BASE_RATE = 15;
   
   /**
   * Horse constructor.
   * @param ownerNameIn Name of owner.
   * @param petNameIn Name of pet.
   * @param breedIn Breed of pet.
   * @param weightIn Weight of pet.
   * @param daysIn Days of stay.
   * @param exerciseFeeIn Fee for excercize.
   */
   public Horse(String ownerNameIn, String petNameIn, String breedIn,
            double weightIn, int daysIn, double exerciseFeeIn) {
            
            super(ownerNameIn, petNameIn, breedIn, weightIn, 
                  daysIn);
                  
      exerciseFee = exerciseFeeIn;
   }
   
   /**
   * @return exercizeFee.
   */
   public double getExerciseFee() {
      return exerciseFee;
   }
   
   /**
   * @param exerciseFeeIn .
   */
   public void setExerciseFee(double exerciseFeeIn) {
      exerciseFee = exerciseFeeIn;
   }
   
   /**
   *@return Boarding cost.
   */
   public double boardingCost() {
      double cost = (BASE_RATE + weight * 0.01 + exerciseFee) * days;
      
      return cost;
   }
   
   /**
   * @return Return string representing horse object.
   */
   public String toString() {
      return super.toString()
         + "Exercise Fee: " + getExerciseFee();
   }
}