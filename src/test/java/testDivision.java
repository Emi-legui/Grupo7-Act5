/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vista.grupo7.act5.Calculador;

/**
 *
 * @author FRANCO
 */
public class testDivision {
   
    private static Calculador calculadorTester;
    
    
    //BeforeClass es BeforeAll en JUnit 5
  @BeforeAll
    public static void setUpClass() throws Exception{
        calculadorTester = new Calculador();
         System.out.println("Bienvenido a las Pruebas del Calculador!");
        
    }
    
    //BeforeEach es Before en JUnit 5
    @BeforeEach
    public void setUp(){
        System.out.println("Ejecutando test: " + Thread.currentThread().getStackTrace()[1].getMethodName());
     
    }
    
    //AfterEach es After en JUnit 5
    @AfterEach
    public void tearDown(){
        System.out.println("Prueba finalizada, campos en 0");
    }
    
    //AfterAll es AfterClass en JUnit 5
    @AfterAll 
    public static void tearDownClass() throws Exception{
        System.out.println("La prueba ha finalizado ");
    }
    
    @Test
    //@Test(expected = ArithmeticException.class). En JUnit 5 se usa assertThrows()
     public void testDivisionCero(){
         assertThrows(ArithmeticException.class, () -> {
             calculadorTester.dividir(20,0);
         });
     }
}