package OOP.StopWatch;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch () {
    }

    public static void main ( String[] args ) throws InterruptedException {
        SimpleDateFormat style = new SimpleDateFormat ( "HH:mm:ss" );
        StopWatch stopWatch = new StopWatch ();
        System.out.println ( "Start Time: " + style.format ( stopWatch.start () ) );
        TimeUnit.SECONDS.sleep ( 10 );
        System.out.println ( "End Time: " + style.format ( stopWatch.stop () ) );
        //System.out.println (stopWatch.getElapsedTime ());
        System.out.println ( "Elapsed Time: " + stopWatch.getElapsedTime () + "s" );
    }

    public long getStartTime () {
        return this.startTime;
    }

    public long getEndTime () {
        return this.endTime;
    }

    public long start () {
        return this.startTime = System.currentTimeMillis ();
    }

    public long stop () {
        return this.endTime = System.currentTimeMillis ();
    }

    public long getElapsedTime () {
        return (this.endTime - this.startTime) / 1000;
    }

}
