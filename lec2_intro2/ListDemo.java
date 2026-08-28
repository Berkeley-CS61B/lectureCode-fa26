package lec2_intro2;
// by using import, we can use the shorter name
// but importing isn't necessary to use a list
// you could jsut java.util.List;
// UNLIKE PYTHON where importing actually makes something available
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    void main() {
        List L = new ArrayList();
        L.add(0);
        L.add(1);
        L.add(2);
        IO.println(L);
    }
}
