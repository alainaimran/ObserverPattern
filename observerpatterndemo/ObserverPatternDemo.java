/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpatterndemo;
import observerpatterndemo.Observer;

/**
 *
 * @author Calypso computer
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new BinaryObserver(subject);
        Observer observer2 = new HexaObserver(subject);
        Observer observer3 = new OctalObserver(subject);

       System.out.println("Setting State to 15:");
        subject.setState(15);

        System.out.println("\nDetaching HexaObserver...");
        subject.detach(observer2);

        System.out.println("\nSetting State to 10:");
        subject.setState(10);
    }
}
