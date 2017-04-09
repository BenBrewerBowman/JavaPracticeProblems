
package javapracticeproblems;
import java.util.*;

public class Hashmap {
    
    // Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
    public static Map<String, String> mapAB(Map<String, String> map) 
    {
        if(map.containsKey("a") && map.containsKey("b"))
            map.put("ab", map.get("a") + map.get("b") );
        return map;
    }
    
    // Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both. 
    public static Map<String, String> mapAB2( Map<String, String> map)
    {
        if( map.containsKey("a") && map.containsKey("b") ) 
            if( map.get("a").equals(map.get("b")) ) {
                map.remove("a");
                map.remove("b");
            }
        return map;
    }
    
    // Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
    public static Map<String, String> mapAB3( Map<String, String> map)
    {
        if( map.containsKey("a") ^ map.containsKey("b") ) {
            if( map.containsKey("a") ) map.put("b", map.get("a"));
            else map.put("a", map.get("b"));
        }
        return map;
    }
    
    // Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
    public static Map<String, String> mapAB4(Map<String, String> map)
    {
        if( map.containsKey("a") && map.containsKey("b") && map.containsKey("c"))
        {
            if( map.get("a").length() == map.get("b").length() ) {
                map.put("a", "");
                map.put("b", "");
            }
            else if ( map.get("a").length() > map.get("b").length() ) 
                map.put("c", map.get("a"));
            else if (map.get("a").length() < map.get("b").length()) 
                map.put("c", map.get("b"));             
        }
        return map;
    }
}
