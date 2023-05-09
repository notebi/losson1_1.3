import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String result = getClassString();
        Assert.assertEquals("метод getClassString не возвращает строĸу, в ĸоторой есть подстроĸа Hello", true, result.toLowerCase().contains("hello"));
    }
}

