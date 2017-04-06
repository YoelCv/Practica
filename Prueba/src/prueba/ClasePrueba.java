/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Yoel
 */
public class ClasePrueba {
    public ClasePrueba(){}
    
    public String ClasePrueba(int n){
        String r=String.valueOf(n);    
       
        if (n%3==0 | r.contains("3") & n%5==0 r.contains("5")){
		r= "fizz buzz";
	}	
	else if (n%3==0 | r.contains("3")){
            r= "fizz";  
        }
        
        return r;
    }
    
}
