package list;
import java.util.*;

public class ArrayListGeneric {

	public static void main(String[] args) {
	ArrayList<Object> ar = new ArrayList<Object>();
	ar.add(100);
	ar.add("Rim");
	ar.add("Rim");
	System.out.println(ar.get(1));
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(23);
	ar1.add(234);
	ar1.add(34);
	ar1.add(304);
	ar1.add(134);
	ar1.add(349);
	ar1.add(384);
	System.out.println(ar1);
	ar1.add(2, 897);
	System.out.println(ar1);
	
	for(int i =0; i<=ar1.size()-1; i++)
		System.out.println(ar1.get(i));
	System.out.println("_________________________");
	for(Integer e : ar1)
		System.out.println(e);	
	
	Collections.sort(ar1, Collections.reverseOrder());
	
	System.out.println(ar1);
	
	Collections.replaceAll(ar, "Rim", "Rimi");
	System.out.println(ar);
	Collections.addAll(ar, 678,78,90,78,780,542,986,65);
	System.out.println(ar);
	

	}

}
