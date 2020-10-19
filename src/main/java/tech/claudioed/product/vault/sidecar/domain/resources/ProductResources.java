package tech.claudioed.product.vault.sidecar.domain.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.claudioed.product.vault.sidecar.domain.Product;
import tech.claudioed.product.vault.sidecar.domain.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/products")
public class ProductResources {

    private final ProductRepository productRepository;

    public ProductResources(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> products(){
        List<Product> products = StreamSupport
                .stream(this.productRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }

}
