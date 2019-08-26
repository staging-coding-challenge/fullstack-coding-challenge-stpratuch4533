package com.revature.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.GroceryList;

@Repository
public interface GroceryListRepository extends CrudRepository<GroceryList, Integer> {

	

}
