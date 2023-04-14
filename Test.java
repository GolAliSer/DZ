package DZ;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @Test
    public void testcountmatches() {
        String s1 = "ASANOFLD";  //если вторая строка входит в первую 1 раз
        String s2 = "ASA";
        int expected = 1;
        int actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);

        s1 = "ASANOFLD"; //если вторая строка не входит в первую
        s2 = "PLO";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);

        s1 = "ASANOASAASA"; //если вторая строка входит в первую больше одного раза
        s2 = "ASA";
        expected = 3;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);

        //если одна из переменных пуста или обе пусты
        s1 = "";
        s2 = "ASA";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);

        s1 = "ASANOASA"; //
        s2 = "";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);

        s1 = ""; //
        s2 = "";
        expected = 0;
        actual = Match.countmatches(s1, s2);
        Assertions.assertEquals(expected, actual);
    }
}