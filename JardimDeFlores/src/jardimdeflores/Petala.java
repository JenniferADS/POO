
package jardimdeflores;


public class Petala {
    private String cor = "";
    
    //push - Método Modificador
    public void setCorPetala(String cor){
        this.cor=cor;
    }
    
    //pull - Método Acessor
    public String getCorPetala(){
        return cor; //AMARELO
    }
}
