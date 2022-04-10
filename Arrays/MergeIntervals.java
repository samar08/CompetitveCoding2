import java.util.*;
import java.lang.*;
 
 // Definition for an interval.
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
 
public class MergeIntervals {
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
   int lefti=newInterval.start;
   int righti=newInterval.end;
   int i=0;
   int n=intervals.size();
   ArrayList<Interval>out=new ArrayList<Interval>();
   boolean notadded=true;
 
while(i<n){
    if(lefti>intervals.get(i).end || righti<intervals.get(i).start){
        if(notadded==true && righti<intervals.get(i).start){
            out.add(new Interval(lefti,righti));
            out.add(new Interval(intervals.get(i).start,intervals.get(i).end));
            notadded=false;
        }
        else{
            out.add(new Interval(intervals.get(i).start,intervals.get(i).end));
        }
    }
    else{
        notadded=false;
        //if(lefti<=intervals.get(i).end && (lefti>=intervals.get(i).start)){
        int leftc=Math.min(lefti,intervals.get(i).start);
        while((i<n) && (righti>=intervals.get(i).start)){
            i+=1;
        }
        i-=1;
        int rightc=Math.max(righti,intervals.get(i).end);
        out.add(new Interval(leftc,rightc));
        
        
    }
    i+=1;
}
if(notadded==true){
    out.add(new Interval(lefti,righti));
    notadded=false;
 }
return out;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),i;
       ArrayList<Interval>intervals=new ArrayList<Interval>();
       for(i=0;i<n;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
           intervals.add(new Interval(a,b));

       }
       int newleft=sc.nextInt();
       int newright=sc.nextInt();
       Interval newinterval=new Interval(newleft,newright);
       ArrayList<Interval>out=insert(intervals,newinterval);
       System.out.println("answer:");
       for(i=0;i<out.size();i++){
           System.out.println(out.get(i).start+" "+out.get(i).end);
       }
       
    }
}
