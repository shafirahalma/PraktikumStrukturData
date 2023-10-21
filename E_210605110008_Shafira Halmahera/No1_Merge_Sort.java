package UTS_PrakStrukdat;

/**
 *
 * @author shafira halmahera
 */
public class No1_Merge_Sort {

    private int arr[];
    private int nElement;

    public No1_Merge_Sort(int size) {
        arr = new int[size];
        nElement = 0;
    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        int[] workSpace = new int[nElement];
        recMergeSort(workSpace, 0, nElement - 1);
    }

    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void merge(int[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound) {
            if (arr[lowIndex] < arr[highIndex]) {
                workSpace[j++] = arr[lowIndex++];
            } else {
                workSpace[j++] = arr[highIndex++];
            }
        }

        while (lowIndex <= mid) {
            workSpace[j++] = arr[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = arr[highIndex++];
        }
        for (j = 0; j < nItem; j++) {
            arr[lowerBound + j] = workSpace[j];
        }
    }

    public static void main(String[] args) {
        No1_Merge_Sort merge = new No1_Merge_Sort(10);
        merge.insert(2);
        merge.insert(7);
        merge.insert(4);
        merge.insert(9);
        merge.insert(3);
        merge.insert(6);
        merge.insert(1);
        merge.insert(5);
        merge.insert(8);
  
        System.out.println("Data Sebelum di sorting : ");
        merge.display();
        System.out.println("=========================");
        System.out.println("Data Sesudah di sorting :");
        merge.mergeSort();
        merge.display();
    }
}
