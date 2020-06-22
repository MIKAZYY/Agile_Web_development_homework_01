
public class Fibonacci {
	
	public static int of (int num, int cache[]) {
		if(num == 1 || num == 2) {
			return 1;
		}
		if(cache[num] != 0) {
			return cache[num];
		}else {
			cache[num] = of(num-1, cache) + of(num-2, cache);
			return cache[num];
		}
	}
		
	
	public static void main(String[] args) {
		int[] cache = new int[21];
		for(int i=1; i<=20; i++) {
			int result = Fibonacci.of(i, cache);
			if(result > 200) {
				break;
			}
			System.out.println("fib "+i+" = "+result);
		}
	}
}
