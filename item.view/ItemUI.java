package item.view;

import item.service.ItemService;
import item.vo.Item;

import java.util.Scanner;

public class ItemUI{

	ItemService service;
	Scanner scan;
	Item item;
	int index = 0;
	public ItemUI() {
		super();
		service = new ItemService();
		scan = new Scanner(System.in);
		item = service.nextDecision(0);
		
	}
	
	public void intro(){
		
		while(true){
			
			if(item.getList().size()==0){
				System.out.println(item.getContent());
				return;
			}
			else{
				System.out.println(item.getContent());
			}
			
			index = Integer.parseInt(scan.nextLine());
		
			item = item.getList().get(index-1);
		}
	}
}
