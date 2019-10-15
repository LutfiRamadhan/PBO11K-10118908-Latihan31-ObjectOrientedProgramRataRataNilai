/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan37;

/**
 *
 * @author lutfi
 */
class OlahNilai {
    public double HitungRataRata(int[] value){
        double avg = 0;
        for (int i = 0; i < value.length; i++) {
            avg += value[i];
        }
        return avg/value.length;
    }
}
