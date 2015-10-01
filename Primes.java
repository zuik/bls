public class Primes{

  public static void main(String[] args){
    // test your methods here

    //System.out.println(countFactors());
    printPrimes(44);

  }

  public static int countFactors(int n){
   int count = 0;
   for(int i = 2; i<n; i++){
     if (n%i==0){
       //System.out.println(i);
       count++;
     }
   }
   return count;
  }

  // return true if n is prime and false if it is not
  // MUST USE countFactors
  public static boolean isPrime(int n){
  if(countFactors(n)==0)
    return true;
  return false;
  }

  // print primes up to n.
  // MUST USE isPrime
  public static void printPrimes(int n){
    if (n>=2)
      System.out.print(2);
    for(int i =3; i<=n; i++ ){
      if(isPrime(i)==true)
        System.out.print(", " + i);
    }
  }
}
