package exercises;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestLinkedList {
    @Test
    public void testGetOnEmptyList() {
        boolean success = false;
        LinkedList list = new LinkedList();
        try {
            list.get(0);
            fail("should have thrown an exception");
        } catch(IndexOutOfBoundsException e) {
            success = true;
        }

        assertEquals(true, success);
    }

    @Test
    public void testSizeOnEmptyList() {
        LinkedList list = new LinkedList();
        int size = list.size();

        assertEquals(0, size);
    }

    @Test
    public void testSizeOnOneLengthList() {
        LinkedList list = new LinkedList();
        list.add(5);
        int listSize = list.size();

        assertEquals(1, listSize);
    }

    @Test
    public void testSizeOnTwoLengthList() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        int listSize = list.size();

        assertEquals(2, listSize);
    }

    @Test
    public void testSizeOnTenLengthList() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(34234);
        list.add(1);
        list.add(23489);
        list.add(2384);
        list.add(23);
        list.add(909);
        list.add(293234);
        list.add(1);
        int listSize = list.size();

        assertEquals(10, listSize);
    }

}
