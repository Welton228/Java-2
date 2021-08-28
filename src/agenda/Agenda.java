
package agenda;

public class Agenda {

    public static void main(String[] args) {
        
      Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Welton " , "(48) 12345678" , 28);
        pessoaFisica p3 = new pessoaFisica();
        
        p1.setNome("Luiz");
        p1.setTelefone("12345");
        p1.setIdade(25);
        p3.setNome("José");
        p3.setTelefone("12345667");
        p3.setIdade(48);
        p3.setCpf(" - CPF  123459694");
        Pessoa.setIMPOSTO(0.05);
        
        
        System.out.println(p1.mostrarDados());
        System.out.println(p2.mostrarDados());
        System.out.println(p3.mostrarDados());
      
    } 
}
