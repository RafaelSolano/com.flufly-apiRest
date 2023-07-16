package com.flufly.web.domain.repository;

import com.flufly.web.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
  /**
   * Retrieves a list of all products.
   *
   * @return List of all products.
   */
  List<Product> getAll();
  /**
   * Retrieves a specific product by its ID.
   *
   * @param productId ID of the product.
   * @return Optional object containing the product if found, or an empty Optional if not found.
   */
  Optional <Product> getProduct(int productId);
  /**
   * Saves a product in the system.
   *
   * @param product Product object to be saved.
   * @return The saved Product object.
   */
  Product save (Product product);
  /**
   * Deletes a product from the system.
   *
   * @param productId ID of the product to be deleted.
   */
  void delete (int productId);
  /**
   * Updates an existing product in the system.
   *
   * @param productId ID of the product to be updated.
   */
  void update (int productId);

  /**
   * Retrieves a list of products belonging to a specific category.
   *
   * @param categoryId ID of the category.
   * @return Optional object containing the list of products if the category is found, or an empty Optional if the category is not found.
   */
  Optional<List<Product>> getByCategory(int categoryId);
  /**
   * Retrieves a list of products belonging to a specific species.
   *
   * @param speciesId ID of the species.
   * @return Optional object containing the list of products if the species is found, or an empty Optional if the species is not found.
   */
  Optional<List<Product>>getBySpecie(int speciesId);

  /**
   * Retrieves a list of scarce products based on the specified quantity.
   *
   * @param quantity The minimum quantity threshold for products to be considered scarce.
   * @return Optional object containing the list of scarce products if any are found, or an empty Optional if no scarce products are found.
   */
  Optional<List<Product>> getScarseProducts(int quantity);


}
