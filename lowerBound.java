import java.util.*;
import java.util.Scanner;


public class lowerBound {
    




    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of size of array");

        int size=sc.nextInt();

        System.out.println("enter the elements of an array");
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
            
        }
        
        System.out.println("enter the key you need to search");
        int key = sc.nextInt(); 

        
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
 
        while(low<high){
        
         if(arr[mid]==key){
             high=mid;
             mid=(low+high)/2;
             System.out.println("ele found at index\t"+mid);
         }
 
        if (arr[mid]<key){
          low = mid+1;
          mid =(low+high)/2;
        
        }
       
        else{
          high = mid;
          mid=(low+high)/2;
 
        }
         
        
    
        }
    }
    
}
