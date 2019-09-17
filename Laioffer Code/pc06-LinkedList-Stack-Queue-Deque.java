// Linkedlist Stack
// pop() , peek(), push() 

Class Stack() {

public void stack() {
	private ListNode head;
	//应该给head赋值，为null

	//add
	public Stack() {
		head = null;
	}
	// add over 

} 

public integer pop() {
	if (head == null) {
		return null;
	}
	ListNode x = head;
	head = head.next;
	
	//add 忘记末尾指向null
	x.next = null;
	//add over

	//需要返回listnode的value，而不是listnode
	return x.value;

}

public integer peek() {
	if (head == null) {
		return null;
	}
	return head;
}

public void push (integer number) {
	// 不用判断是否为null，开头已经赋值为null
	ListNode node = new ListNode(number);
	node.next = head;
	head = node;
	//delete
	// if (head == null) {
	// 	list.insert(number);
	// 	number.next = null;
	// }
	// number.next = head;
	// head = number;
	//Delete over
}
}

//
//  Linkedlise Queue
//

Class Queue() {

//Listnode head = new Listnode();
//add
ListNode head;
ListNode tail;



//int num = 0;


//private void Queue() {
public Queue(){
  head = null;
//add
  tail = null;

}
}
  
private void offer(integer x) {
  // Listnode input = new Listnode(x);
  // input.next = head;
  // head = input;
  // num++;
  if ( head == null) {
  	head = new ListNode(x);
  	tail = head;
  }
    else {
    	tail.next = new ListNode(x);
    	tail = tail.next;
    }
  }
}

pravite integer poll() {
  //Listnode result = new Listnode(0); 
  //int answer = 0;
  if (head == null) {
	return null;
  }

/*  /*for ( int i =0; i < num - 2; i++ ) {
	result = head.next;
  }*/
	
/*  answer = result.next.value;
  result.next = null;
  reuturn answer; */ 
  ListNode node = head;
  head = head.next;
  if (head == null) {
  	tail = null;
  }
  node,next = null;  //此处没有必要，但是更专业
  return node.value;
}

private integer peek() {
  // Listnode result = new Listnode(0); 
  
  if (head == null) {
	return null;
  }

 /* for ( int i =0; i < num - 1; i++ ) {
	result = head.next;
  }
  return result.value;*/
  return head.value;
}
}
