//Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9.

class AsciiVal3
{
	public static void main(String[] args) {
		int i;

		char ch;	
	
			for(ch='a'; ch<='z'; ch++)
			{	
				System.out.println("Ascii value of " + ch + ":" + (int)ch);	
				
			}
			for(ch='A'; ch<='Z'; ch++)
			{
				System.out.println("Ascii value of " + ch + ":" + (int)ch);
				
			}
			/*for(i=0; i<10; i++)
			{
				System.out.println("Ascii value of " + i + ":" + char(i));
			}*/
			
		}
	}

