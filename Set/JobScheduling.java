import java.util.*;
public static int jobScheduling(int[][] jobs)
{
        Arrays.sort(jobs, new Comparator<int[]>(){
        public int compare(int[] first, int[] second)
        {
            if(first[1] < second[1]) return 1;
            else return -1;
        }
        });
 
        int maxProfit = 0;
        int maxDeadline = 0;
        for (int i = 0; i < jobs.length; i++)
        {
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = maxDeadline; i > 0; i--)
        {
            set.add(i);
        }
        TreeSet<Integer> slots = (TreeSet<Integer>)set.descendingSet();
 
        for (int i = 0; i < jobs.length; i++)
        {
            if (slots.size() == 0 || jobs[i][0] < slots.last())
            {
                continue;
            }
 
            Integer availableSlot = -1;
 
            for (Integer val : slots)
        {
                if (val <= jobs[i][0])
                {
                    availableSlot = val;
                    break;
                }
            }
 
            if (availableSlot != -1)
            {
                maxProfit = maxProfit + jobs[i][1];
 
                slots.remove(availableSlot);
            }
        }
 
        return maxProfit;
 }