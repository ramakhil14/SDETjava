package Convertkeysofamaptoalist;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
public class convertkeyofmaptolist {
	 public static void main(String[] args) {

		 Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		 
		 Set<Integer> keyset = new HashSet<Integer>();
		 List<Integer> arraylist = new ArrayList<Integer>();
		 
		 arraylist.addAll(keyset);
		 System.out.println("list is");
		 for(int i: arraylist) {
		 System.out.println(i);
		 }
		  
	 }

}
