public class NestedLoop{
	public static void main(String[] args){
		int a = 0;
		for (int k = 2; k <= 6; k++){
			a *= 2;
			do{
				System.out.print(k*k);
				a+=k;
			}  while (a <= 10);
			System.out.println();
		}
	}
}
