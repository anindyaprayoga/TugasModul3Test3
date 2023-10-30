/**
 * Kelas Stock untuk mengelola transaksi saham.
 */
public class Stock {
    private int shares;
    private double price;
    private double capital;

    /**
     * Metode untuk membeli saham.
     *
     * @param p harga per saham
     * @param s jumlah saham
     */
    public void buy(double p, int s) {
        shares += s;
        price = p;
        capital += s * p;
    }

    /**
     * Metode untuk menjual saham.
     *
     * @param p harga per saham
     * @param s jumlah saham
     */
    public void sell(double p, int s) {
        shares -= s;
        price = p;
        capital -= s * p;
    }

    /**
     * Mendapatkan jumlah total saham.
     *
     * @return jumlah total saham
     */
    public int getShares() {
        return shares;
    }

    /**
     * Mendapatkan harga terakhir per saham.
     *
     * @return harga terakhir per saham
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mendapatkan harga rata-rata per saham.
     *
     * @return harga rata-rata per saham
     */
    public double getAveragePrice() {
        return capital / getShares();
    }

        /**
         * Metode untuk mendapatkan total modal.
         *
         * @return total modal
         */
        public double getCapital() {
            return capital;
        }

        /**
         * Metode untuk mendapatkan keuntungan atau kerugian.
         *
         * @return keuntungan atau kerugian
         */
        public double getProfitLoss() {
            return (price * shares) - capital;
        }
    }

}
