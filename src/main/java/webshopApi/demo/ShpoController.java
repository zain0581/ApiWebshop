package webshopApi.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webshop")
public class ShpoController {

    ShopRepo shopRepo;
    ShpoController(ShopRepo shopRepo){
        this.shopRepo=shopRepo;
    }

    @PostMapping()
    int create(@RequestBody shop shopp ){
        shopRepo.save(shopp);
        return  shopp==null? -1: shopp.getId();
    }

    @GetMapping("/{id}")
    shop read(@PathVariable int id){
        return shopRepo.findById(id).get();
    }

    @GetMapping()
    List<shop> getall(){
        return shopRepo.findAll();
    }


    @PutMapping()
    void Update(@RequestBody shop Shop){
        shopRepo.save(Shop);
    }

    @DeleteMapping("/{id}")
    void Delet(@PathVariable int id){
        shopRepo.deleteById(id);
    }

}
