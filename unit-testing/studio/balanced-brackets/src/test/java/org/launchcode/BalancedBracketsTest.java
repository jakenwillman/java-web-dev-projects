package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
        @Test
        public void onlyBracketsReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        }

        @Test
        public void insideOutBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        }

        @Test
        public void addNumberOfBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
            assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        }
        @Test
        public void emptyStringReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets(""));
        }

        @Test
        public void stringWithNoBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
        }

        @Test void bracketsOutOfOrderReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]][["));
        }

        @Test
        public void balancedBracketsWithWordsReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        }
        @Test
        public void onlyOpeningBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
        }

        @Test
        public void onlyClosingBracketsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]]]"));
        }

        @Test
        public void usesOnlyCurlyBracesReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
        }

        @Test
        public void ridiculouslyLongStringBalancedBracesReturnsTrue() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[supercalifragilisticexpialidocious]"));
        }
    }





