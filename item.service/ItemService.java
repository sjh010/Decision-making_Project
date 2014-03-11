package item.service;

import item.vo.Item;
import item.vo.ItemFactory;

import java.util.LinkedList;

public class ItemService {
	
	ItemFactory factory;
	LinkedList<Item> list;
	
	

	public ItemService() {
		super();
		factory = new ItemFactory();
		list = factory.setList();
		//System.out.println(list.get(0).getContent());
	}



	public Item nextDecision(int index){
		Item item = list.get(index);
		return item;
	}
}
