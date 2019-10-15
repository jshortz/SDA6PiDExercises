package exercises;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestLinkedList {
    @Test
    public void testGetOnEmptyList() {
        boolean success;
        LinkedList list = new LinkedList();
        try{
            list.get(0);
            fail("should have thrown an exception");
        } catch(IndexOutOfBoundsException e) {
            success = true;
        }
    }
}
