package cz.i.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jan.hadas@i.cz
 */
public class MathServiceTest {

  private MathService mathService = new MathService();


  @Test
  public void should_return_true_for_prime_number() {
    assertTrue("2 is prime", mathService.isPrime(2));
    assertTrue("3 is prime", mathService.isPrime(3));
    assertTrue("17 is prime", mathService.isPrime(17));
    assertTrue("104729 is prime", mathService.isPrime(104729));
  }

  @Test
  public void should_return_false_for_non_prime_number() {
    assertFalse("1 is NOT prime", mathService.isPrime(1));
    assertFalse("56 is NOT prime", mathService.isPrime(56));
    assertFalse("143 is NOT prime", mathService.isPrime(143));
    assertFalse("41901 is NOT prime", mathService.isPrime(41901));
  }
}
