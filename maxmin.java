public class MinMax {
   public static void main(String[] args) {
      int[] numbers = {2, 3, 5, 1, 8, 4, 9, 6, 7};
      int max = numbers[0];
      int min = numbers[0];
      for(int i = 1; i < numbers.length; i++) {
         if(numbers[i] > max) {
            max = numbers[i];
         }
         if(numbers[i] < min) {
            min = numbers[i];
         }
      }
      System.out.println("Nilai maksimum: " + max);
      System.out.println("Nilai minimum: " + min);
   }
}
