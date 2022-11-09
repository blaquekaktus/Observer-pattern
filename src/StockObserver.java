public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockgrabber;

    private StockObserver(Subject stockgrabber){

    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlePrice) {

    }
}
