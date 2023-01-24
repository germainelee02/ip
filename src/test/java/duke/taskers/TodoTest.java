package duke.taskers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {

    @Test
    public void testStringPrint1() {
        Todo t = new Todo("complete tutorial", false);
        assertEquals("[T][ ]complete tutorial", t.toString());
    }

    @Test
    public void testStringPrint2() {
        Todo t = new Todo("do something", true);
        assertEquals("[T][X]do something", t.toString());
    }

    @Test
    public void testStatusTrueString() {
        Todo t = new Todo("eat mooncakes", true);
        assertEquals("TODO / 1 / eat mooncakes", t.statusStringForFile());
    }

    @Test
    public void testStatusFalseString() {
        Todo t = new Todo("run a marathon", false);
        assertEquals("TODO / 0 / run a marathon", t.statusStringForFile());
    }
}