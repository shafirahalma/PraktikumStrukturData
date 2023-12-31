package Modul1_praktikum;

/**
 *
 * @author shafira halmahera
 */
public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sisoarjo");

        System.out.println("Data Mahasiswa sebelum diurutkan : ");
        arr.displayArray();

//        long searchKey = 16650270;
//        Mahasiswa mhs = arr.find(searchKey);
//        if (mhs != null) {
//            System.out.print("\nketemu");
//            mhs.displayMhs();
//        } else {
//            System.out.println("ga ketemu " + searchKey);
//        }
//
//        searchKey = 16650240;
//        System.out.println("\nhapus nim; " + searchKey);
//        arr.delete(searchKey);
//        arr.displayArray();
        System.out.println(" ");
        System.out.println("=============Sorting Mahasiswa by NIM=============");
        arr.SelectionSort();
        arr.displayArray();

//     
        System.out.println(" ");
        System.out.println("=============Sorting Mahasiswa by NAME=============");
        arr.InsertionSortbyName();
        arr.displayArray();
    }

}
