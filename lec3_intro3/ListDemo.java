package lec3_intro3;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    void main() {

        List L = new ArrayList();
        // project valhalla will make this possible
        // until valhalla, we must do List<Integer>

        L.add("a");
        L.add("b");
        Object x = L.get(0);
    }
}