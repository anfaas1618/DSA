public class InsertionSort {
    public static void main (String [] args)
    {
        int arr[] ;
        arr= new int[]
                {5,2,1,3,7};
        for (int i = 1; i <arr.length ; i++) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}
