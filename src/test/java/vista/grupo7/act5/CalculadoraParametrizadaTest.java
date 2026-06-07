package vista.grupo7.act5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fede-
 */
public class CalculadoraParametrizadaTest {
    private final Calculador cal = new Calculador();
    
    @ParameterizedTest(name = "Escenario {index}: Sumar {0} + {1} deberia ser {2}")
    @CsvSource({
            
            "8, 7, 15",
            "2, 0, 2",
            "10, -1, 9"
              })
            public void testSumarParametrizada(double numero1, double numero2, double resultadoEsperado){
            
            double resultadoObtenido = cal.sumar(numero1, numero2);
            
            Assertions.assertEquals(resultadoEsperado, resultadoObtenido, 0.001,
                    () -> "La suma de" + numero1 + "y" +numero2+ "Fallo.");
            
            }
    }
