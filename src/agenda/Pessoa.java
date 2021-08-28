
package agenda;

public class Pessoa {
 
    String nome;
    String telefone;
    int idade;
    public static final double IMPOSTO = 0.05;
   
    
    public Pessoa(){
        this(" ", " ", 0);
       
   }

    public static double getIMPOSTO() {
        return (double) IMPOSTO;
    }

    public static void setIMPOSTO(double IMPOSTO) {
        
    }
    
    public Pessoa(String nome, String telefone, int idade){
       this.setNome(nome);
       this.setTelefone(telefone);
       this.setIdade(idade);
 
      
}
       
   
    public String mostrarDados()
   {
       String retorno;
        retorno = " - Nome " + nome +
                  " - Telefone " + telefone +
                  " - Idade " + idade + 
                  " - Imposto " + IMPOSTO  ;
       return retorno;
     
      
       
   
   
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
       
  

