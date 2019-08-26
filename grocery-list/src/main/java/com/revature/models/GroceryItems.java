package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GROCERY_ITEMS")
//Primary key generator
@SequenceGenerator(name="item_gen", sequenceName="item_seq", allocationSize=1)
public class GroceryItems {

		@Id
		@Column(name="ID")
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="item_gen")
		private int id;

		@Column(name="GROCERY_ITEM")
		private String groceryItem;
		
		@Column(name= "ITEM_TYPE")
		private String itemType;
		
		public GroceryItems() {
			super();
		}
		
		public GroceryItems(String groceryItem, String itemType) {
			super();
			this.groceryItem = groceryItem;
			this.itemType = itemType;
		}
		
		public GroceryItems(int id, String groceryItem, String itemType) {
			super();
			this.id = id;
			this.groceryItem = groceryItem;
			this.itemType = itemType;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getGroceryItem() {
			return groceryItem;
		}

		public void setGroceryItem(String groceryItem) {
			this.groceryItem = groceryItem;
		}

		public String getItemType() {
			return itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((groceryItem == null) ? 0 : groceryItem.hashCode());
			result = prime * result + id;
			result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GroceryItems other = (GroceryItems) obj;
			if (groceryItem == null) {
				if (other.groceryItem != null)
					return false;
			} else if (!groceryItem.equals(other.groceryItem))
				return false;
			if (id != other.id)
				return false;
			if (itemType == null) {
				if (other.itemType != null)
					return false;
			} else if (!itemType.equals(other.itemType))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "GroceryItems [id=" + id + ", groceryItem=" + groceryItem + ", itemType=" + itemType + "]";
		}
		
		
}
