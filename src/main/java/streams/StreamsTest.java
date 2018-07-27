package streams;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.Year;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {

		Car one = new Car(Brand.AUDI, "A6", 1993, new Engine("Abuzo", "diesel", 1.4), 43000, new BigDecimal(12500));
		Car two = new Car(Brand.AUDI, "A7", 1994, new Engine("Abura", "benzyna", 1.7), 70000, new BigDecimal(32500));
		Car three = new Car(Brand.AUDI, "A2", 2002, new Engine("Noma", "diesel", 2.2), 90000, new BigDecimal(75000));

		List<Car> cars = Arrays.asList(
				one,
				two,
				three,
				new Car(Brand.NISSAN, "Micra", 2010, new Engine("Noma", "benzyna", 1.2), 10000, new BigDecimal(12000)),
				new Car(Brand.SEAT, "Ibiza", 2009, new Engine("tata", "benzyna", 1.4), 152000, new BigDecimal(17000)),
				new Car(Brand.SEAT, "Alhambra", 2013, new Engine("Bama", "diesel", 2.2), 75000, new BigDecimal(120000)),
				new Car(Brand.SKODA, "Octavia", 2000, new Engine("Noma", "diesel", 1.1), 165000, new BigDecimal(4500))

		);

		List<Car> filter = cars.stream().filter(c -> Brand.AUDI.equals(c.brand) && c.milage > 50000).collect(Collectors.toList());
		filter.forEach(System.out::println);

		System.out.println();

		System.out.println(cars.stream().map(c -> c.productionYear).filter(c -> c > 2000 && c < 2010).count());

		System.out.println();
		cars.stream().filter(c -> c.engine.type.equals("diesel")).map(c -> c.brand).distinct().forEach(System.out::println);
		System.out.println();
		System.out.println(cars.stream().filter(c -> c.engine.type.equals("diesel")).mapToDouble(Car::getMilage).sum());
		System.out.println("REDUCE");
		System.out.println(cars.stream().map(f -> f.milage).reduce(50, Integer::sum, (a,b) -> a*b).toString());

		System.out.println(Stream.of(one, two, three).count());

		Stream.of("1", "2").mapToInt(Integer::parseInt).sum();

		System.out.println("Range");
		IntStream.rangeClosed(1,10).forEach(System.out::println);


		reusedStreams();

		IntSummaryStatistics statistics = cars.stream().collect(Collectors.summarizingInt(s -> s.milage));
		System.out.println(statistics);






	}


	public static void reusedStreams() {
		//streams Cannot be reused
		Stream<String> stream =
				Stream.of("d2", "a2", "b1", "b3", "c")
						.filter(s -> s.startsWith("a"));

		try {
			System.out.println(stream.anyMatch(s -> true));    // ok
			System.out.println(stream.noneMatch(s -> true));   // exception
		} catch (IllegalStateException e) {
			System.out.println("Streamy nie mogą być reużywane");
		}

		//Ale można utworzyć retworzący łańcuch streamów
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> s.startsWith("a"));

		try {
			System.out.println(streamSupplier.get().anyMatch(s -> true));    // ok
			System.out.println(streamSupplier.get().noneMatch(s -> true));   // ok
		} catch (IllegalStateException e) {
			System.out.println("Streamy nie mogą być reużywane");
		}

	}


}
