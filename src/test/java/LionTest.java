
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sexOfAnimal;
    private final boolean isMale;

    public LionTest(String sexOfAnimal, boolean isMale) {
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
    }


    @Test
    public void doesHaveManeUnknownTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неизвестный");
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sexOfAnimal);
        Lion lionSpy  = spy(lion);
        assertEquals(1, lionSpy.getKittens(feline));
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Lion lion = new Lion(sexOfAnimal);
        Lion lionSpy  = spy(lion);
        assertEquals(expectedFood, lionSpy.getFood(feline));
    }
}
