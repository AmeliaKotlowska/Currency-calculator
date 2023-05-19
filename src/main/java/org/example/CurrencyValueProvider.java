package org.example;

public interface CurrencyValueProvider {
  double getBuyValue(Currency currency);

  double getSellValue(Currency currency);
}
