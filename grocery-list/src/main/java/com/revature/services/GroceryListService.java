package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.GroceryItems;
import com.revature.models.GroceryList;
import com.revature.repos.GroceryListRepository;

@Service
public class GroceryListService {

	private GroceryListRepository groceryRepo;	
	
	public GroceryListService(GroceryListRepository groceryRepo) {
		this.groceryRepo = groceryRepo;
	}
	
	@Transactional(readOnly=true, isolation = Isolation.READ_COMMITTED)
	public List<GroceryList> getAll() {
		return (List<GroceryList>) groceryRepo.findAll();
	}

	@Transactional	
	public GroceryList addList(GroceryList newGroceryList) {
		if(newGroceryList.getFirstName().equals("") || newGroceryList.getLastName().equals("")) return null;
		if(newGroceryList.getFirstName() == null || newGroceryList.getLastName() == null) return null;
		return groceryRepo.save(newGroceryList);
	}

	public boolean deleteList(int id) {
		groceryRepo.deleteByList(id);
	
		return false;
	}

	public boolean deleteItem(int id) {
		groceryRepo.deleteByItem(id);
		return false;
	}
//Do i need to include the updated items to the list?
	public GroceryList updateList(GroceryList newGroceryList, GroceryItems newItem) {
		if(newGroceryList.getFirstName().equals("") || newGroceryList.getLastName().equals("")) return null;
		if(newGroceryList.getFirstName() == null || newGroceryList.getLastName() == null) return null;
		return groceryRepo.save(newGroceryList);
	}

}
