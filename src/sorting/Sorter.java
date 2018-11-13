
package sorting;

public class Sorter {
    

 public static void selectionSort(int[] a ){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = findMinimum(a,i);
            if(minIndex!=1) swap(a,i,minIndex);
        }
    }
    
    public static int findMinimum(int[] a, int first){
        int minIndex = first;
        for (int i = first +1; i < a.length; i++) {
            if(a[i] < a[minIndex]) minIndex = i;
        }
        return minIndex;
    }
    
    public static void bubbleSort(int[] a){
        int k =0;
        boolean exchangeMade = true;
        while((k< a.length -1) && exchangeMade){
         exchangeMade = false;
         k++;
            for (int j = 0; j < a.length-k; j++) {
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                    exchangeMade = true;
                }
            }
        }
    }
    
    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    public static void insertionSort(int a[]){
        int itemToInsert, j;
        boolean stillLooking;
        
        for (int i = 1; i < a.length; i++) {
            itemToInsert = a[i];
            j = i-1;
            stillLooking = true;
            while(j>=0&&stillLooking){
                if(itemToInsert < a[j]){
                    a[j+1] = a[j];
                    j--;
                }else{
                    stillLooking = false;
                    a[j+1] = itemToInsert;
                }
            }
        }
    }
}
