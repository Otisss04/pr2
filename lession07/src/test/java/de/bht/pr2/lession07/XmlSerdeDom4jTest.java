package de.bht.pr2.lession07;

import de.bht.pr2.lession07.serde.CarSerde;
import de.bht.pr2.lession07.serde.impl.XmlSerdeDom4j;
import java.io.File;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XmlSerdeDom4jTest {


  @Test
  public void shouldSerialize() {
    final String dir = "src/test/resources";
    final boolean mkdirs = new File(dir).mkdirs();

    CarSerde xmlSerde = new XmlSerdeDom4j();

    final List<Car> cars = CarUtil.createCars();
    xmlSerde.serialize(cars, dir + "/autos-dom4j.xml");

    final List<Car> deserialize = xmlSerde.deserialize(dir + "/autos-dom4j.xml");

    Assertions.assertEquals(cars, deserialize);
  }

}
