package com.babursomer.lesson_029;

public class HelloGlobal {
	
	public static void main(String[] args) {
		Messages messages = new Messages("en", "CH");
		System.out.println(messages.getString("HelloGlobal.HI")); //$NON-NLS-1$
		System.out.println(messages.getString("HelloGlobal.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(messages.getString("HelloGlobal.SPLITTER")); //$NON-NLS-1$
		System.out.println(messages.getString("HelloGlobal.THANKS")); //$NON-NLS-1$
		System.out.println(messages.getString("HelloGlobal.SPLITTER")); //$NON-NLS-1$
		System.out.println(messages.getString("HelloGlobal.BYE")); //$NON-NLS-1$
	}
	
}
