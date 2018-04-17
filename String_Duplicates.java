import java.util.StringTokenizer;

public class String_Duplicates {
		
	/*aaabbcccddahhbbfe
	print a3b2c3d2a1h2b2f1e1*/
		
		
		public static void main(String[] args) {
			
			String str="aaabbccaddbbc";
		  
			 int count=1;
			for(int i=0;i<str.length()-1;i++) {
				
				//for(int j=1;j<str.length();j++)
				
				/* System.out.println(str.length());
				 System.out.println(i);*/
				 
				if(str.length()==i+2) {
					System.out.println(str.charAt(i)+count);
				}
				
				else if(str.charAt(i)==str.charAt(i+1)) {
					count++;
				}
				else {
					
					System.out.println(str.charAt(i)+" "+count);
					count=1;
				}	
            	}
            		
            //	System.out.println(s);
            }
      	
			
		}
	
	
