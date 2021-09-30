package ReverseanArraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class reversearraylist {
	public static void main(String[] args) {

		 List<Integer> arraylist = new ArrayList<Integer>();
		 
		 for(int i =1;i<=10;i++) {
		 arraylist.add(i);
		 }
		 
		 Collections.reverse(arraylist);
		 
		 for(int i: arraylist) {
		 System.out.println(i);
		 }
		 
		 
		}

}
