package week7e;
public class Vowelcount 
{
	static void countCharacterType(String str)

	{

		byte vowelCount=0,consonantCount=0,digitCount=0,splChars=0;

		for(short i=0;i<str.length();i++)

		{

			char ch=str.charAt(i);

			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))

			{

				ch=Character.toLowerCase(ch);

				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')

					vowelCount++;

				else

					consonantCount++;

			}

			else if(ch>='0'&& ch<='9')

				digitCount++;

			else

				splChars++;

		}

		System.out.println("the total number of vowels in the given string:"+vowelCount);

		System.out.println("the total number of consonants in the given string:"+consonantCount);

		System.out.println("the total number of Digits in the given string:"+digitCount);

		System.out.println("the total number of Special Charatcers in the given string:"+splChars);

	}

	static public void main(String[]args)

	{

		String str=("Habit-2:Begin with an end in your mind\n Stephan.R.Convey author of Sevenhabits of effective people,suggests that effective individuals have a clear visionof their destination before embarking on any end endevour.");

	    countCharacterType(str);

	}




}