
package pertemuan5;

/**
 *
 * @author user
 */
public class TargetTabungan {

    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08;
        double saldoTarget = 6000000;
        
        int bulan = 0;

        System.out.println("Perhitungan lama tabungan sampai mencapai saldo target:");
        System.out.printf("Saldo Awal: Rp. %,d%n", (int)saldoAwal);
        System.out.printf("Bunga/Bulan(%%): %.0f%n", bungaPerBulan * 100);
        System.out.printf("Saldo Target: Rp. %,d%n%n", (int)saldoTarget);

        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bungaPerBulan;
            System.out.printf("Saldo di bulan ke-%d Rp. %,d%n", bulan, (int)saldoAwal);
        }
    }
}   

