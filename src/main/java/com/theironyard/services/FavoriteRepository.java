package com.theironyard.services;

import com.theironyard.entities.Favorite;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Caroline on 3/14/16.
 */
public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {
}
