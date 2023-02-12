package kuromi.command;

import javafx.stage.Stage;
import kuromi.exception.KuromiException;
import kuromi.storage.Storage;
import kuromi.task.Deadline;
import kuromi.task.Task;
import kuromi.task.TaskList;
import kuromi.view.Ui;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCommandTest {
    @Test
    public void listEmpty() throws KuromiException {
        Command cur = new ListCommand();
        String res = cur.execute(new TaskList(new ArrayList<Task>()), new Ui(), new Storage(Path.of("dummy.txt")));
        assertEquals("You don't have any task :(", res);
    }
}