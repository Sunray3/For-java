import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Testdemo {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<>();
        map.put("猴子","悟空");
        map.put("猪","悟能");
        map.put("沙","和尚");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        String str = map.getOrDefault("唐","僧");
        System.out.println(str);
        System.out.println(map.containsKey("猴子"));
        System.out.println(map.containsValue("和尚"));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> collection= new ArrayList<>();
        collection.add("fdsa");
        collection.add("gcxz");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("f");
        collection.add("sun");
        collection.add("rui");
        for (String s:collection){
            System.out.println(s);
        }

    }
}
