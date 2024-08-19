import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.redis.RedisClientApplication;
import com.api.redis.model.UserDTO;
import com.api.redis.service.RedisService;

@SpringBootTest(classes = RedisClientApplication.class)
public class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void testSetKey() {
        UserDTO user = new UserDTO("user1", "male", "1990");
        redisService.setKey(user);
    }

    @Test
    public void testHasKey() {
        String userId = "user1";
        boolean result = redisService.hasKey(userId);
    }

    @Test
    public void testGetKey() {
        String userId = "user1";
        UserDTO userDTO = redisService.getKey(userId);
    }
}