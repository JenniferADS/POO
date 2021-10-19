
package jardimdeflores;

// EXERCICIO) 1 Pracinha, 2 Jardins, 4 Flores, 8 Pétalas

public class Principal {
    public static void main(String[] args) {
        
    // ------- COR DE PETALAS -----------
        Petala p1 = new Petala();
        p1.setCorPetala("Amarelo");
        
        Petala p2 = new Petala();
        p2.setCorPetala("Azul");
        
        Petala p3 = new Petala();
        p3.setCorPetala("Branco");
        
        Petala p4 = new Petala();
        p4.setCorPetala("Laranja");
        
        Petala p5 = new Petala();
        p5.setCorPetala("Rosa");
        
        Petala p6 = new Petala();
        p6.setCorPetala("Roxo");
        
        Petala p7 = new Petala();
        p7.setCorPetala("Vermelho");
        
        Petala p8 = new Petala();
        p8.setCorPetala("Vinho");
        
    //------------ FLORES -------------------------
        Flor margarida = new Flor();
        margarida.setPetala1(p1); //colocando a petala p1 na flor margarida
        margarida.setPetala2(p2); //colocando a petala p2 na flor margarida
        
        Flor girassol = new Flor(); 
        girassol.setPetala1(p3); //colocando a petala p3 na flor girassol
        girassol.setPetala2(p4); //colocando a petala p4 na flor girassol
        
        Flor orquidea = new Flor();
        orquidea.setPetala1(p5);
        orquidea.setPetala2(p6);
        
        Flor rosa = new Flor();
        rosa.setPetala1(p7);
        rosa.setPetala2(p8);
 
    //------- JARDINS -------------------- 
        JardimDeFlores j1 = new JardimDeFlores();
        j1.setFlor1(margarida);
        j1.setFlor2(girassol);
                
        JardimDeFlores j2 = new JardimDeFlores();
        j2.setFlor1(orquidea);
        j2.setFlor2(rosa);
        
    //--------- PRAÇA -----------------------------                                            
        Pracinha praca = new Pracinha();    
        praca.setJardim1(j1);
        praca.setJardim2(j2);
        
    //para retornar a COR de uma Petala de uma determina Flor a partir do Jardim precisamos: 
        // 1- pegar um jardim da pracinha;
        // 2- uma flor desse jardim;
        // 3- a petala dessa flor; 
        // 4- a cor dessa petala.
        
    //--- caminho inverso
        System.out.println("Cor da Pétala 1: "+ p1.getCorPetala()); //1
        System.out.println("Cor da Pétala 1 a partir da Flor: "+ margarida.getPetala1().getCorPetala()); //2
        System.out.println("Cor da Pétala 1 a partir do Jardim: "+ j1.getFlor1().getPetala1().getCorPetala()); //3
        System.out.println("Cor da Pétala 1 a partir da Pracinha: "+ praca.getJardim1().getFlor1().getPetala1().getCorPetala()); //4
        
        Linha();
        
        System.out.println("Cor da Pétala 2: "+ p2.getCorPetala()); //5
        System.out.println("Cor da Pétala 2 a partir da Flor: "+ margarida.getPetala2().getCorPetala()); //6
        System.out.println("Cor da Pétala 2 a partir do Jardim: "+ j1.getFlor1().getPetala2().getCorPetala()); //7
        System.out.println("Cor da Pétala 2 a partir da Pracinha: "+ praca.getJardim1().getFlor1().getPetala2().getCorPetala()); //8
        
        Linha();
        
        System.out.println("Cor da Pétala 3: "+ p3.getCorPetala()); //9
        System.out.println("Cor da Pétala 3 a partir da Flor: "+ girassol.getPetala1().getCorPetala()); //10
        System.out.println("Cor da Pétala 3 a partir do Jardim: "+ j1.getFlor2().getPetala1().getCorPetala()); //11
        System.out.println("Cor da Pétala 3 a partir da Pracinha: "+ praca.getJardim1().getFlor2().getPetala1().getCorPetala()); //12
        
        Linha();
        
        System.out.println("Cor da Pétala 4: "+ p4.getCorPetala()); //13
        System.out.println("Cor da Pétala 4 a partir da Flor: "+ girassol.getPetala2().getCorPetala()); //14
        System.out.println("Cor da Pétala 4 a partir do Jardim: "+ j1.getFlor2().getPetala2().getCorPetala()); //15
        System.out.println("Cor da Pétala 4 a partir da Pracinha: "+ praca.getJardim1().getFlor2().getPetala2().getCorPetala()); //16
        
         Linha();
        
        System.out.println("Cor da Pétala 5: "+ p5.getCorPetala()); //17
        System.out.println("Cor da Pétala 5 a partir da Flor: "+ orquidea.getPetala1().getCorPetala()); //18
        System.out.println("Cor da Pétala 5 a partir do Jardim: "+ j2.getFlor1().getPetala1().getCorPetala()); //19
        System.out.println("Cor da Pétala 5 a partir da Pracinha: "+ praca.getJardim2().getFlor1().getPetala1().getCorPetala()); //20
        
         Linha();
        
        System.out.println("Cor da Pétala 6: "+ p6.getCorPetala()); //21
        System.out.println("Cor da Pétala 6 a partir da Flor: "+ orquidea.getPetala2().getCorPetala()); //22
        System.out.println("Cor da Pétala 6 a partir do Jardim: "+ j2.getFlor1().getPetala2().getCorPetala()); //23
        System.out.println("Cor da Pétala 6 a partir da Pracinha: "+ praca.getJardim2().getFlor1().getPetala2().getCorPetala()); //24
        
         Linha();
        
        System.out.println("Cor da Pétala 7: "+ p7.getCorPetala()); //25
        System.out.println("Cor da Pétala 7 a partir da Flor: "+ rosa.getPetala1().getCorPetala()); //26
        System.out.println("Cor da Pétala 7 a partir do Jardim: "+ j2.getFlor2().getPetala1().getCorPetala()); //27
        System.out.println("Cor da Pétala 7 a partir da Pracinha: "+ praca.getJardim2().getFlor2().getPetala1().getCorPetala()); //28
        
         Linha();
        
        System.out.println("Cor da Pétala 8: "+ p8.getCorPetala()); //29
        System.out.println("Cor da Pétala 8 a partir da Flor: "+ rosa.getPetala2().getCorPetala()); //30
        System.out.println("Cor da Pétala 8 a partir do Jardim: "+ j2.getFlor2().getPetala2().getCorPetala()); //31
        System.out.println("Cor da Pétala 8 a partir da Pracinha: "+ praca.getJardim2().getFlor2().getPetala2().getCorPetala()); //32
        
     
    }
    
    public static void Linha(){
        System.out.println("----------------------------------------------");
    }
}
