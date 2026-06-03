
package calculadoratesting;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadorTest {
    
    Calculador calculadorTester;
    
 // @Before
    public void setUp(){
      calculadorTester = new Calculador();
    }
    
  @Test
  public void testSumar() {
        System.out.println("Probando el metodo: Sumar");
        
        double a = 5.5;
        double b = 4.5;
        double esperado = 10.0;
          
        double resultadoReal = calculadorTester.sumar(a, b);
        
        assertEquals(esperado, resultadoReal, 0.001); 
    }
  @Test
    public void testRestar() {
        System.out.println("Probando el metodo: Restar");
        
        Calculador calcTester = new Calculador();
        
        double a = 10.0;
        double b = 3.5;
        double esperado = 6.5;
        
        double resultadoReal = calcTester.restar(a, b);
        
        assertEquals(esperado, resultadoReal, 0.001);
    }
}