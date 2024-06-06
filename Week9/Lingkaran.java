package Week9;


public class Lingkaran extends BangunDatar {
        private double radius;
    
        public Lingkaran(double radius) {
            this.radius = radius;
        }
    
        @Override
        double hitungLuas() {
            return Math.PI * radius * radius;
        }
    
        @Override
        double hitungKeliling() {
            return 2 * Math.PI * radius;
        }

        @Override
        String getName() {
            return "Lingkaran";
        }
}
