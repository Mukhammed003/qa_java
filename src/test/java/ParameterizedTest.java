
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final String sexOfAnimal;
    private final boolean isMale;

    public ParameterizedTest(String sexOfAnimal, boolean isMale) {
        this.sexOfAnimal = sexOfAnimal;
        this.isMale = isMale;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sexOfAnimal);
        Lion lionSpy  = spy(lion);
        assertEquals(isMale, lionSpy.doesHaveMane());
        Mockito.verify(lionSpy, times(1)).doesHaveMane();
    }
}
