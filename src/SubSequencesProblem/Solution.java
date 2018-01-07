/**
 * 
 */
package SubSequencesProblem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ArunMannuru
 *
 */
/* 
 * 	Amazon wants to label its products with tags, which are string of alphanumeric characters. Each 
 * 	Product is associated with a specific sequence of tags.Edward, an employee in the company, has been assigned the task
 * 	of labelling the products. He has been given a sequence of all tags that could be associated with any product, as well as
 * 	a sequence of all desired tags for the product that he is labeling.His task is to find the 0-based start and end indices
 * 	of the shortest continuous subsequence containing all the desired tags, then output the one with the similar start index.
 * 
 *  Implement an algorithm to find the 0-based start index and end index of the minimum continuous subsequences containing all the desired tags in any order.
 * 
 * 	Output:
 * 	Return a list where the first element is the start index and the second element is the ending index.If more
 * 	than one minimum continuous subsequence contains the desired tags then return the one with the smaller start
 *  index.If there isn't a match.Output a list of length of 1 with content 0.
 *  
 *  Note:
 *  targetList does not contain duplicate tags.
 *  The returned subSequence may include additional tags beyond those in targetList.
 *  The available Taglist may include tages other than those in the targetlist, and some tags may be duplicated
 *  targetList and available taglist consists of only alphanumeric character strings
 *  if any of the tags in targetList are missing from available Taglist, then output[0].
 *  
 *  Example:
 *  input:
 *  targetList = ["made","in","india"]
 *  available TagList = ["made","weather","forecast","says","that","made","rain","in","spain","stays"]
 * 
 *	Output:
 *	[5,8] 
 * 
 * 	Explanation:
 * 	Two of the possible subsequences are
 * 	The first subsequence occurs with size 9, where the first occurance of any tag is at the 0th index with
 * 	made, and it hits in at index 7, and the last one spain at the 8th index.
 * 	The Second subsequence occurs with size 4, where the first occurance of any tag is at the 5th index with
 * 	made, and it hits in at index 7, and the last one spain at the 8th index.
 * 	So, the output is [5,8] because we are looking for the minimum continuous subsequence.
 * 
	 * 
	 * 
	 * 
	 */

public class Solution {

	
	public static void main(String[] args){
		
		LinkedList<String> targetList = new LinkedList<String>();
		LinkedList<String> availableTagList = new LinkedList<String>();
		
		targetList.add("made");
		targetList.add("in");
		targetList.add("india");
		
		availableTagList.add("made");
		availableTagList.add("weather");
		availableTagList.add("forecast");
		availableTagList.add("says");
		availableTagList.add("that");
		availableTagList.add("in");
		availableTagList.add("spain");
		availableTagList.add("stays");
		
		System.out.println(subSequence(targetList,availableTagList));
		
	}

	static List<Integer> subSequence(List<String> targetList,List<String> availableTagList){
		
		Map<String,Integer> finalMap = new LinkedHashMap<String,Integer>();
		for(String baseStr: targetList){
			for(int i=0; i < availableTagList.size(); i++){
				String allStr = availableTagList.get(i);
				Pattern pat = Pattern.compile(baseStr);
				Matcher mat = pat.matcher(allStr);
				if(baseStr.length() == allStr.length()){
					while(mat.find()){
						finalMap.put(baseStr, i);
					}
				}
			}
		}
	List<Integer> output = new ArrayList<Integer>();
	int count =0;
	
		for(Entry<String,Integer> entry:finalMap.entrySet()){
			if(count == 0){
				output.add(entry.getValue());
			}
			if(count == finalMap.entrySet().size()-1){
				output.add(entry.getValue());
			}
			count++;
		}
		return output;
	}
}

