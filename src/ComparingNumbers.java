
public class ComparingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 82;
int b = 64;
int c = 2;
int d = 221;
int e = 18;
int f = 81;
int g = comparingnumbers(a,b);
System.out.println("Compare the numbers" + comparingnumbers(a,b));
System.out.println("Compare the numbers" +comparingnumbers (c,d) );
System.out.println("Compare the numbers" +comparingnumbers(e,f) );
	}

	public static int comparingnumbers(int num1, int num2){
	
	if (num1<num2){
	return	num1;
	}else{
		return num2;
		 
	 }
	

	}
}