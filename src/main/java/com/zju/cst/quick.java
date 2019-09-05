public class quick {
  public static void main(String[] args) {
    int arr[] = {9,1,8,2,7,3,6,4,5};
    int low = 0;
    int high = arr.length - 1;
    quicksort(arr, low , high);
    for (int num :arr ) {
         System.out.print(num);
    }
//    quicksort(arr, low , high);
  }
  public static  void quicksort(int [] arr, int low , int high){
      if (low < high){
          int index = partation(arr,low,high);
          quicksort(arr , low , index - 1);
          quicksort(arr, index + 1,high);
      }

  }
  public static int partation(int [] arr, int low , int high){
      int x = arr[low];
      int i = low;
      int j = high;
      while (i < j){
          while (arr[j] >= x && i < j){
              j--;
          }
          if (i < j){
              arr[i] = arr[j];
//              arr[j] = x;
              i++;
          }
          while (arr[i] < x && i < j){
              i++;
          }
          if (i < j){
              arr[j] = arr[i];
//              arr[i] = x;
              j--;
          }
      }
      arr[i] = x;
      return i;
  }
}
