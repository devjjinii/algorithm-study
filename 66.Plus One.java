public class PlusOne {

	/*
	 *  Example 1:
		Input: [1,2,3]
		Output: [1,2,4]
		Explanation: The array represents the integer 123.
		
		Example 2:
		Input: [4,3,2,1]
		Output: [4,3,2,2]
		Explanation: The array represents the integer 4321.
		
		배열을 정수로 보고 +1
		
		Input: [9]
		Output: [1,0]
		
		You may assume the integer does not contain any leading zero, except the number 0 itself.
	 * */
	
	public static void main(String[] args) {
		int[] temp = {1,2,3};
		System.out.println(plusOne(temp));
	}

	public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] rst = new int[digits.length + 1];
            rst[0] = 1;
            return rst;
        }
        return digits;
     }
	 
//		int a = digits.length -1;
//		if(digits[a] < 9) {
//			digits[a] = ++digits[a];
//		} else {
//			do {
//				digits[a--] = 0;
//			} while (a >=0 && digits[a] == 9);
//			if( digits[a] != 0) {
//				++digits[a];
//			} else {
//				digits = new int[digits.length + 1];
//				digits[0] = 1;
//			}
//		}
//		return digits; 

}

