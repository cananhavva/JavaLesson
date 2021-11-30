package babursomer;

public class MyList {
	
	import java.util.ArrayList;
	import java.util.Iterator;​
public static void main(String[] args) {​
ArrayList arrayList = new ArrayList();
arrayList.add(1);
arrayList.add(1.4);
arrayList.add("Bilge");
arrayList.add(true);
MyObject myObject = new MyObject();
myObject.name = "Canan";
myObject.type = "İnsan";
myObject.power = 12;
arrayList.add(myObject);
MyObject myObject2 = new MyObject();
myObject2.name = "Güneş";
myObject2.type = "Köpek";
myObject2.power = 32;
arrayList.add(myObject2);
for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {​
Object object = (Object) iterator.next();
System.out.println(object);
MyObject obj = (MyObject) object;
System.out.println(obj.name);
}​
}​
	
}​ ​
	
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.Random;
	import java.util.Scanner;
	
	​
	
public static void main(String[] args) {​
LinkedList linkedList = new LinkedList();
ArrayList arrayList = new ArrayList();
Random rnd = new Random();
long start = System.currentTimeMillis();
for (int i = 0; i < 1000000; i++) {​
arrayList.add(rnd.nextInt());
}​
long stop = System.currentTimeMillis();
System.out.println("Inserting 1.000.000 element to ArrayList took: " + (stop - start));
start = System.currentTimeMillis();
for (int i = 0; i < 1000000; i++) {​
linkedList.add(rnd.nextInt());
}​
stop = System.currentTimeMillis();
System.out.println("Inserting 1.000.000 element to LinkedList took: " + (stop - start));
int input = BAUtils.readInt("Bir sayı");
arrayList.add(input);
System.out.println(arrayList.get(1000000));
System.out.println(linkedList.size());
}​
}​

}
