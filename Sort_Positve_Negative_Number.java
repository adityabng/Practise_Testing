	
      /*      9 7 -7 3 6 -1 5 -9 4 6 1
           sort and then Change alternate -ve and positive*/


	public class Sort_Positve_Negative_Number {
		
		
		public static void main(String[] args) {
			
			int b=0;
                 
			int[] a= {9,7,-7,3,6, -1, 5, -9, 4, 6, 1};
			
			for(int i=0;i<a.length-1;i++) {
		
				if(a[i]>0) {
					 b=a[i];
					
					for(int j=0;j<a.length;j++) {
						
						for(int k=j+1;k<a.length;k++) {
							
							if(a[j]>a[k]) {
								int temp = a[j];
								a[j]=a[k];
								a[k]=temp;
								
								
							}
						}
					}
				}
				
				else {
					int c=a[i];
					//System.out.println(c);
				}
				
				//System.out.println(b);
			}
			for(int p=0;p<20;p++)
			   if(a[p]>0)
				System.out.println("Ascending order"+a[p]);
			  else
				   System.out.println("Ascending order"+a[p]);
			
		}
	
	}
