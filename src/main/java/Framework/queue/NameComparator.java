package Framework.queue;
import java.util.*;


public class NameComparator implements Comparator<Object> {
    public int compare( Object a, Object b) {
        return ((String)a).compareTo((String) b);
    }
 } 