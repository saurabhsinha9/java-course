import java .util.*;

 class Reminder{
Timer timer;
public Reminder(int seconds){
timer=new Timer();
timer.schedule(new ReminderTask(),seconds * 10000);
}
 class ReminderTask extends TimerTask{
 public void run(){
System.out.println("Time's up!");
timer.cancel();
}
}
}

public class lab13{
public static void main(String args[]){
System.out.println("About to schedule task");
new Reminder(5);
System.out.println("Task scheduled.");
}
}