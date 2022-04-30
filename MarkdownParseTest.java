import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void ParseTest() throws IOException
    {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void ParseTest1() throws IOException
    {
        Path fileName1 = Path.of("test1.md");
        String content1 = Files.readString(fileName1);
        ArrayList<String> links1 = MarkdownParse.getLinks(content1);
        assertEquals(links1, List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void ParseTest2() throws IOException
    {
        Path fileName2 = Path.of("test2.md");
        String content2 = Files.readString(fileName2);
        ArrayList<String> links2 = MarkdownParse.getLinks(content2);
        assertEquals(links2, List.of("https://some", "some-thing.html"));
    }

    @Test
    public void ParseTest3() throws IOException
    {
        Path fileName3 = Path.of("emptytest.md");
        String content3 = Files.readString(fileName3);
        ArrayList<String> links3 = MarkdownParse.getLinks(content3);
        assertEquals(links3, List.of("https://something.com", "some-thing.html"));
    }
}
