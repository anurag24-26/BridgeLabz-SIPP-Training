import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {
    ListManager manager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        manager.removeElement(list, 2);
        assertFalse(list.contains(2));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(2, manager.getSize(list));
    }
}
