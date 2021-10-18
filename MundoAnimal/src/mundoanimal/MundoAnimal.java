
package mundoanimal;
        //Aula do dia 18/08 JENNIFER VASCONCELOS DE CARVALHO
public class MundoAnimal {

  
    public static void main(String[] args) {
        System.out.println(" ========== PROGRAMA DE INJEÇÃO DE DEPENDÊNCIA =========");
        Animal cobra= new Animal("Celeste");
        Animal cachorro= new Animal("Rabujento");
        
        //EXERCÍCIO ADICIONAR NOVOS ANIMAIS
        Animal cabra = new Animal("Fetucia"); 
        Animal carangueijo = new Animal("Sirigueijo");
        
        // cachorro = cobra; //garbage collector =TOMAR CUIDADO COM ISSO!! pois gerá muito erro de NullPointerException e ClassNotFoundException
        
        cachorro.setAnimal(cobra);  
        cabra.setAnimal1(carangueijo);
        
        cobra.mostrarNome("é uma cobra");
        cachorro.mostrarNome(" é um cachorro");
        cabra.mostrarNome(" é uma cabra");
        carangueijo.mostrarNome(" é um carangueijo");
        
        pulaLinha();
        
        cachorro.mostrarNomeAnimalDeDentro();
        cabra.mostrarNomeAnimalDeDentro1();
    }
    
        private static void pulaLinha(){ //criei esse método apenas para facilitar a visualização
        System.out.println(" ========== INJETANDO UM OBJETO DENTRO DO OUTRO ===");
    }
}
