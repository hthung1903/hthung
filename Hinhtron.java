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
public class Hinhtron {
    
        private double bankinh;
        protected static final double PI =3.14;
        public Hinhtron(){
        }
        public Hinhtron(double bankinh){
            this.bankinh=bankinh;
        }
        public void setbankinh(double bankinh){
            this.bankinh=bankinh;
        }
        public double getbankinh(){
            return bankinh;
        }
        
        // tinh dien tich
        public double getdientich(){
            return Math.pow(this.bankinh, 2)*PI;
        }
        public String toString(){
            return "hinh tron co ban kinh: " + this.bankinh;
            
        }
}
        
        
       
            
      
    
        

