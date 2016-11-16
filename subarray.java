package office;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class subarray {

	public static void main(String[] args) {
	int z=0;	
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	int [] array = new int [n];
	
	for (int i=0; i<n; i++) {
		array[i] = s.nextInt();
		}
	
	for(int j=0;j<n;j++){
        int sum=0;
        for(int k=j;k<n;k++){
            sum=array[k]+sum;
            if(sum<0){
                z++;
            }
        }
    }
    System.out.println(z);
	
	
	
	
	
	
	System.out.println(Arrays.toString(array));
	System.out.println(z);
	}

}
