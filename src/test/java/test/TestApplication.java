package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

@SpringBootTest
public class TestApplication {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void test() throws Exception{
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap("SELECT 1 FROM DUAL");
        System.out.println(objectMapper.writeValueAsString(stringObjectMap));
    }

}
