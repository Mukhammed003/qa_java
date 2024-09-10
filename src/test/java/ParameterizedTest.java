
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;


@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final String sexOfAnimal;
    private final boolean isMale;
    private Feline feline;

    public ParameterizedTest(String sexOfAnimal, boolean isMale, Feline feline) {
        this.sexOfAnimal = sexOfAnimal;
        this.isMale = isMale;
        this.feline = feline;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true, null},
                {"Самка", false, null}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sexOfAnimal, feline);
        Lion lionSpy  = spy(lion);
        assertEquals(isMale, lionSpy.doesHaveMane());
    }
}
