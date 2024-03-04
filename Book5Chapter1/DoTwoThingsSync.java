/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book5Chapter1;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author dmtshoeni
 */
public class DoTwoThingsSync {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClockSync clock
            = new CountDownClockSync(20);

    public static void main(String[] args) {
        new DoTwoThingsSync();
    }

    DoTwoThingsSync() {
        pool.execute((Runnable) clock);
        pool.execute((Runnable) clock);
        pool.shutdown();
    }
}
