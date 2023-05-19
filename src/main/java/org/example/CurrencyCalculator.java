package org.example;

public class CurrencyCalculator {

  private final CurrencyValueProvider currencyValueProvider;

  public CurrencyCalculator(CurrencyValueProvider currencyValueProvider) {
    this.currencyValueProvider = currencyValueProvider;
  }

  public double buy(double pln, Currency currency) {
    return pln / currencyValueProvider.getBuyValue(currency);
  }

  public double sell(double budget, Currency currency) {
    return budget * currencyValueProvider.getSellValue(currency);
  }
}
