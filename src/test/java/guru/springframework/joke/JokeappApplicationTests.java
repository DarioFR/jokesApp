package guru.springframework.joke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplicationTests {

    @Test
    public void contextLoads() {
    }

}
