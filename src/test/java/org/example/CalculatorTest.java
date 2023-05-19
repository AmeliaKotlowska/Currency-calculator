package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class CalculatorTest {

  @Test
  void shouldBuyEuro() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getBuyValue(Currency.EUR)).thenReturn(4d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double purchase = calculator.buy(8, Currency.EUR);
    //then
    Assertions.assertEquals(2, purchase);
  }

  @Test
  void shouldSellEuro() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getSellValue(Currency.EUR)).thenReturn(4d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double sale = calculator.sell(8, Currency.EUR);
    //then
    Assertions.assertEquals(32, sale);
  }

  @Test
  void shouldBuyUSD() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getBuyValue(Currency.USD)).thenReturn(2d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double purchase = calculator.buy(10, Currency.USD);
    //then
    Assertions.assertEquals(5, purchase);
  }

  @Test
  void shouldSellUSD() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getSellValue(Currency.USD)).thenReturn(2d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double sale = calculator.sell(10, Currency.USD);
    //then
    Assertions.assertEquals(20, sale);
  }

  @Test
  void shouldBuyGBP() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getBuyValue(Currency.GBP)).thenReturn(5d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double purchase = calculator.buy(20, Currency.GBP);
    //then
    Assertions.assertEquals(4, purchase);
  }

  @Test
  void shouldSellGBP() {
    //given
    CurrencyValueProvider currencyValueProvider = Mockito.mock(CurrencyValueProvider.class);
    when(currencyValueProvider.getSellValue(Currency.GBP)).thenReturn(5d);
    CurrencyCalculator calculator = new CurrencyCalculator(currencyValueProvider);
    //when
    double sale = calculator.sell(20, Currency.GBP);
    //then
    Assertions.assertEquals(100, sale);
  }
}