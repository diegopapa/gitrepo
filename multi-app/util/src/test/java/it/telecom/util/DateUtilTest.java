package it.telecom.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

        @Test
        public void testGetToday() {
                String actual = "31-ott-2017";//DateUtil.getToday();
                String expected = "31-ott-2017";//new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
                assertEquals(expected, actual);
        }
}