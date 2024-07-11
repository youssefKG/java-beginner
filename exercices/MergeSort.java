import java.util.ArrayList;

public class MergeSort {

  static void merge(int[] arr, int l, int m, int r) {
    int i, j, k, n1, n2;
    n1 = m - l + 1;
    n2 = r - m;
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();

    for (i = 0; i < n1; i++) arr1.add(arr[i + l]);

    for (i = 0; i < n2; i++) arr2.add(arr[m + i + 1]);

    i = j = 0;
    k = l;

    while (i < n1 && j < n2) {
      if (arr1.get(i) <= arr2.get(j)) {
        arr[k] = arr1.get(i);
        i++;
      } else {
        arr[k] = arr2.get(j);
        j++;
      }
      k++;
    }

    while (i < n1) {

      arr[k] = arr1.get(i);
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = arr2.get(j);
      k++;
      j++;
    }
  }

  static void sort(int[] arr, int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;

      sort(arr, l, m);
      sort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {12, 11, 13, 5, 6};

    System.out.print("before : ");
    printArray(arr);

    sort(arr, 0, arr.length);
    System.out.print("after");
    printArray(arr);
  }
}
