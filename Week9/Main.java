//Nama  : Bima Afkanur Rifqi
//NIM   : A11.2022.14719
package Week9;

public class Main {
    /** Main Method */
    public static void main(String[] args) {
        BangunDatar geoObject1 = new Lingkaran(5);
        BangunDatar geoObject2 = new Persegi(5);
        BangunDatar geoObject3 = new Segitiga(1, 2, 3, 4, 5);

        // Display Lingkaran
        displayBangunDatar(geoObject1);
        // Display Persegi
        displayBangunDatar(geoObject2);
        // Display Segitiga
        displayBangunDatar(geoObject3);
    }

    /** A method for displaying a BangunDatar */
    public static void displayBangunDatar(BangunDatar object) {
        System.out.println("Bangun Datar: " + object.getName());
        System.out.println("Luas: " + object.hitungLuas());
        System.out.println("Keliling: " + object.hitungKeliling());
        System.out.println();
    }
}
