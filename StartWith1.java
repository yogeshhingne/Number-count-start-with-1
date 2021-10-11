package StartWith1;
import java.util.*;
public class StartWith1 {
	public static void main(String x[]) {
		List<String> numbers = Arrays.asList("1","11","21","121","44");
		long t=numbers.stream().filter(m->m.startsWith("1")).count();
		System.out.println(t);
	}

}
