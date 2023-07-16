package com.flufly.web.domain.repository;

import com.flufly.web.domain.Category;
import com.flufly.web.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository {
  /**
   * Retrieves a list of all categories.
   *
   * @return List of all categories.
   */
  List<Category> getAll();
  /**
   * Retrieves a specific category by its ID.
   *
   * @param categoryId ID of the category.
   * @return Optional object containing the category if found, or an empty Optional if not found.
   */
  Optional<Category> getCategory(int categoryId);
  /**
   * Saves a category in the system.
   *
   * @param category Category object to be saved.
   * @return The saved Category object.
   */
  Product save (Category category);
  /**
   * Deletes a category from the system.
   *
   * @param categoryId ID of the category to be deleted.
   */
  void delete (int categoryId);
  /**
   * Updates an existing category in the system.
   *
   * @param categoryId ID of the category to be updated.
   */
  void update (int categoryId);
}
