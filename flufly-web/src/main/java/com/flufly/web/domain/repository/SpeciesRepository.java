package com.flufly.web.domain.repository;

import com.flufly.web.domain.Category;
import com.flufly.web.domain.Product;
import com.flufly.web.domain.Species;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpeciesRepository {
  /**
   * Retrieves a list of all species.
   *
   * @return List of all species.
   */
  List<Species> getAll();
  /**
   * Retrieves a specific species by its ID.
   *
   * @param speciesId ID of the species.
   * @return Optional object containing the species if found, or an empty Optional if not found.
   */
  Optional<Species> getSpecies(int speciesId);
  /**
   * Saves a species in the system.
   *
   * @param species Species object to be saved.
   * @return The saved Species object.
   */
  Product save (Species species);
  /**
   * Deletes a species from the system.
   *
   * @param speciesId ID of the species to be deleted.
   */
  void delete (int speciesId);
  /**
   * Updates an existing species in the system.
   *
   * @param speciesId ID of the species to be updated.
   */
  void update (int speciesId);
}
