package KeysexistsinHashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class keyExistsinHashMap {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int flag =0;
		  int key;
		  key = sc.nextInt();
		  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  
		  for(int i : map.keySet()) {
		  if(i == key) {
		  flag =1;
		  System.out.println("key is present;");
		  }
		  }
		  if(flag ==0) {
		  System.out.println("key not present");
		  }
		  sc.close();
		  
		 }

}
