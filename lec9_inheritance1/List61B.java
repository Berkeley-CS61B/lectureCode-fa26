package lec9_inheritance1;

/** An interface is like a class, but it's more abstract. */
public interface List61B<Glatch> {
    // constructors have no interface
    // they are abstract and you can't instantiate them directly
    public void insert(Glatch item, int position);
    public void addFirst(Glatch x);
    public void addLast(Glatch x);
    public Glatch getFirst();
    public Glatch getLast();
    public Glatch get(int i);
    public int size();
    public Glatch removeLast();

    // how to do it by default
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            IO.print(get(i) + ", ");
        }
        IO.println();
    }

}
