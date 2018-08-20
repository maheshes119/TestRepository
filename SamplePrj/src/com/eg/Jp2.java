package com.eg;

/*abstract class Writer{
	public static void write() {
		System.out.println("writing..");
	}
}

class Author extends Writer {
	 public static void write() {
	 System.out.println("Writing book");
	 }
	}
public class Jp2 extends Writer{
	public static void write() {
		 System.out.println("Writing code");
		 }
	public static void main(String[] args) {
		Writer w = new Jp2();
		 w.write();
	}
}
*/

interface Writer{
	public default void write() {
		System.out.println("writing..");
	}
}

class Author implements Writer {
	 public void write() {
	 System.out.println("Writing book");
	 }
	}
public class Jp2 implements Writer{
	public void write() {
		 System.out.println("Writing code");
		 }
	public static void main(String[] args) {
		Writer w = new Jp2();
		 w.write();
	}
}

