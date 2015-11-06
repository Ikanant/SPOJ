import java.util.*;
import java.lang.*;

class prime1
{
	private static List<Integer> primeList = new ArrayList<Integer>();

	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		Scanner input = new Scanner(System.in);
		int inputCount = input.nextInt();
		int[] pairArray = new int[inputCount*2];
		for(int c=0; c<inputCount*2; c++){
			pairArray[c] = input.nextInt();
		}

		int start = 0;
		int end = 0;

		for(int i=0; i<pairArray.length; i=i+2){
			start=pairArray[i];
			end=pairArray[i+1];	

			primeList.add(2);
			primeList.add(3);
			primeList.add(5);
			primeList.add(7);
			primeList.add(9);
			primeList.add(11);

			for(int j=start; j<=end; j++){
				if(j==2 || j==3 || j==5 || j==7 || j==9 || j==11){
					System.out.println(j);
				}
				else if(j>11){
					if(isPrime(j)){
						System.out.println(j);
						primeList.add(j);
					}
				}
			}
			if(i+2!=pairArray.length)
				System.out.println();
		}
		}catch(Exception e){
            return;
        }
	}

	public static boolean isPrime(int val){
		int max = (int)Math.sqrt(val);
		boolean prime = true;
		for(int cond=0; cond<=max && cond<=primeList.get(primeList.size()-1); cond++){
			if(val%primeList.get(cond)==0){
				prime=false;
				break;
			} 
		}

		return prime;
	}
}





































