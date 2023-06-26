/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhco.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.minhco.mathutil.core.MathUtility;
import static org.minhco.mathutil.core.MathUtility.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvancedTest {
   //ham chuan bi bo data test de sau do fill vao ham
   //assertE() o duoi
    
   public static Object [][] initTestData(){
       Object testData[][] ={{0, 1}, 
                             {1, 1}, 
                             {2, 2}, 
                             {4, 24}, 
                             {6, 7200}};
       
       return testData;
   }
   
   @ParameterizedTest
   @MethodSource ("initTestData")
   public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
       
       assertEquals(expected,getFactorial(n));
   }
   
       @Test //(expected= IllegalArgumentExceptipn.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
//           Executable gF = new Executable() {
//               @Override
//               public void execute() throws Throwable {
//                   MathUtility.getFactorial(-5);
//               }
//           };

        Executable gF = () -> MathUtility.getFactorial(-5);
        
     
           assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5)); //hàm thuộc inerface Executal, lambda cho nhanh
}


}
