package q1;

public class Main {
  
    public static void main(String[] args) {
       
       
        Paciente p1 = new Paciente(1, "Italo", "01/08/2004", "M", "03092021", "IODO", "O+");
         show(pac);
         pac.nome; = "Mãe"
         pac.dataNascimento = "25/03/1974";
         pac.sexo = "F";
         pac.alergia = "alho"
         pac.tipoSanguineo = "O+"
         show(pac);
        
    }
    public static void show(Paciente pac){
      System.out.println("Paciente: " + pac.codigo);
      System.out.println("Nome: " + pac.nome);
      System.out.println("Nasceu em: " + pac.dataNascimento);
      System.out.println("sexo (M=Masculino e F=Feminino): " pac.sexo);
      System.out.println("Plano de Saude: " + pac.planoSaude);
      System.out.println("Alergico à: " + pac.alergia);
      System.out.println("Tipo Sanguineo: " + pac.tipoSanguineo);
    }
    
}
