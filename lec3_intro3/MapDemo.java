package lec3_intro3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    void main() {
        Map<String, Integer> m = new HashMap<>();
        // pytho would look this
        // m["cat"] = 5;

        m.put("cat", 5);
        m.put("dog", 917);

        // in python m["cat"]
        IO.println(m.get("cat"));
        IO.println(m.get("aaron"));

    }
}
