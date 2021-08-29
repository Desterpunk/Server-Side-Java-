package introduccionjava;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListasEnlazadas {
    public static void main(String[] args) {
        LinkedList<java.io.Serializable> linkedList = new LinkedList<>();
        linkedList.add("Palabra");
        linkedList.add(5);
        linkedList.add(17);
        linkedList.add("palabra 2");
        linkedList.remove(0);

        Logger logger1 = Logger.getLogger("1");
        Logger logger2 = Logger.getLogger("2");
        logger1.log(Level.INFO, "linkedList.size() = {0}" ,linkedList.size());
        logger2.log(Level.INFO, "linkedList.size() = {0}" ,linkedList.get(0));
    }
}
