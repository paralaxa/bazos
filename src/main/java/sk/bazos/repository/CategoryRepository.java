package sk.bazos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.bazos.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
