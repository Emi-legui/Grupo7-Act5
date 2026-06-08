
package vista.grupo7.act5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculadorTest.class,
    CalculadoraParametrizadaTest.class,
    testDivision.class
})
public class MiSweetSuite {
    
}
