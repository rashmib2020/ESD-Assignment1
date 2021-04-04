//39. Implement a Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes.


//1 kb= 1000bytes
//1 mb= 1000000 bytes
class MemoryBytes
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);

		float b= (float)(n/1000);

		System.out.println( n + " is " + b + "bytes");
	}
}