package observerPattern.stockTradingPlatform;

public class StockBrokerMain {
    public static void main(String[] args) {
        StockPriceSubject stockPriceSubject = new StockPriceSubject();
        LiveDashBoard liveDashBoard = new LiveDashBoard();
        stockPriceSubject.registerObserver(liveDashBoard);
        stockPriceSubject.stockPriceChange(25.99f);
    }
}
