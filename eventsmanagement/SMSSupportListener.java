/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.eventsmanagement;

/**
 *
 * @author Calypso computer
 */

public class SMSSupportListener implements EventListener {
    private String phoneNumber;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        if (message.length() > 160) {
            System.out.println("Warning: SMS exceeds 160 characters! Define a valid default SMS.");
        } else {
            System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        }
    }
}
