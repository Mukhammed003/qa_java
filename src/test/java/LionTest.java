
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Predator mockPredator;

    Feline feline = new Feline();

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(false, lion.doesHaveMane());
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
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens(feline));
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец");
        assertEquals(expectedFood, lion.getFood(feline));
    }
}
