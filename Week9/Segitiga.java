//Nama  : Bima Afkanur Rifqi
//NIM   : A11.2022.14719
package Week9;

public class Segitiga extends BangunDatar {
        private double alas;
        private double tinggi;
        private double sisiA;
        private double sisiB;
        private double sisiC;
    
        public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.sisiA = sisiA;
            this.sisiB = sisiB;
            this.sisiC = sisiC;
        }
    
        @Override
        double hitungLuas() {
            return 0.5 * alas * tinggi;
        }
    
        @Override
        double hitungKeliling() {
            return sisiA + sisiB + sisiC;
        }

        @Override
        String getName() {
            return "Segitiga";
        }
}
