package tech.claudioed.product.vault.sidecar.domain.repository;

import org.springframework.data.repository.CrudRepository;
import tech.claudioed.product.vault.sidecar.domain.Product;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
