package LOOP;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsAndLists {

    public static void main(String[] args) {

/*
 if a string is given in the following format (key1)str(key2)str
 and you are given a list <list<String>> consisting of <"key1","value1"> format,
  how do you replace keys (in the string) with values given the list,
  if the string does not contain any keys in the list then replace such keys with ?,
   for example  s=(name)loves(food)verymuch; knowledge=<<"name","sam">,<"food","salad">>,
    output should be samelovessaladverymuch
 */

    }

    private static void DynamicTable(String s) {
        Map<String,String> listMap = new LinkedHashMap<>();
        listMap.put("name","sam");
        listMap.put("food","salad");

        s = s.replaceAll("(name)",listMap.get("name")).
                   replaceAll("(food)",listMap.get("food"));
        System.out.println(s);

    }

}
