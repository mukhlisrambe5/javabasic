package timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int counter = 10;

            @Override
            public void run(){
                if(counter>0){
                    System.out.println(counter+ " second");
                    counter--;
                }else{
                    System.out.println ("Happy new year");
                    timer.cancel();
                }
            }
        };
//        timer.schedule(task, 3000);
//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR, 2024);
//        date.set(Calendar.MONTH, Calendar.JULY);
//        date.set(Calendar.DAY_OF_MONTH, 20);
//        date.set(Calendar.HOUR_OF_DAY, 7);
//        date.set(Calendar.MINUTE, 20);
//        date.set(Calendar.SECOND,0);
//        date.set(Calendar.MILLISECOND,0);
//
//        timer.schedule(task, date.getTime());
         timer.scheduleAtFixedRate(task, 0,1000);

    }
}
