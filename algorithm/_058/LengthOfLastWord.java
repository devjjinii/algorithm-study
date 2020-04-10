package _058;

/*
 *  Input: "Hello World"
	Output: 5 
	마지막 단어 길이 구하기.
 * 
 * */

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("dev jjinii"));
	}

	// return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
	private static int lengthOfLastWord(String s) {
		 int a = s.length() -1;
		 while (a >= 0 && s.charAt(a) == ' ') a--;
		 
		 int end = a;
		 while (a >= 0 && s.charAt(a) != ' ') a--;
		 
		 return end - a;
		 
//		 split " " 해서 공백
		 
//		 String[] str = s.split(" ");
//		 if(str.length == 0 ) return 0;
//		 return str[str.length-1].length();
	}

}
