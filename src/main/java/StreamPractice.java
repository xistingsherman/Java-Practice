import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String args[])
    {
        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);
        System.out.println();
        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        //stream does not change or store the data, it only operates on the source.
        //streams are consumable and must be created again to traverse.
        //cant add or remove any elements.
        names.stream().sorted().forEach(
                System.out::println
        );

        System.out.println();
        names.stream().sorted().map(name -> name.toUpperCase()).forEach(
                System.out::println
        );

        List<String> results1 = names.stream().filter(str -> str.contains("ec")).collect(Collectors.toList());
        System.out.println(results1);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        //number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method

        Set<Integer> arr = number.stream().filter(x->x%2==0).collect(Collectors.toSet());

        System.out.println(arr);

        int eve = arr.stream().reduce(1,(ans,i) -> ans*i);

        System.out.println(eve);

        //can 'pipeline' results together by using .
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
