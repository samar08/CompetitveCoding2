/// Java code to count the
// frequency of 1 in numbers
// less than or equal to
// the given number.
import java.io.*;

class Number_of_digitone
{
	
// function to count
// the frequency of 1.
static int countDigitOne(int n)
{
	int countr = 0;
	for (int i = 1;i <= n; i *= 10)
	{
		int divider = i * 10;
		countr += (n / divider) * i +Math.min(Math.max(n %divider - i +1, 0), i);
	}
	return countr;
}

// Driver Code
public static void main (String[] args)
{
	int n = 13;
	System.out.println(countDigitOne(n));
	
	n = 113;
	System.out.println(countDigitOne(n));
	
	n = 205;
	System.out.println(countDigitOne(n));
}
}

// This code is contributed by akt_mit
