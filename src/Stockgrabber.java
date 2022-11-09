import java.util.ArrayList;

public class Stockgrabber implements Subject{
    private ArrayList<Observer>observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public Stockgrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
       int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + "deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifiyobserver() {
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifiyobserver();
    }

    public void setAAPLPrice(double aaplPrice){
        this.aaplPrice = aaplPrice;
        notifiyobserver();
    }

    public void setGOOGPrice(double googPrice){
        this.googPrice = googPrice;
        notifiyobserver();
    }

}
