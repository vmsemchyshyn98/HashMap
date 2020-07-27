import com.company.OpenHashMap;
import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
    private OpenHashMap openHashMap = new OpenHashMap(10);

    @Test
    public void shouldAddElementToHashMap() {
    openHashMap.put(2,55);

    long actualValue = openHashMap.get(2);
    long expectedValue = 55;

        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldGetElementByKey() {
        openHashMap.put(2,5);
        openHashMap.put(1,33);
        openHashMap.put(3,11);

        long actualValue = openHashMap.get(2);
        long expectedValue = 5;

        long actualValue2 = openHashMap.get(1);
        long expectedValue2 = 33;

        long actualValue3 = openHashMap.get(3);
        long expectedValue3 = 11;

        Assert.assertEquals(expectedValue,actualValue);
        Assert.assertEquals(expectedValue2,actualValue2);
        Assert.assertEquals(expectedValue3,actualValue3);
    }

    @Test
    public void shouldGetHashMapSize() {
        openHashMap.put(2,5);
        openHashMap.put(1,33);
        openHashMap.put(3,11);
        openHashMap.put(1,33);
        openHashMap.put(33,33);

        int actualSize = openHashMap.getSize();
        int expectedSize = 3;

        Assert.assertEquals(expectedSize,actualSize);
    }
}
