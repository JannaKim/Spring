public class Main {

    public static void main(String[] args) {
        Scheduler sched = new MyScheduler();
        Test.setSched(sched);
        Test.solve();
    }
}
