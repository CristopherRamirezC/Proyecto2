/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protecto_banco_cinco5;

/**
 *
 * @author 50686
 */
public class ColaArray {
   
 private static final int MAXTAM = 3;
 private int frente;
 private int ultimo;
 private int []cola;
 public ColaArray(){
  frente = 0;
  ultimo = -1;
  cola = new int [MAXTAM];
 }
 public void insertarQ(int elemento)throws Exception{
  if (!ColaLlena())
   cola[++ultimo]= elemento;
  else
   throw new Exception ("Error en la cola: Cola LLena");
  
 }
 
 public int eliminarQ() throws Exception{
  if (!ColaVacia())
   return cola[frente++];
  else
   throw new Exception ("Cola vacia");
 }
 
 public void BorrarQ(){
  frente = 0;
  ultimo = -1;
 }
 
 public int frenteQ()throws Exception{
  if (!ColaVacia())
   return cola[frente];
  else
   throw new Exception ("Cola vacia");
 }
 
 public boolean ColaVacia(){
  return frente > ultimo;
 }
 
 public boolean ColaLlena(){
  return ultimo == MAXTAM - 1;
 }
 
 
}