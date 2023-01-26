import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;

public class FileTester {
    @Test
    public void testGetFiles() {
        File s = new File("./lib/ArrayTests.java");
        FileExample files = new FileExample();
        try {
            FileExample.getFiles(s);
        }
        catch (IOException IOE) {
            System.out.println("U got an error");
        }
        //assertEquals(".\\lib\\ArrayTests.java", files);



    }
    
}
