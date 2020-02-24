package java_basics;

public class Increment_Decrement {

	public static void main(String[] args) {
		
		 int i = 10; //here the value of i is 10
		 int j = i++; //here it is a post increment situation, here j will be 10, i will become 11
		 
		 int k = j++; //so here k is 10 but j will become 11
		 int m = ++i; // m will become 12 and i also will become 12
		 
		 //System.out.println(k); // 10
		 //System.out.println(m);  // 12
		 
		 
		 int a = 1; //latest value of a = 1
		 int b = a++;  // latest value of b is 1 but a will become 2
		 int c = a++ + ++b; // c = 2 +  2 = 4, a is 3, b is 2
		 int d = a-- - ++b;  //d = 3 - 3 = 0, a is 2, b is 3
		 int e = d-- - b--; //e = 0 - 3 = -3, d is -1, 2
		 
		 //a = 2, b = 2, c = 4, d= -1,  e = -3
		 
		 int f = a-- + ++b - --b + c++; //7
		 System.out.println(f);
		 
		 
		 System.out.println(a); //2
		 System.out.println(b);  //3
		 System.out.println(c);  //4
		 System.out.println(d);  //0
		 System.out.println(e);  //-3
		 
		// System.out.println(i); 
		// System.out.println(j); 

	}

}
