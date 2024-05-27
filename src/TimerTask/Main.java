package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Timer = a facility for threads to schedule tasks for future execution in a background thread.
        // timerTask = a task that can be scheduled for one time or repeated execution by a timer.


        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if(counter> 0) {
                    System.out.println(counter + " seconds.");
                    counter--;
                }
                else {
                    System.out.println("Happy new year.");
                    timer.cancel();
                }
            }

        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.MAY);
        date.set(Calendar.DAY_OF_MONTH, 27);
        date.set(Calendar.HOUR_OF_DAY, 14);
        date.set(Calendar.MINUTE, 26);
        date.set(Calendar.SECOND, 50);

      //  timer.schedule(task, date.getTime());

//        timer.scheduleAtFixedRate(task, 0 , 1000);
        timer.scheduleAtFixedRate(task, date.getTime() , 1000);

    }

}
