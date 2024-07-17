import java.util.ArrayList;

public class Exercice2 {

  public static void selectionSort(ArrayList<Integer> arr, int posi) {
    if (posi == arr.size()) return;

    int temp = arr.get(posi);
    int minIndex = findMin(arr, posi, posi + 1);

    int minValue = arr.get(minIndex);

    arr.set(minIndex, temp);
    arr.set(posi, minValue);

    selectionSort(arr, posi + 1);
  }

  public static int findMin(ArrayList<Integer> arr, int min, int start) {
    if (start == arr.size()) return min;

    if (arr.get(start) < arr.get(min)) return findMin(arr, start, start + 1);

    return findMin(arr, min, start + 1);
  }

  public static void printArray(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + "|");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    ArrayList<Integer> testArray = new ArrayList<Integer>();

    testArray.add(13);
    testArray.add(13);
    testArray.add(3);
    testArray.add(8);
    testArray.add(5);

    System.out.println("before: ");
    printArray(testArray);
    selectionSort(testArray, 0);
    System.out.println("after: ");
    printArray(testArray);
  }
}
