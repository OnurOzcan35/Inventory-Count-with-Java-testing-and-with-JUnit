/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import stock.Methods;

/**
 *
 * @author ONURPC
 */
@RunWith(Parameterized.class)
public class RegexStringTest {

    private boolean expected;
    private String input;

    public RegexStringTest(boolean expected, String input) {
        this.expected = expected;
        this.input = input;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{true,"Apple"},{true,"n11"},{false,""},{false," "}});
    }
    @Test
    public void regexTestClass() {
        assertEquals(expected,Methods.regexStringControl(input));
    }
}
