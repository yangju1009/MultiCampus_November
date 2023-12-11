package 문자열관련;

public class 문자열뒤집기 {
	String s = "감자고구마양파";
	//String s2 = 
}

class Solution {
    public String solution(String my_string) { //"bread"
        String answer = ""; //"daerb"
        for (int i = my_string.length() -1 ; i >= 0; i--) {
			answer = answer + my_string.charAt(i);
		}
        return answer; 
    }
}
