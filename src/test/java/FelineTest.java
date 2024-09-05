import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void getKittensTest()  {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFamilyTest()  {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
    }

    @Test
    public void getKittensWithIntegerTest()  {
        feline.getKittens(5);
        Mockito.verify(feline, Mockito.times(1)).getKittens(5);
    }
}
