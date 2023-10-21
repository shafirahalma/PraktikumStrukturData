package Modul1_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
class HighArray {

    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void insertOrdered(int value) {
        int IndexPosition = 0;
        while (IndexPosition < nElemen && value >= arr[IndexPosition]) {
            IndexPosition++;
        }
        for (int i = nElemen; i > IndexPosition; i--) {
            arr[i] = arr[i - 1];
        }
        arr[IndexPosition] = value;
        nElemen++;
    }

    public boolean binarySearch(int key) {
        int batasAtas = nElemen - 1;
        int batasBawah = 0;

        boolean belumketemu = true;

        while (belumketemu) {
            int posisisekarang = (batasAtas + batasBawah) / 2;
            if (arr[posisisekarang] == key) {
                belumketemu = false;
                return true;

            } else if (batasBawah > batasAtas) {
                break;
            } else {
                if (arr[posisisekarang] < key) {
                    batasBawah = posisisekarang + 1;
                } else {
                    batasAtas = posisisekarang - 1;
                }
            }
        }
        return false;
    }

    public void size() {
        System.out.println("jumlah array = " + arr.length);
        System.out.println("jumlah elemen yang terisi = " + nElemen);

    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
