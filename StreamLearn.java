import java.util.*;
import java.util.stream.Stream;
class StreamLearn{
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(5,1,2,3,4);
        //stream can't be reused
        Stream<Integer> data = nums.stream();
        System.out.println("Stream size : "+data.count());
        Stream<Integer> data1 = nums.stream().sorted();
        System.out.println("Sorted array : ");
        data1.forEach(i->System.out.println(i));
        Stream<Integer> data2 = nums.stream().map(i -> i*2);
        data2.forEach(i->System.out.println(i));
        System.out.println("Even powers : ");
        nums.stream()
            .map(i->i*i)
            .sorted()
            .filter(i->i%2==0)
            .forEach(i->System.out.println(i));

        System.out.println("Reduce : ");
        System.out.println(nums.stream()
            .map(i->i*i)
            .sorted()
            .filter(i->i%2==0)
            .reduce(1,(c,e)->c*e));

        
    }
}