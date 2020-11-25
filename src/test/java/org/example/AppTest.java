package org.example;

//import static org.junit.Assert.assertTrue;
//import calculer ;
//import

import calculer.Calculator;
import org.junit.Test;

import javax.swing.*;

import static calculer.Calculator.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        Calculator.min(1,2);
    }*/
    @Test
    public  void TestSum() {
        Calculator calculator = new Calculator();
        calculator.sum(2,2);
    }
    @Test
    public  void  Testminus() {
        Calculator calculator = new Calculator();
        calculator.minus(2,2);
    }
    @Test
    public  void Testdivide() {
        Calculator calculator = new Calculator();
        calculator.divide(2,2);
    }
    @Test
    public void Testmultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(2,2);
    }
    @Test
    public void TestMin() {
        Calculator calculator = new Calculator();
        calculator.min(2,3);
        System.out.println(calculator.min(5,4));
    }
    @Test
    public void TestMax() {
        Calculator calculator = new Calculator();
        calculator.max(2,3);
        System.out.println(calculator.max(5,4));
    }
    @Test
    public  void TestMaxElement() {
        Calculator calculator = new Calculator();
        int Tab[] = { 4,10,9,30,20,41,50};
        calculator.maxElement(Tab);
        System.out.println(calculator.maxElement(Tab));
    }
    @Test
    public  void TestMinElement() {
        Calculator calculator = new Calculator();
        int Tab[] = { 9,10,3,7,1,2,12,16};
        calculator.minElement(Tab);
        System.out.println(calculator.minElement(Tab));
    }


}
