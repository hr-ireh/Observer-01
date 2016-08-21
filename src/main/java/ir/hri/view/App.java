package ir.hri.view;

import ir.hri.bl.Observer;
import ir.hri.bl.Subject;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer(subject);
        subject.message();
    }
}
