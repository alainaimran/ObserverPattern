/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer.eventsmanagement;

/**
 *
 * @author Calypso computer
 */
public class ObserverEventsmanagement {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        // Creating an SMS observer with a phone number
        SMSSupportListener smsListener = new SMSSupportListener("+123456789");

        // Subscribing the SMS listener
        eventManager.subscribe(smsListener);

        System.out.println("Sending a short SMS:");
        eventManager.notifyListeners("Your order has been shipped!");

        System.out.println("\nSending a long SMS:");
        eventManager.notifyListeners("This is a very long SMS message that exceeds the 160-character limit. "
                + "It should trigger a warning instead of being sent as an SMS. Please define a valid default message.");
    }
}

    

