package DZ;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MTest {
    @Test
    public void testcountmatches() {
        String s1 = "ASANOFLD";  //если вторая строка входит в первую 1 раз
        String s2 = "ASA";
        int expected = 1;
        int actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);

        s1 = "ASANOFLD"; //если вторая строка не входит в первую
        s2 = "PLO";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);

        s1 = "ASANOASAASA"; //если вторая строка входит в первую больше одного раза
        s2 = "ASA";
        expected = 3;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);

        //если одна из переменных пуста или обе пусты
        s1 = "";
        s2 = "ASA";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);

        s1 = "ASANOASA"; //
        s2 = "";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);

        s1 = ""; //
        s2 = "";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
        System.out.println("Expected = " + expected + " Actual = " +actual);
    }
}