/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Acer
 */

public class Hinhtru extends Hinhtron{
    private double chieucao;
        public Hinhtru(){
            
        }
        
        public Hinhtru(double chieucao){
            this.chieucao=chieucao;
        }

   
        public void setchieucao(double chieucao){
            this.chieucao=chieucao;
        }
        public double getchieucao(){
            return chieucao;
        }
        // tinh the tich
        public double getthetich(){
            double v = 0;
            v= v+ getdientich()*chieucao;
            return v;   
        }
        
        
            public String toString(){
            String k = "";
            k = k + "hinh tru: co chieu cao: " +this.chieucao;
            return k;
        }
}
