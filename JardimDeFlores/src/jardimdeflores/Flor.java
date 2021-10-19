/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardimdeflores;

/**
 *
 * @author win7
 */
public class Flor {
    Petala petala1;
    Petala petala2;
    
    //metodos para a petala 1
    public void setPetala1(Petala pet){
        petala1=pet;
    }
    
    public Petala getPetala1(){
        return petala1; //p1 da margarida 
    }
    
    public boolean temPetala1(){
        return petala1!=null;
    }
    
    //metodos para a petala 2
    public void setPetala2(Petala pet){
        petala2=pet;
    }
    
    public Petala getPetala2(){
        return petala2;
    }
    
    public boolean temPetala2(){
        return petala2!=null;
    }
}
