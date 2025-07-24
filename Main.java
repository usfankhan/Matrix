// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[10][10];
    
    System.out.println("Enter the Matrix");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
        }
    }
System.out.println("MATRIX");
for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
    for(int i=0;i<3;i++){
        for(int j=i+1;j<3;j++){
             int temp=arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
        }
    }
    
    System.out.println("TRANSPOSE MATRIX");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
   
    }
}
