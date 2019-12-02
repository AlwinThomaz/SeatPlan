package seatplan;

import java.util.ArrayList;
import java.util.Collections;

public class SeatPlan {
	public static void createPlan() {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("JG");
		mylist.add("JB");
		mylist.add("LH");
		mylist.add("MF");
		mylist.add("AW");
		mylist.add("AT");
		mylist.add("JL");
		mylist.add("CA");
		mylist.add("HH");
		mylist.add("ZZ");
		mylist.add("ED");
		mylist.add("LC");
		mylist.add("LM");
		mylist.add("TK");
		mylist.add("ER");
		mylist.add("LC");
		mylist.add("AR");
		mylist.add("NV");
		mylist.add("RB");
		mylist.add("JK");
		mylist.add("AM");
		mylist.add("LP");
		mylist.add("CJ");
		mylist.add("Null");

		// System.out.println("Original List : \n" + mylist);

		Collections.shuffle(mylist); // put this in a different class

		for (int i = 0; i < mylist.size(); i++) {
			if ((i + 1) % 6 == 0) {
				System.out.println(mylist.get(i));

			} else {
				System.out.print(mylist.get(i) + "  ");
			}

		}
	}
}
