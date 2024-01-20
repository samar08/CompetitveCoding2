import java.util.*;
import java.util.stream.Collectors;
public class StreamPractise {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        // to square every element
      // List<Integer>out= list.stream().map(n-> n*n).filter(n->n<10).sorted(Collections.reverseOrder()).collect(Collectors.toList());
      // out.stream().forEach(System.out::println);
      //int pro=list.stream().map(n->n*n).reduce(1,(ans,i)->(ans*i));
      //System.out.println(pro);

      //Sum of square of all odd number
      int oddSum=list.stream().filter(n->n%2==1).map(n->n*n).reduce(0,(ans,i)-> ans+i);
      System.out.println(oddSum); 
    }
}
