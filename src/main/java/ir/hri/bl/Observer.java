package ir.hri.bl;

public class Observer implements IObserver {
    Subject subject = null;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.printf("Call update");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        this.subject.detach(this);
    }
}
