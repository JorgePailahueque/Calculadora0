/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcalculadoraventana;

/**
 *
 * @author diego
 */
public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora() {
     this.num1=0;
     this.num2=0;
        
            
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    public double sumar(String x,String y){
        this.num1=Double.parseDouble(x);
        this.num2=Double.parseDouble(y);
        return num1+num2;
    }
     
    public double restar(String x, String y){
        this.num1=Double.parseDouble(x);
        this.num2=Double.parseDouble(y);
        return num1-num2;
    }
    
     public double dividir(String x, String y){
        this.num1=Double.parseDouble(x);
        this.num2=Double.parseDouble(y);
        return num1/num2;
    }
     
    public double multiplicar(String x, String y){
        this.num1=Double.parseDouble(x);
        this.num2=Double.parseDouble(y);
        return num1*num2;
    }
     public double sumar(){
        return num1+num2;
    }
     
    public double restar(){
        return num1-num2;
    }
    
     public double dividir(){
        return num1/num2;
    }
     
    public double multiplicar(){
        return num1*num2;
    }
    public double resultado(String x){
        if (x.equals("+")) {
            return sumar();
        }else{
            if (x.equals("-")) {
                return restar();
            }else{
                if (x.equals("/")) {
                    return dividir();
                }else{
                    
                        return multiplicar();
                   
                }
            }
           
        }
    }
}
