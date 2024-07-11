public class BubleSort {
  static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean swaped = false;
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swaped = true;
        }
      }
      if (!swaped) break;
    }
  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] array = {13, 42, 2, 0, 11, 312, 45, 22};

    System.out.print("before :");
    printArray(array); // print the array before the sort

    sort(array); // sort the array

    System.out.print("after : ");
    printArray(array); // print the array after the sorting
  }
}
