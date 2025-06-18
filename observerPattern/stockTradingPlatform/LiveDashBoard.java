package observerPattern.stockTradingPlatform;

public class LiveDashBoard implements Observer {
    public void onStockPriceChange(float price) {
        System.out.println("<UNK> " + price);
    }
}
