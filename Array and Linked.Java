package 자바의정석;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayPr {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		System.out.println("==============================");

		Collections.sort(list1); // list1과 list2를 정렬한다.
		Collections.sort(list2);
		print(list1, list2);
		System.out.println("==============================");

		System.out.println("list1.containsAll(list2) :" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
		print(list1, list2);
		
		list2.set(3, "AA"); // 인덱스가 3인곳에 "AA"를 추가
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		
		print(list1, list2);
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("--------------------------------");
		for (int i = list2.size()-1; i >=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}

		print(list1, list2);
		System.out.println("--------------------------------");
		for (int i = 0; i < list2.size(); i++) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		System.out.println("--------------------------------");
		
	
		
	}

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 :" + list1);
		System.out.println("lt2 :" + list2);
		System.out.println();
	}

}


//--------- Linked

package 자바의정석;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedPr {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
		}
	}

}
