/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author pogliani.mattia
 */
public class Processo extends Thread {

    private String s;

    public Processo(String s) {
        this.s = s;
        
    }

    public void run() {
        for (;;) {
            System.out.println(s);
        }
    }
}
