import java.util.ArrayList;
public class StepTracker
{
 private ArrayList<Integer>steps;
 private int min;
public Steptracker(int st){
steps=new ArrayList<Integer>();
 min=st;
 
}
public addDailySteps(int st){
 steps.add(st);
}

 public int activeDays(){
  int j=0;
  for(int i:steps)
   if(i>=min)
    j++;
  return j;
 }

 public double averageSteps(){
  double tot=0;
  for(int i:steps)
   tot+=i;
 return tot/steps.size();
 }
} 
