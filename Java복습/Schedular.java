import java.util.ArrayList;

public interface Scheduler {
    public boolean setProcess(ArrayList<Process> prs);
    public Process nextProcess(int currentTime);
    public int execute(int pid);
    public boolean isEmpty();
}
