package com.example;
public class TaskEx6 {

	public static void main(String[] args) {
		int a[] = {45,64,23,60,12,5,10,52};
		int len=a.length;
		int temp;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++){
          System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Second Largest no = "+a[len-2]);
	}

}
