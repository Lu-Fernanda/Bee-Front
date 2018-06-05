/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericDao;

import java.util.Stack;
import java.util.UUID;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author root
 */
public class MetodosAleatorios {
   
    public String generateString() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return "uuid = " + uuid;
    }
    
  
  public int NumerosAleatorios(){
    int monto=(int) (Math.floor(Math.random()*400)+100);
    return monto;
  }
 
  
//    public static void main(String[] args) {
//        System.out.println(generateString());
//        System.out.println(NumerosAleatorios());
//    }
}

