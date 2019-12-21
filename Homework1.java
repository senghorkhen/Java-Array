package Chapter4;
import java.util.*;
public class Homework1 {
	public static void main(String[] args) {
		String[] employee = {"Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika"};
		int[] salary = {560, 560, 500,500, 190, 190, 560,700};
		// Ex1. a: find who has the highest salary
	
		// find the maximum salary
		int max = salary[0];
		for(int i = 1; i < salary.length; i++) {
			if(max < salary[i]) {
				max = salary[i];
			}
		}
		System.out.println("the highest salary " + "" + max + "$");
		//get who has this maximum salary
		for (int i =0; i<salary.length; i++) {
			if(salary[i] == max) {
				System.out.println("Employee: " + employee[i]);
			}
		}
		System.out.println("-----------------------------");
		// Ex1. b: find who has the lowest salary
		//find the minimum salary
		int min = salary[0];
		for (int j = 0; j < salary.length; j++) {
			if(min > salary[j]) {
				min = salary[j];
			}
		}
		System.out.println(min);
		// Get who has this minimum salary
		for (int j =0; j < salary.length; j++) {
			if(salary[j] == min) {
				System.out.println("Employee: " + employee[j]);
			}
		}
		System.out.println("-----------------------------");
		// Ex1. c: find who has the lower than average salary
		// find average salary
		int result = 0;
		int average = 0;
		for (int i = 0; i <salary.length; i++) {
			result += salary[i];
		}
		average = result / salary.length;
		System.out.println(average);
		// find employee who has lower salary
		for (int i =0; i< salary.length; i++) {
			if(salary[i] < average) {
				System.out.println(employee[i]);
			}
		}
		System.out.println("-----------------------------");
		// d: find who has higher salary
		for (int k =0; k < salary.length; k++) {
			if(salary[k] > average) {
				System.out.println(employee[k]);
			}
		}
		System.out.println("-----------------------------");
		// Ex1. e: Find who has the same salary
		//get all employees who have the same salary
		Set duplicate = new HashSet();
		for (int i = 0; i < salary.length; i++) {
			for(int j = i + 1; j < salary.length; j++) {
				if (salary[i] == salary[j]) {
					if (!duplicate.contains(salary[j])) {
						duplicate.add(salary[j]);
						for(int k = 0; k <salary.length; k++) {
							if (salary[j] == salary[k]) {
								System.out.println(employee[k] + " : " + salary[k]);
							}
						}
					}
				}
			}
				
		}
		
	}
}

