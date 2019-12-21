
package Chapter4;

public class Homework2 {

public static void main(String[] args) {

	int[] java = new int[15];
	String index = "";
	for( int i = 0; i < java.length;i++) {
		java[i] = (int)(Math.random()*11);
		System.out.print(java[i] + " ");
	}
	int count = 0;
	for(int i = 0; i < java.length;i++) {
		if(java[i] == 5) {
		count++;
		index+=i+"";
		}
	}
	System.out.println();
	if (count !=0) {
	System.out.println("There are "+count+" of number 5 fount in index as below.");
	System.out.println("Index: "+ index);
	}else {
		System.out.println("Number 5 not fount");
	}
	
	}
}