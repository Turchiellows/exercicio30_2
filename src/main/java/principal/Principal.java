// PACKAGES
package principal;

// IMPORTS
import java.util.Scanner;
import java.util.Random;
import model.Aluno;
import model.Funcionario;

public class Principal {

   public static void main(String[] args) {
      // INSTANTIATE ===========================================================
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      Aluno xuxa = new Aluno("Xuxa da globo", "Rio de Janeiro", 171171171, 23514.49); // VIP
      Aluno normal1 = new Aluno(); // Normal
      Funcionario maria = new Funcionario(); // Normal
      Funcionario svetlana = new Funcionario("Svetlana Spoxstkov", "Personal trainner", 6000.00, 3254, true);

      
      
      
      // DECLARATE =============================================================
      String nome;
      String endereco;
      String cargo;
      Double mensalidade;
      Double salario;
      int matricula;
      int codigo;
      String[] temp = new String[4];

      
      
      
      // =======================================================================
      // READ 
      // =======================================================================
      // ALUNO
      System.out.println("++++++++\nALUNO\n++++++++");
      System.out.print("Nome        : ");
      nome = sc.nextLine();
      System.out.print("Endereço    : ");
      endereco = sc.nextLine();
      System.out.print("Mensalidade : ");
      mensalidade = sc.nextDouble();
      matricula = rand.nextInt((99999999 - 11111111) + 1) + 11111111;

      // SET
      normal1.setNome(nome);
      normal1.setEndereco(endereco);
      normal1.setMensalidade(mensalidade);
      normal1.setMatricula(matricula);
      sc.nextLine(); // To reset the prompt. Always put this aver nextInt, nextDouble, nextChar.

      // FUNCIONÁRIO
      System.out.println("++++++++\nFUNCIONÁRIO\n++++++++");
      System.out.print("Nome        : ");
      nome = sc.nextLine();
      System.out.print("Cargo       : ");
      cargo = sc.nextLine();
      System.out.print("Salário     : ");
      salario = sc.nextDouble();
      codigo = rand.nextInt((99999999 - 11111111) + 1) + 11111111;

      // SET
      maria.setNome(nome);
      maria.setCargo(cargo);
      maria.setSalario(salario);
      maria.setCodigo(codigo);
      maria.setStatus(true);
      sc.nextLine(); // To reset the prompt. Always put this aver nextInt, nextDouble, nextChar.

      
      
      
      
      
      // =======================================================================
      // SHOW 
      // =======================================================================
      // ALUNOS
      temp = normal1.lerAluno();
      System.out.println("\n====================================================");
      System.out.println("ALUNO NORMAL");
      System.out.println("====================================================");

      for (int i = 0; i < 4; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");

      temp = xuxa.lerAluno();
      System.out.println("\n====================================================");
      System.out.println("ALUNO VIP");
      System.out.println("====================================================");
      for (int i = 0; i < 4; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");

      
          
      
      
      
      // FUNCIONÁRIOS
      temp = maria.lerFuncionario();
      System.out.println("\n====================================================");
      System.out.println("FUNCIONÁRIO");
      System.out.println("====================================================");
      for (int i = 0; i < 5; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");

      temp = svetlana.lerFuncionario();
      System.out.println("\n====================================================");
      System.out.println("FUNCIONÁRIO");
      System.out.println("====================================================");
      for (int i = 0; i < 5; i++) {
         System.out.println(temp[i]);
      }
      System.out.println("");
   }
}
