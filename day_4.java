//ADDITION OF 2D ARRAY
import java.util.*;
class day_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the row n:");
		System.out.println("Enter the size of coloumns m:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] res = new int[n][m];
		System.out.println("Enter the array"+n+"rows"+m+"coloumn elements");
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
			arr1[i][j]=sc.nextInt();
		}
		}
		System.out.println("Enter the next array elements");
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
			arr2[i][j]=sc.nextInt();
		}
		}
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
				res[i][j]=arr1[i][j]+arr2[i][j];
				}
		}
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("The addition of "+i+" row and " +j+ " coloumn are :" );
				System.out.println(res[i][j]);
			}
		}
	}
} 
// TRANSPOSE OF A MATRIX
import java.util.*;
class day_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the row n:");
		System.out.println("Enter the size of coloumns m:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] transpose = new int[m][n];
		System.out.println("Enter the array"+n+"rows"+m+"coloumn elements");
		for(int i=0; i<n;i++){
			for(int j=0;j<m;j++){
			arr[i][j]=sc.nextInt();
		}
		}
		for(int i=0; i<n; i++){
			for(int j=0;j<m;j++){
				transpose[j][i] = arr[i][j];
			}
		}
		for(int i=0; i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(transpose[i][j] + " " );
				}
				System.out.println();
		}
	}
}

//SECOND LARGEST ELEMENT
import java.util.*;
class day_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for(int i =0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			if(arr[i]>fmax){
				smax = fmax;
			    fmax = arr[i];
			}
			else if(arr[i]>smax && arr[i] != fmax){
				smax = arr[i];
			}
		}
		if(smax == Integer.MIN_VALUE){
			System.out.println("No second largest number");
		}
		else{
			System.out.println("The second largest no is : " +smax);
			}
		}
	} 

  import java.util.*;
  class day_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array n&m");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int rowadd=0;
		int coladd=0;
		int[][] arr = new int[n][m];
		for(int i =0; i<n; i++){
			for(int j =0; j<n; j++){
			arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			rowadd=0;
			for(int j=0; j<m; j++){
				rowadd = rowadd+arr[i][j];
			}
			System.out.println("The sum of row" +(i+1)+ "are :"+rowadd);
		}
		for(int j=0; j<m; j++){
			coladd=0;
			for(int i=0; i<n; i++){
				coladd= coladd+arr[i][j];
				}
				System.out.println("The sum of coloum" +(j+1)+ "are :"+coladd);
			}
	}
  }
			
