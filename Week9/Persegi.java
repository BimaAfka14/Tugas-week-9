package Week9;
public class Persegi extends BangunDatar {
        private double sisi;
    
        public Persegi(double sisi) {
            this.sisi = sisi;
        }
    
        @Override
        double hitungLuas() {
            return sisi * sisi;
        }
    
        @Override
        double hitungKeliling() {
            return 4 * sisi;
        }
        
        @Override
        String getName() {
            return "Persegi";
        }
}
