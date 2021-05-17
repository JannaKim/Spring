import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    private static Scheduler sched;
    private static int N = 1;
    public static void setSched(Scheduler yours) {
        sched = yours;
    }

    public static void solve() {
        int time = 0;
        ArrayList<Process> procs = new ArrayList<Process>();
        for(int i = 0; i < 100; i++) {
            procs.add(new Process(N++, (int)(Math.random() * 20) ,(int)(Math.random() * 100 + 1)));
        }
        sched.setProcess(procs);
        while(!sched.isEmpty()) {
            Process currentProcess = sched.nextProcess(time);
            if(currentProcess.getPid() == -1) {
                time++;
                continue;
            }
            System.out.println("=======================================");
            System.out.println("The current time is " + time + " : ");
            System.out.println(currentProcess);
            System.out.println("is running");
            int executeTime = sched.execute(currentProcess.getPid());
            time += executeTime;
            System.out.println("Until " + time);
            System.out.println("=======================================");
            System.out.println();
        }
    }
}
