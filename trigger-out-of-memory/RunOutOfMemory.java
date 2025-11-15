import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

/**
 * NOTE:
 * run on a system with 2-4gb ram
 * to see immediate result (OutOfMemory exception)
 */


class Product {
	private String id;

	public Product(final String id) {
		this.id = id;
	}
}

public class RunOutOfMemory {
	private static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {
    System.out.println("Stand by, running out of memory...");

		while(true) {
			products.add(
				new Product(UUID.randomUUID().toString())
			);
		}
	}
}
