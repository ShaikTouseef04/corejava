package mycodes;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList <String> friends = new LinkedList<>();
		friends.add("Touseef");
		friends.add("Safa");
		friends.add("Safan");
		friends.add("Saif");
		System.out.println(friends);
		friends.addFirst("Shaik Touseef");
		friends.addLast("Mohammed");
		System.out.println(friends);
	}

}
