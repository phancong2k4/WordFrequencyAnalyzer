import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAnalyzerPathTest {

    WordAnalyzer analyzer = new WordAnalyzer();

    @Test
    public void testPath1_NullParameters() {
        assertEquals(0, analyzer.countTargetWord(null, "test"));
    }

    @Test
    public void testPath2_EmptyArray() {
        assertEquals(0, analyzer.countTargetWord(new String[]{}, "test"));
    }

    @Test
    public void testPath3_NoMatchFound() {
        assertEquals(0, analyzer.countTargetWord(new String[]{"apple"}, "orange"));
    }

    @Test
    public void testPath4_MatchFound() {
        assertEquals(1, analyzer.countTargetWord(new String[]{"orange"}, "orange"));
    }

    @Test
    public void testPath5_ArrayContainsNull() {
        assertEquals(1, analyzer.countTargetWord(new String[]{"java", null, "JAVA"}, "java"));
    }
}