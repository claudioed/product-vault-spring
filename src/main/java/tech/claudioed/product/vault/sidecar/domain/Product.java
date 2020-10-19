package tech.claudioed.product.vault.sidecar.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(generator = "uuid4")
    private UUID id;

    private String name;

}
