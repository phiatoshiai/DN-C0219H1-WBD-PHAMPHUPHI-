package OOP.StopWatch;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch () {
        this.startTime = System.nanoTime ();
    }

    public static void main ( String[] args ) throws InterruptedException {
        StopWatch stopWatch = new StopWatch ();
        System.out.println ( stopWatch.getStartTime () );
        stopWatch.start ();
        TimeUnit.SECONDS.sleep ( 10 );
        stopWatch.stop ();
        System.out.println ( "ElapsedTime: " + stopWatch.getElapsedTime () );

    }

    public long getStartTime () {
        return startTime;
    }

    public long getEndTime () {
        return endTime;
    }

    public long start () {
        return this.startTime = System.nanoTime ();
    }

    public long stop () {
        return this.endTime = System.nanoTime ();
    }

    public long getElapsedTime () {
        return this.endTime - this.startTime;
    }
}
