/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import stock.Methods;

/**
 *
 * @author ONURPC
 */
@RunWith(Parameterized.class)
public class RegexTest {

    private boolean expected;
    private String input;

    public RegexTest(boolean expected, String input) {
        this.expected = expected;
        this.input = input;
    }
    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{true,"19.15"},{true,"23"},{true,"6,15"},{true,"0"},{false,"asda"},{false,"19,"},{false,"23. "},{false,"15 "},{false,"-3"}
        ,{false,"-2.5"},{false,"-8,21"},{false,"19 "}});
    }
    @Test
    public void regexTestClass() {
        assertEquals(expected,Methods.regexControl(input));
    }
}
