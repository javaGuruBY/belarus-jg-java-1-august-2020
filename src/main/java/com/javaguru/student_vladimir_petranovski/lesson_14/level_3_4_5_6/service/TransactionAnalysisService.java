package com.javaguru.student_vladimir_petranovski.lesson_14.level_3_4_5_6.service;

import com.javaguru.student_vladimir_petranovski.lesson_14.level_3_4_5_6.bean.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionOnYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter((Transaction transaction) -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionByValueSort(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionByValueSortFromBiggerToLess(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionOnYearAndByValueSortFromBiggerToLess(List<Transaction> transactions) {
        return transactions.stream()
                .filter(s -> s.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Integer> findAllYearTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getYear())
                .collect(Collectors.toList());
    }

    public Set<Integer> findAllUniqueYearTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getYear())
  //              .distinct()
  //              .collect(Collectors.toList()); //возвращаем List в шапке
                  .collect(Collectors.toSet());
    }

    public List<String> findAllTradersUniqueNameTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getTrader().getName())
                .distinct()
//                .sorted() //это если захочешь по алфавиту
                .collect(Collectors.toList());
    }

    public List<String> findAllUniqueCityToTradersFromTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findAllTradersByNameFromCityToCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .filter(s -> s.getTrader().getCity().equals("Cambridge"))
                .map(s -> s.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findAllTradersByNameFromCityToCity(List<Transaction> transactions, String cityName) {
        return transactions.stream()
                .filter(s -> s.getTrader().getCity().equals(cityName))
                .map(s -> s.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean isCityHasTrader(List<Transaction> transactions, String cityName) {
//        return findAllTradersByNameFromCityToCity(transactions, cityName).size() != 0;
        return transactions.stream()
                .anyMatch(s -> s.getTrader().getCity().equals(cityName));
    }

    public Optional<Integer> findMaxValue(List<Transaction> transactions) {
        return Optional.of(transactions.stream()
                .mapToInt(s -> s.getValue())
                .max().orElseThrow(NoSuchFieldError::new));
    }

    public Optional<Integer> findMinValue(List<Transaction> transactions) {
        return Optional.of(transactions.stream()
        .mapToInt(s -> s.getValue())
        .min().orElseThrow(NoSuchFieldError::new));
    }

    public String putNamesSeparatedByCommas(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public String putStringFromUniqueNamesCitySeparatedByCommas(List<Transaction> transactions) {
        return transactions.stream()
                .map(s -> s.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }


}
