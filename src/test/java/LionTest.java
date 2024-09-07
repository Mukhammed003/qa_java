import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Predator predator;

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
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens(feline));
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец");
        assertEquals(expectedFood, lion.getFood(feline));
    }
}
