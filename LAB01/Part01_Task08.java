import java.util.*;
public class Part01_Task08{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter dimension");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      b[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      c[i] = (5*a[i])-b[i];
    }
    for(int i=0; i<n; i++){
      if(i==n-1){
        System.out.print(c[i]);
      }
      else{
        System.out.print(c[i]+" ");
      }
    }
  }
}

