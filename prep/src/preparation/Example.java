package preparation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
	Consumer<Integer> cons=(x)->{System.out.println(x+3);};
	Supplier<Integer> sup=()->(23);
	Predicate<Integer> pred=(x)->(x>3);
	Function<Integer,String> fun= (r)->("hey"+r);
	public static void main(String args[]) {
		
		Example ex=new Example();
		ex.cons.accept(23);
		System.out.println(ex.sup.get());
		System.out.println(ex.pred.test(2));
		System.out.println(ex.fun.apply(2));
	}

}
