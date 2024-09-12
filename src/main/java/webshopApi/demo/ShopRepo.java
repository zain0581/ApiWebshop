package webshopApi.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<shop,Integer> {
}
