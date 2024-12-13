package fauna;

public class Fauna {

    public static void main(String[] args) {
        Mamiferos mamifero=new Mamiferos("Tigre",5,"sedoso");
        mamifero.Comer();
        mamifero.Amamantar();
        mamifero.Dormir();
        System.out.println("");
        
        Ave ave=new Ave("Aguila",6,2.5);
        ave.Comer();
        ave.Volar();
        ave.Dormir();
        System.out.println("");
        
        Reptil reptil=new Reptil("Cobra",10,"liso");
        reptil.Comer();
        reptil.Arrastrarse();
        reptil.Dormir();
               
    }    
}
