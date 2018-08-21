/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsjunit;

/**
 *
 * @author rod_v
 */
import java.util.Random;
public class Aleatorio {

    public int gerarNumeroAleatorio (int inicio, int fim) {
        if (inicio < 0 || fim < 0) {
        return -1;
        }
        if (inicio >= fim) {
        return -1;
        }
        int diff = fim - inicio + 1;
        Random random = new Random();
        int tInt = random.nextInt(diff);
        return inicio + tInt;
    }
}