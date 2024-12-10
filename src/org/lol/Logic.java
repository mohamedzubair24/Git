package org.lol;

public class Logic {
	

		public static void main(String[] args) {
			int count=0;
			int sum=0;
			for(int i=1;i<=10;i++) {
				if(i%2==0) {
					count++;
					sum=sum+i;
					System.out.println(i);
				}
			}
			System.out.println("count ="+count);
			System.out.println("sum ="+sum);
			System.out.println("average of even no:"+sum/count);
			}

		}




