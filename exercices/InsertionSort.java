public class InsertionSort {
  static void sort(int[] array) {
    int length = array.length;

    for (int i = 1; i < length; i++) {
      int key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }

      array[j + 1] = key;
    }
  }

  static void printarr(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.print("\n");
  }

  static void printArray(int[] array, int start) {
    if (start >= array.length) {
      return;
    }

    printArray(array, start + 1);
    System.out.print(array[start] + " ");
  }

  // static void printArray(int[] array, int start) {
  //   if (start >= array.length) {
  //     return;
  //   }
  //
  //   printArray(array, start + 1);
  //   System.out.println(array[start]);
  // }

  public static void main(String[] args) {
    int[] arr = {12, 11, 13, 5, 6};

    System.out.print("before : ");
    printArray(arr, 0);

    System.out.println();

    sort(arr);
    printArray(arr, 0);
  }
}
