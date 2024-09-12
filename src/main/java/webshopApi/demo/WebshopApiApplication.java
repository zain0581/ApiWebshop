package webshopApi.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebshopApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebshopApiApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ShopRepo shopRepo) {
		return args -> {
			// Add some sample data
			shop item1 = new shop();
			item1.setName("Laptop");
			item1.setCategory("Electronics");
			item1.setDescription("High-end gaming laptop");
			item1.setPrice(8999);
			item1.setQty(10);

			// Add more items as needed
			shop item2 = new shop();
			item2.setName("T-shirt");
			item2.setCategory("Clothing");
			item2.setDescription("Comfortable cotton t-shirt");
			item2.setPrice(199);
			item2.setQty(50);

			shop item3 = new shop();
			item3.setName("Book");
			item3.setCategory("Books");
			item3.setDescription("Latest bestseller");
			item3.setPrice(129);
			item3.setQty(100);

			shop item4 = new shop();
			item4.setName("	Tv");
			item4.setCategory("Electronics");
			item4.setDescription("Latest bestseller");
			item4.setPrice(2600);
			item4.setQty(10);

			// Save items to the repository
			shopRepo.save(item1);
			shopRepo.save(item2);
			shopRepo.save(item3);
			shopRepo.save(item4);

		//	System.out.println("Sample items added to the shop.");
		};
	}
}


