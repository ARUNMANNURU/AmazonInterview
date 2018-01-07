/**
 * 
 */
package WordGame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ArunMannuru
 *
 */
/*
 * Michelle has created a word game for her students.The word game begins with Michelle writiting
 * a string and a number, K on the board.The students must find a substring of size K such that there is 
 * exactly one character that is repeated once; in other words there should be k-1 distinct characters in the
 * substring
 * 
 *  Write an algorithm to help the students find the correct answer.If no such substring can be found
 *  return empty list, If multiple such substring exist; return all of them, without repetations.The order in
 *  which the substrings are returned does not matter.
 *  
 *  Input:
 *  The input to function/method consists of two arguments:
 *  inputString, representing the string written by the teacher.
 *  num, an integer representing the number K written by the teacher on the board
 *  
 *  Output:
 *  Return a list of all substrings of inputString with K characters,that have K-1 distinct characters
 *  ie. exactly one character is repeated, or an empty list if no such substring exitst in inputString. The order
 *  in which the substrings are returned does not matter.
 *  
 *  Constraints:
 *  
 *  The input integer can only be greater than or equal to 0 and less than or equal to 26
 *  The input string consists of only lowercase alphabets characters.
 * 	
 * 	Explanation:
 *  The SubStrings are [awag, wagl, aglk]
 *  The answer is awag as it has 3 distinct characters in a string of size 4, and only one character is repreated
 *  twice. 
 * 
 */
public class Solution {

	public static void main(String[] args){
		
		String inputString = "awag";
		
		int num = 4 ;
		
		System.out.println(subStringLessKDist(inputString,num));
		
	}
	
	public static List<String> subStringLessKDist(String inputString,int num){
		
		List<String> newList = new ArrayList<String>();
		List<String> finalList = new ArrayList<String>();
		
		if(num == 0){
			return newList;
		}else if(num >= inputString.length()){
			return newList;
		}else if(num > 0 && num <= 26){
			int i=0;
			int j=num;
			
			while(j-i <= inputString.length()){
				if(j > inputString.length()){
					break;
				}
				newList.add(inputString.substring(i,j));
				i++;
				j++;
			}
			for(String str: newList){
				List<Character> myChar = new ArrayList<Character>();
				char[] myOutput = str.toCharArray();
				int rep = 0;
				for(int k=0; k < myOutput.length; k++){
					if(myChar.contains(myOutput[k])){
						rep++;
					}
					myChar.add(myOutput[k]);
				}
				if(rep == 1){
					finalList.add(str);
				}
			}
			return finalList;
		}else{
			return newList;
		}
		
	}
}
