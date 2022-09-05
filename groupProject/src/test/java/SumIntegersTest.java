import static org.junit.jupiter.api.Assertions.*;

class SumIntegersTest {
    SumIntegers sumIntegers = new SumIntegers();
    @org.junit.jupiter.api.Test
    void arraySum() {
        int [] tab = {1,2,3};
        assertEquals(6,sumIntegers.arraySum(tab));
    }
}