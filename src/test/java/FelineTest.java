import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline = new Feline();


    @Test
    public void getFamilyTest()  {
        assertEquals("Кошачьи", feline.getFamily());
        Mockito.verify(feline, times(1)).getFamily();
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
        Mockito.verify(feline, times(1)).getKittens();
    }
}
