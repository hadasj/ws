package cz.i.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jan.hadas@i.cz
 */
public class MathService {
  private static final Logger LOG = LoggerFactory.getLogger(MathService.class);

  public boolean isPrime(final long number) {
    //TODO: improve stupid implementation

    if (number < 2) {
      // first prime is 2
      LOG.debug("number {} is too small - NOT prime", number);
      return false;
    }

    for (int divider = 2; divider < number; divider++) {
      // X modulo divider is 0 (NO divide remainder) -> X is divisible by divider
      if (number % divider == 0) {
        LOG.debug("number {} is divisible by {}, NOT prime", number, divider);
        return false;
      }
    }

    LOG.debug("number {} is probably prime", number);
    return true;
  }

}
