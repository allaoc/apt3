public class ListLastFirst {
      public ListNode move(ListNode list) {
          ListNode oldfirst = list;
		  ListNode back = list;
		  if (list == null || list.next == null) {
			  return list;
		  }
		  while (list.next != null) {
			  back = list;
			  list = list.next;
		  }
		  ListNode ret = new ListNode(list.info, oldfirst);
		  back.next = null;
          return ret;
      }
  }