public class changeArray {

  public static void main(String[] args) {

    int[] array1 = {
      20,
      30,
      40
    };
    for (int i = 0; i < array1.length; i++) {

      System.out.println("Original Array: " + array1[i]);
    }
    int x = array1[0];
    array1[0] = array1[array1.length - 1];
    array1[array1.length - 1] = x;

    for (int k: array1) {
      System.out.println("New array after swapping the first and last elements: " + k);
    }
  }
}
