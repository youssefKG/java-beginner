/** SelectionSort */
public class SelectionSort {
  static void printArrayOfInt(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println('\n');
  }

  static void sort(int[] array) {
    int length = array.length;
    int temp;
    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        if (array[i] > array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] myArray = {12, 42, 4, 0, 22, 54, 1};
    // SelectionSort selection = new SelectionSort();
    // selection.sort(myArray);
    // selection.printArrayOfInt(myArray);
    sort(myArray);
    printArrayOfInt(myArray);
  }
}
