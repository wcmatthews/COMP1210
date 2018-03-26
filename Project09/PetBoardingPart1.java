/** Driver Class. */
public class PetBoardingPart1 {
   
   /** Main Method.
   *@param args - is not used.
   */
   public static void main(String[] args) {
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
      
      System.out.println(c + "\n\n" + d + "\n\n" + sd + "\n\n" + h);
   }
}