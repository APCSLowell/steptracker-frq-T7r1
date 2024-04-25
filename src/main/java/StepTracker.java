import java.util.ArrayList;
public class StepTracker
{
 private ArrayList<Integer>steps;
 private int min;
 private int j;
public StepTracker(int st){
steps=new ArrayList<Integer>();
 min=st;
 j=0;
}
public void addDailySteps(int st){
 steps.add(st);
   if(st>=min)
    j++;
}

 public int activeDays(){

  return j;
 }

 public double averageSteps(){
  if(steps.size()<1)
   return 0;
  double tot=0;
  for(int i:steps)
   tot+=i;
 return tot/steps.size();
 }
} 
