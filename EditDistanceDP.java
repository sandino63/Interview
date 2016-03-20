package DynamicProgramming;

public class EditDistanceDP {

	public static void main(String[] args) {
		String str1 = "sanday" ;
		String str2 = "saturday" ;
System.out.println(editDIS(str1, str2,str1.length(),str2.length()));

	}
	private static int  editDIS(String str1, String str2, int m,
			int n) {
		
		int dp[][] = new int[m+1][n+1];
		
		for (int i =0 ; i < m ; i++){
			for ( int j =0 ; j < n ; i++){
				
				if(i == 0)
					dp[i][j]=j;
				else if(j == 0)	
				   dp[i][j]=i;
				else if(i-1 == j-1)
				   dp[i][j]= dp[i-1][j-1];
			   
				else  dp[i][j] = 1+min(dp[i][j-1] ,dp[i-1][j],dp[i-1][j-1]);
			}
		}
		
		return dp[m][n];
	}
	
	private static int min(int editDIS, int editDIS2, int editDIS3) {
		// TODO Auto-generated method stub
		return Math.min(Math.min(editDIS, editDIS2), editDIS3);
	}
}
