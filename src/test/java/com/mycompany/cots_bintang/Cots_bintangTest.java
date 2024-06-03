/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cots_bintang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Cots_bintangTest {

    @Test
    public void testPenambahan() {
        double result = Cots_bintang.performOperation(1, 5, 3);
        assertEquals(8, result, 0.001);
    }

    @Test
    public void testPengurangan() {
        double result = Cots_bintang.performOperation(2, 5, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    public void testPerkalian() {
        double result = Cots_bintang.performOperation(3, 5, 3);
        assertEquals(15, result, 0.001);
    }

    @Test
    public void testPembagian() {
        double result = Cots_bintang.performOperation(4, 6, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    public void testPembagianDenganNol() {
        double result = Cots_bintang.performOperation(4, 6, 0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testPilihanTidakValid() {
        double result = Cots_bintang.performOperation(5, 6, 3);
        assertTrue(Double.isNaN(result));
    }
}