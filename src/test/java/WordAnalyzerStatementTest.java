import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAnalyzerStatementTest {

    WordAnalyzer analyzer = new WordAnalyzer();

    @Test
    public void testNullInput() {
        assertEquals(0, analyzer.countTargetWord(null, "java"));
    }

    @Test
    public void testNullTarget() {
        assertEquals(0, analyzer.countTargetWord(new String[]{"java"}, null));
    }

    @Test
    public void testCountWords() {
        String[] words = {"java", "Python", "JAVA"};
        assertEquals(2, analyzer.countTargetWord(words, "java"));
    }
}