package gr.aueb.cf.ch6;



public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {12, 33, 2, 4, 43, 1, 32};
        int maxPosition = getMaxPosition(arr, 0, arr.length - 1);
        System.out.println("The position of the Max is: " + maxPosition);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
       int mid = 0;
       int leftMaxPosition = Integer.MIN_VALUE;;
       int rightMaxPosition = Integer.MIN_VALUE;;

       if (low == high) return low;

       mid = (low + high) / 2;

       leftMaxPosition = getMaxPosition(arr, low, mid);
       rightMaxPosition = getMaxPosition(arr, mid + 1, high);

       if (arr[leftMaxPosition] >= arr[rightMaxPosition]) {
           return leftMaxPosition;
       } else {
           return rightMaxPosition;
       }

    }
}
