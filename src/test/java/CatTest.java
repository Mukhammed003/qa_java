
import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Cat cat;

    @Test
    public void getSoundTest() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(cat, Mockito.times(1)).getFood();
    }
}
