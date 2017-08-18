/**
 * 
 */
package walmartlabs;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sandeep
 *
 */
public class printHighestDigitinAllPrimeNos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 50;
		List<Integer> list = getAllPrimeNos(r);
		System.out.println("prime Nos List Size " + list.size());
		List<Integer> finalListDigits = new ArrayList<>();
		for (Integer in : list) {
			System.out.println("prime Nos : " + in);
			List<Integer> digitsLits = getDigit(in);
			for (Integer dig : digitsLits) {
				finalListDigits.add(dig);
			}
		}
		Map<Integer, Integer> map = new HashMap<>();
		int maxValue = 0;
		int maxKey = 0;
		for (Integer i : finalListDigits) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);

			}

		}

		for (java.util.Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > maxValue) {

				maxValue = e.getValue();
				maxKey = e.getKey();
			}

		}
		System.out.println(map);
		System.out.println("key : " + maxKey);

	}

	private static List<Integer> getAllPrimeNos(int r) {
		boolean mark[] = new boolean[r + 1];
		List<Integer> primeNos = new ArrayList<>();
		// intially mark all values till r as true
		for (int i = 0; i <= r; i++) {
			mark[i] = true;
		}

		for (int p = 2; p * p <= r; p++) {

			// this prime nos not yet changed
			if (mark[p] == true) {
				// then update all prime nos
				for (int i = p * 2; i <= r; i += p) {
					mark[i] = false;

				}
			}
		}

		for (int i = 2; i <= r; i++) {

			if (mark[i] == true) {
				primeNos.add(i);
			}
		}

		return primeNos;

	}

	static List<Integer> getDigit(int n) {

		int loopNum = (int) Math.floor(Math.log10(n) + 1);
		List<Integer> digitList = new ArrayList<>();
		while (loopNum != 0) {
			int k = n % 10;
			digitList.add(k);
			n = n / 10;
			loopNum--;
		}
		return digitList;
	}

}
