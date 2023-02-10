package kuromi.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import kuromi.KuromiException;

public class TaskListTest {
    @Test
    public void taskAdd() throws KuromiException {
        Deadline d = new Deadline("return book", "2019-10-15");
        ArrayList<Task> inp = new ArrayList<Task>();
        inp.add(new Todo("borrow book"));
        TaskList tasks = new TaskList(inp);
        tasks.add(d);
        Task cur = tasks.get(1);
        assertEquals(cur, d);
    }
    @Test
    public void taskDel() throws KuromiException {
        Deadline d = new Deadline("return book", "2019-10-15");
        ArrayList<Task> inp = new ArrayList<Task>();
        inp.add(new Todo("borrow book"));
        TaskList tasks = new TaskList(inp);
        tasks.add(d);
        tasks.delete(1);
        assertEquals(1, tasks.size());
    }
}
