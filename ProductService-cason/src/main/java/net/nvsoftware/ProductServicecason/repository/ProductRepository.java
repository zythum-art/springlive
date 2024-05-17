package net.nvsoftware.ProductServicecason.repository;

import net.nvsoftware.ProductServicecason.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
