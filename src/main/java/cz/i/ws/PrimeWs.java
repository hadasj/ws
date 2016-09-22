package cz.i.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cz.i.WsPort;
import cz.i.service.MathService;

/**
 * @author jan.hadas@i.cz
 */
@WebService(
    portName = "WsPort",
    serviceName = "TestService",
    targetNamespace = "urn:i.cz",
    wsdlLocation = "META-INF/wsdl/Prime.wsdl",
    endpointInterface = "cz.i.WsPort"
)
public class PrimeWs implements WsPort {

  private MathService mathService = new MathService();
  private static final Logger LOG = LoggerFactory.getLogger(PrimeWs.class);

  @Override
  public boolean isPrime(@WebParam(name = "cislo", targetNamespace = "urn:i.cz", partName = "cislo") long number) {
    LOG.info("called WS TestService.isPrime({})", number);

    final boolean prime = mathService.isPrime(number);

    LOG.debug("number {} is " + (prime ? "prime" : "NOT prime"), number);

    return prime;
  }
}
