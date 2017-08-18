/**
 * 
 */
package walmartlabs;

/**
 * problem statement :---
 * 
 * Given a number N. print in how many ways it can be represented as N = a+b+c+d
 * , 1< =a< =b< =c< = d; 1<=N< = 5000 For N = 4: 
 
 
 Only 1 way - 1 + 1 + 1 + 1 For
 * N = 5: Only 1 way - 1 + 1 + 1 + 2 For N = 6: 2 ways - 1 + 1 + 1 + 3 1 + 1 + 2
 * + 2 For N = 7: 3 ways - 1 + 1 + 1 + 4 1 + 1 + 2 + 3 1 + 2 + 2 + 2 For N = 8:
 * 5 ways - 1 + 1 + 1 + 5 1 + 1 + 2 + 4 1 + 1 + 3 + 3 1 + 2 + 2 + 3 2 + 2 + 2 +
 * 2 So in order to understand this one, lets make Dynamic Programming solution
 * where n = number k= number of parts here k=4 (a,b,c,d) DP[n,1] = 1 DP[n,2] =
 * DP[n-2, 2] + DP[n-1,1] DP[n,3] = DP[n-3, 3] + DP[n-1,2] DP[n,4] = DP[n-4, 4]
 * + DP[n-1,3] So Final DP equation is ==> DP[n,k] = DP[n-k, k] + DP[n-1,k-1]
 * 
 * @author sandeep
 *
 */
public class NumberSumProb {

	public static void main(String[] args) {

		int n = 5000;
		int k = 4;

		System.out.println(DP(n, k));

	}

	private static int DP(int n, int k) {
		if (n == k)
			return 1;
		if (n < k)
			return 0;
		if (k == 1)
			return 1;
		else
			return (DP(n - k, k) + DP(n - 1, k - 1));

	}

}
