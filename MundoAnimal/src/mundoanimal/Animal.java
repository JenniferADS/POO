
package mundoanimal;

public class Animal {
    String nome;
    Animal animal; //ponteiros vazios começam com null
    Animal animal1;
    
    public void setAnimal(Animal animal){// quando colocamos um objeto dentro do outro
        this.animal=animal;              // isso se chama injeção de dependencia
    }
    
    public void setAnimal1(Animal animal1){
        this.animal1=animal1;
    }
    
    public void mostrarNomeAnimalDeDentro(){
        animal.mostrarNome(nome);
    }
    
    public void mostrarNomeAnimalDeDentro1(){
        animal1.mostrarNome(nome);
    }
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public void mostrarNome(String mensagem){
        System.out.println("Nome: "+nome + " "+mensagem);
    }
}
