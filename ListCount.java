public class ListCount {
      public int count (ListNode list) {
          int c = 0;
		  ListNode test = list;
		  while (test != null) {
			  test = test.next;
			  c++;
		  }
	  return c;
      }
  }