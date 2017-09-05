/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author asus
 */
public class Turunan extends Induk{
    //melakukan overload terhadap method test(), bukan override.
    public void test(String s){
        System.out.println("Method di dalam kelas Turunan");
        System.out.println("s : \"" + s + "\"");
    }
}
