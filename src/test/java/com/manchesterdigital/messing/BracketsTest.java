package com.manchesterdigital.messing;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BracketsTest {

    //series of brackets. isClosed method returning a boolean if closes correctly
    // Danny do as a stack?


    @Test
    public void singleCurlyBrace() {
        String input = "{}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void twoClosingCurlyBraces() {
        String input = "}}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void closingCurlyBracesWithAdditionalOpenCurleyBrace() {
        String input = "{}}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void validClosingBraceInput() {
        String input = "{{{{{{{{{}}}}}}}}}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void validBracketsForMethods() {
        String input = "{()}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void InvalidBracketsForMethods() {
        String input = "{(){())}}";
        boolean result = Brackets.isClosed(input);
        Assertions.assertThat(result).isEqualTo(false);
    }
}
