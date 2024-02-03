package InternPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingMaxRepeatedLettersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= new String("applle");
		List maxRepeatedCharacters = new ArrayList();
		int maxCount=0;
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if((s.charAt(i)==s.charAt(j))&& i>j) {
					count++;
				}
				
			}
			if(count>= maxCount) {
//				System.out.println(s.charAt(i));
				if(count>maxCount) {
					maxRepeatedCharacters.clear();
				}
				maxCount=count;
				maxRepeatedCharacters.add(s.charAt(i));
			}
				
		}
		System.out.println(maxRepeatedCharacters);

	}

}
