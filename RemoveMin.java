public class RemoveMin {
      public ListNode remove (ListNode list) {
          ListNode first = list;
		  int min = first.info;
		  ListNode prev = null;
		  ListNode minPrev = prev;
		  ListNode minNode = list;
		  while (list != null) {
			  if (list.info < min) {
				  min = list.info;
				  minNode = list;
				  minPrev = prev;
			  }
			  prev = list;
			  list = list.next;
		  }
		  if (minPrev == null) {
			  return first.next;
		  }
		  minPrev.next = minNode.next;
	  return first;
      }
  }