/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import questionsjunit.Aleatorio;

/**
 *
 * @author rod_v
 */
public class AleatorioTest {
     @Test
     // start number is less then zero
     public void gerarNumeroAleatorio_Test_01() {
        Aleatorio aleatorio = new Aleatorio();
        assertEquals(-1, aleatorio.gerarNumeroAleatorio(-1,5));
    }
     @Test
     // end number is less then zero
     public void gerarNumeroAleatorio_Test_02() {
        Aleatorio aleatorio = new Aleatorio();
        assertEquals(-1, aleatorio.gerarNumeroAleatorio(3, -1));
     }
     @Test
     // start and end numbers are less then zero
     public void gerarNumeroAleatorio_Test_03() {
         
     }
}
