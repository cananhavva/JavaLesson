package com.babursomer.lesson_017;

public class Node {
	int data; // veri kısmı. Her çeşit veri olabilir
	Node next; // bir sonraki düğüm (node)
	
	void setData(int data) {
		this.data = data;
	}
	
	int getData() {
		return this.data;
	}
	
	void setNext(Node next) {
		this.next = next;
	}
	
	Node getNext() {
		return this.next;
	}
	
	public String content() {
		return "Düğümün içeriği: [data=" + data + ", next=" + next + "]";
	}
	
	public String allContent() {
		String retVal = "";
		Node temp = this;
		while (temp != null) {
			retVal += temp.data + " --> ";
			temp = temp.next;
		}
		return retVal;
	}
	
}
