package demo.hao.dk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class LogstashStarterApplication {
    private static final Logger logger= LoggerFactory.getLogger(LogstashStarterApplication.class);

    @GetMapping("/log")
    public String randomLog() {
        int i = nextRandomInt(1, 10);
        // 50% chance of error
        if (i > 5) {
            logger.error("Random error.", new RuntimeException("Mock an exception, ignore please"));
        }
        else {
            logger.info("Get random " + i);
        }

        return i + "";
    }

    private int nextRandomInt(int min, int max)
    {
        return new Random().nextInt(max + min) + min;
    }

    public static void main(String[] args) {
        SpringApplication.run(LogstashStarterApplication.class, args);
    }

}
