package net.nvsoftware.springmonocason.repository;

import net.nvsoftware.springmonocason.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
