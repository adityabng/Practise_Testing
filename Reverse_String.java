	

      /*              String str = "Hi this is my India"
                      Print:        "iH siht si ym aidnI"*/

	
     public class Reverse_String {
		
		
		
		public static void main(String[] args) {
			
			String str="Hi this is my India";
			String s[]=str.split(" ");
			
			String reverse="";
			
			for(int i=0;i<s.length;i++) {
				
				
				String word=s[i];
				String reverseword="";
				
				for(int j=word.length()-1;j>=0;j--) {
					reverseword=reverseword+word.charAt(j);
					
				}
				
				reverse=reverse+reverseword+" ";
				
				
			}
			
			System.out.println(reverse);
			
		}
	
	}
