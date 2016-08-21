package ir.hri.bl;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    Set<IObserver> IObserverSet = new HashSet<IObserver>();

    public void attach(IObserver IObserver) {
        IObserverSet.add(IObserver);
    }

    public void detach(IObserver IObserver) {
        IObserverSet.remove(IObserver);
    }

    private void notifies() {
        for (IObserver IObserver : IObserverSet) {
            IObserver.update();
        }
    }

    public void message() {
        System.out.println("Hello");
        notifies();
    }
}
