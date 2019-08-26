package com.revature.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.exceptions.GroceryItemNotFoundException;
import com.revature.exceptions.GroceryListNotFoundException;
import com.revature.models.GroceryItems;
import com.revature.models.GroceryList;
import com.revature.services.GroceryListService;

@RestController
@RequestMapping("/grocery-lists")
public class GroceryController {

	private GroceryListService groceryService;

	//GET grocery-lists to find all grocery lists
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GroceryList> getAllGroceryLists() {
		return this.groceryService.getAll();
	}
	
	//POST /grocery-lists to create a new grocery list
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public GroceryList addGroceryList(@RequestBody GroceryList newGroceryList) {
		GroceryList addedGroceryList = groceryService.addList(newGroceryList);
		
		return addedGroceryList;
		
	}
	
	//POST /grocery-lists/items to add a new item to a grocery list
	@PostMapping(value="/items", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public GroceryList addGroceryItem(@RequestBody GroceryList newGroceryList, @RequestBody GroceryItems newItem) {
		GroceryList updatedGroceryList = groceryService.updateList(newGroceryList, newItem);
		return updatedGroceryList;
		
	}
	//DELETE /grocery-lists/items/{itemId} to remove an item from a grocery list
	@DeleteMapping(value= "items/{itemId}")
	public void deleteItem(@PathVariable int id) {
		boolean wasDeleted = groceryService.deleteItem(id);
		if (!wasDeleted) throw new GroceryItemNotFoundException("No grocery item with id, " + id + ", found." );
	}
	
	//DELETE /grocery-lists to delete a grocery list
	@DeleteMapping(value= "grocery-lists")
	public void deleteList(@PathVariable int id) {
		boolean wasDeleted = groceryService.deleteList(id);
		if(!wasDeleted) throw new GroceryListNotFoundException("No grocery list with id, " + id + ", found." );
	}
}
