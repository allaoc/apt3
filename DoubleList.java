 public class DoubleList {
      public ListNode bigify(ListNode list) {
          ListNode first = list;
		  while (list != null) {
			  ListNode after = new ListNode(list.info,list.next);
			  list.next = after;
			  list = after.next;
		  }
          return first;
      }
  }