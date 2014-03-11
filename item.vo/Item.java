package item.vo;

import java.util.LinkedList;

public class Item {

	private String content;
	private LinkedList<Item> list;

	public Item(String content) {
		super();
		this.content = content;
		list = new LinkedList<Item>();
	}

	public LinkedList<Item> getList() {
		return list;
	}

	public void setList(LinkedList<Item> list) {
		this.list = list;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setLink(Item item){
		list.add(item);
	}
	
	
	
}
