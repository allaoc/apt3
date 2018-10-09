public class ListStretch {
      public ListNode stretch (ListNode list, int amount){
          ListNode first = list;
		  while (list != null) {
			  ListNode seq = list.next;
			  for (int c = 1; c < amount; c++) {
				  ListNode after = new ListNode(list.info,null);
				  list.next = after;
				  list = after;
			  }
			  list.next = seq;
			  list = seq;
		  }
          return first;
      }
  }