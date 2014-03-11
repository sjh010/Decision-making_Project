package item.vo;

import java.util.LinkedList;

public class ItemFactory {

	private Item start = new Item("식사를 합시다! 1.한식  2.일식  3.중식");
	private Item itemA1 = new Item("한식을 선택했습니다. 1.고기류  2.찌개류  3.밥류");
	private Item itemA2 = new Item("일식을 선택하셨습니다. 1.밥류  2.면류");
	private Item itemA3 = new Item("중식을 선택하셨습니다. 1.면류  2.밥류  3.요리");
	
	private Item itemA1_B1 = new Item("고기류를 선택하셨습니다. 1. 삽겹살  2.소불고기  3.치킨");
	private Item itemA1_B2 = new Item("찌개류를 선택하셨습니다. 1.김치찌개  2.된장찌개  3.순두부찌개");
	private Item itemA1_B3 = new Item("밥류를 선택하셨습니다. 1.비빔밥  2.제육덮밥  3.회덮밥");
	
	private Item itemA2_B1 = new Item("밥류를 선택하셨습니다. 1.돈부리  2.돈까스");
	private Item itemA2_B2 = new Item("면류를 선택하셨습니다. 1.우동  2.라멘");
	
	private Item itemA3_B1 = new Item("면류를 선택하셨습니다. 1.짜장  2.짬뽕");
	private Item itemA3_B2 = new Item("밥류를 선택하셨습니다. 1.잡채밥  2.볶음밥");
	private Item itemA3_B3 = new Item("요리를 선택하셨습니다. 1.깐풍기  2.탕수육");
	
	private Item itemA1_B1_C1 = new Item("삼겹살을 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B1_C2 = new Item("소불고기를 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B1_C3 = new Item("치킨을 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA1_B2_C1 = new Item("김치찌개를 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B2_C2 = new Item("된장찌개를 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B2_C3 = new Item("순두부찌개를 선택했습니다. 맛있게 드세용");
	
	private Item itemA1_B3_C1 = new Item("비빔밥을 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B3_C2 = new Item("제육덮밥을 선택하셨습니다. 맛있게 드세용");
	private Item itemA1_B3_C3 = new Item("회덮밥을 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA2_B1_C1 = new Item("돈부리를 선택하셨습니다. 맛있게 드세용");
	private Item itemA2_B1_C2 = new Item("돈까스를 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA2_B2_C1 = new Item("우동을 선택하셨습니다. 맛있게 드세용");
	private Item itemA2_B2_C2 = new Item("라멘을 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA3_B1_C1 = new Item("짜장을 선택하셨습니다. 맛있게 드세용");
	private Item itemA3_B1_C2 = new Item("짬뽕을 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA3_B2_C1 = new Item("잡채밥을 선택하셨습니다. 맛있게 드세용");
	private Item itemA3_B2_C2 = new Item("볶음밥을 선택하셨습니다. 맛있게 드세용");
	
	private Item itemA3_B3_C1 = new Item("깐풍기를 선택하셨습니다. 맛있게 드세용");
	private Item itemA3_B3_C2 = new Item("탕수육을 선택하셨습니다. 맛있게 드세용");
	

	

	public LinkedList<Item> setList(){
		start.setLink(itemA1);
		start.setLink(itemA2);
		start.setLink(itemA3);
		
		itemA1.setLink(itemA1_B1);
		itemA1.setLink(itemA1_B2);
		itemA1.setLink(itemA1_B3);
		
		itemA2.setLink(itemA2_B1);
		itemA2.setLink(itemA2_B2);
		
		itemA3.setLink(itemA3_B1);
		itemA3.setLink(itemA3_B2);
		itemA3.setLink(itemA3_B3);
		
		itemA1_B1.setLink(itemA1_B1_C1);
		itemA1_B1.setLink(itemA1_B1_C2);
		itemA1_B1.setLink(itemA1_B1_C3);
		
		itemA1_B2.setLink(itemA1_B2_C1);
		itemA1_B2.setLink(itemA1_B2_C2);
		itemA1_B2.setLink(itemA1_B2_C3);
		
		itemA1_B3.setLink(itemA1_B3_C1);
		itemA1_B3.setLink(itemA1_B3_C2);
		itemA1_B3.setLink(itemA1_B3_C3);
		
		itemA2_B1.setLink(itemA2_B1_C1);
		itemA2_B1.setLink(itemA2_B1_C2);
		
		itemA2_B2.setLink(itemA2_B2_C1);
		itemA2_B2.setLink(itemA2_B2_C2);
		
		itemA3_B1.setLink(itemA3_B1_C1);
		itemA3_B1.setLink(itemA3_B1_C2);
		
		itemA3_B2.setLink(itemA3_B2_C1);
		itemA3_B2.setLink(itemA3_B2_C2);

		itemA3_B3.setLink(itemA3_B3_C1);
		itemA3_B3.setLink(itemA3_B3_C2);
		
		LinkedList<Item> decisionList = new LinkedList<Item>();
		
		decisionList.add(start);
		decisionList.add(itemA1);
		decisionList.add(itemA2);
		decisionList.add(itemA3);
		
		return decisionList;
		
	}
	
	
}
