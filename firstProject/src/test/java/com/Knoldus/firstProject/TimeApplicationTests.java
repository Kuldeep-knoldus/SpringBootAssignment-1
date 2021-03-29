package com.Knoldus.firstProject;

import com.Knoldus.firstProject.controllers.TimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class TimeApplicationTests {

    @Test
    void checkCurrentTime() {
        TimeController timeController = new TimeController();
        String actual = timeController.status();

        Format format = new SimpleDateFormat("HH.mm.ss");
        String expected = "Running, " + format.format(new Date());

        Assertions.assertEquals(expected, actual);
    }

}
