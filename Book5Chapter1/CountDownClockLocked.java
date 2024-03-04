/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book5Chapter1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author dmtshoeni
 */
public class CountDownClockLocked extends Thread {

    ReentrantLock lock = new ReentrantLock();

    public void run() {
        lock.lock();
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        lock.unlock();
    }

}
