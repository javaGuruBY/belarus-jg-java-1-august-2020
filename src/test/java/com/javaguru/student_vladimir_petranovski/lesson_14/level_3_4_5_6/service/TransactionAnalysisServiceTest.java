package com.javaguru.student_vladimir_petranovski.lesson_14.level_3_4_5_6.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_3_4_5_6.bean.Trader;
import com.javaguru.student_vladimir_petranovski.lesson_14.level_3_4_5_6.bean.Transaction;
import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TransactionAnalysisServiceTest extends TestCase {

    private TransactionAnalysisService test;
    private List<Transaction> testList = new ArrayList<>();

    private final Trader raoul = new Trader("Raoul", "Cambridge");
    private final Trader mario = new Trader("Mario","Milan");
    private final Trader alan = new Trader("Alan","Cambridge");
    private final Trader brian = new Trader("Brian","Cambridge");

    @Before
    public void setUp() {
        test = new TransactionAnalysisService();
        testList = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

    }


    public void testFindTransactionOnYear2011() {
        assertEquals(2, test.findTransactionOnYear(testList, 2011).size());
    }

    public void testFindTransactionOnYear2012() {
        assertEquals(4, test.findTransactionOnYear(testList, 2012).size());
    }

    public void testFindTransactionByValueSort() {
        List<Transaction> expected = Arrays.asList(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000));
        assertEquals(expected.toString(), test.findTransactionByValueSort(testList).toString());
    }

    public void testFindTransactionByValueSortFromBiggerToLess() {
        List<Transaction> expected = Arrays.asList(new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
        assertEquals(expected.toString(), test.findTransactionByValueSortFromBiggerToLess(testList).toString());
    }

    public void testFindTransactionOnYearAndByValueSortFromBiggerToLess() {

        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
        assertEquals(expected.toString(), test.findTransactionOnYearAndByValueSortFromBiggerToLess(testList).toString());
    }

    public void testFindAllYearTransactions() {
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expected, test.findAllYearTransactions(testList));
    }

    public void testFindAllUniqueYearTransactions() {
        List<Integer> expected = Arrays.asList(2011, 2012);
        assertEquals(expected.toString(), test.findAllUniqueYearTransactions(testList).toString());
    }

    public void testFindAllTradersUniqueNameTransactions() {
        List<String> expected = Arrays.asList("Brian", "Raoul", "Mario", "Alan");
        assertEquals(expected, test.findAllTradersUniqueNameTransactions(testList));
    }

    public void testFindAllUniqueCityToTradersFromTransactions() {
        List<String> expected = Arrays.asList("Cambridge", "Milan");
        assertEquals(expected, test.findAllUniqueCityToTradersFromTransactions(testList));
    }

    public void testFindAllTradersByNameFromCityToCambridge() {
        List<String> expected = Arrays.asList("Brian", "Raoul", "Alan");
        assertEquals(expected, test.findAllTradersByNameFromCityToCambridge(testList));
    }

    public void testFindAllTradersByNameFromCityToCityMilan() {
        List<String> expected = Arrays.asList("Mario");
        assertEquals(expected, test.findAllTradersByNameFromCityToCity(testList, "Milan"));
    }

    public void testIsCityHasTraderTrue() {
        assertTrue(test.isCityHasTrader(testList, "Milan"));
    }

    public void testIsCityHasTraderFalse() {
        List<Transaction> testFalse = Arrays.asList(
                new Transaction(raoul, 2020, 110),
                new Transaction(alan, 2019, 130)
        );
        assertFalse(test.isCityHasTrader(testFalse, "Milan"));
    }

    public void testIsCityHasTraderTrueTwo() {
        assertTrue(test.isCityHasTrader(testList, "Cambridge"));
    }

    public void testFindMaxValue() {
        assertEquals(Optional.of(1000), test.findMaxValue(testList));
    }

    public void testFindMinValue() {
        assertEquals(Optional.of(300), test.findMinValue(testList));
    }

    public void testPutNamesSeparatedByCommas() {
        assertEquals("Alan, Brian, Mario, Raoul", test.putNamesSeparatedByCommas(testList));
    }

    public void testPutStringFromUniqueNamesCitySeparatedByCommas() {
        assertEquals("Cambridge, Milan", test.putStringFromUniqueNamesCitySeparatedByCommas(testList));
    }
}