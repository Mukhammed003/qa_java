import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Lion lion;

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        lion.getKittens(feline);
        Mockito.verify(lion, Mockito.times(1)).getKittens(feline);
    }

    @Test
    public void doesHaveManeTest() {
        lion.doesHaveMane();
        Mockito.verify(lion, Mockito.times(1)).doesHaveMane();
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        lion.getFood(feline);
        Mockito.verify(lion, Mockito.times(1)).getFood(feline);
    }
}
