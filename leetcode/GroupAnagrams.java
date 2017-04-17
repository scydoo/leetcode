package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 求字母相同的所有重排组合
 * example,given: ["eat", "tea", "tan", "ate", "nat", "bat"], Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]

 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String s = String.valueOf(c);
			if (!map.containsKey(s)) {
				map.put(s, new ArrayList<String>());
			}
			map.get(s).add(strs[i]);
		}
		List<List<String>> re = new ArrayList<List<String>>(map.values());
		return re;
	}
}
