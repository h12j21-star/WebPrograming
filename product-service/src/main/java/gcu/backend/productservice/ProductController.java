package gcu.backend.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private final ProductService  productservice;

    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    @GetMapping("/product/{id}")
    public Product getProductId(@PathVariable Long id) {
        return productservice.findOne(id);
    }

}
