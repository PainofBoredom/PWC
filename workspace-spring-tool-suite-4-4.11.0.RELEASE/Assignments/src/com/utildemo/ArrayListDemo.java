package com.utildemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<User> al = new ArrayList<User>();
		
		al.add(new User(101, "adam", "adam@mail.com"));
		al.add(new User(102, "chavi", "chavi@mail.com"));
		al.add(new User(103, "tom", "tom@mail.com"));
		
		for(User us:al) {
		System.out.println(us);
	}
	System.out.println("Get the user " + al.get(1));
	al.remove(1);
	for(User us:al) {
	System.out.println("second time " + us);
	}
}
}