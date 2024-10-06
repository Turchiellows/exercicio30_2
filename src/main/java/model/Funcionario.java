package model;

public class Funcionario {
   // ATTRIBUTES ===============================================================

   private String nome;
   private String cargo;
   private Double salario;
   private int codigo;
   private boolean status;

   // CONSTRUCTORS =============================================================
   public Funcionario() {
      this("Desconhecido", "Atendente", 0.0, 0, false);
   }

   public Funcionario(String nome, String cargo, Double salario, int codigo, boolean status) {
      this.nome = nome;
      this.cargo = cargo;
      this.salario = salario;
      this.codigo = codigo;
      this.status = status;
   }

   // GETTERS AND SETTERS ======================================================
   public String getNome() {
      return nome;
   }

   public String getCargo() {
      return cargo;
   }

   public Double getSalario() {
      return salario;
   }

   public int getCodigo() {
      return codigo;
   }

   public boolean getStatus() {
      return status;
   }

   public void setNome(String nome) {
      // VALIDATE
      if (nome.length() == 0) {
         nome = "Desconhecido";
      }
      this.nome = nome;
   }

   public void setCargo(String cargo) {
      // VALIDATE
      if (cargo.length() == 0) {
         cargo = "Atendente";
      }
      this.cargo = cargo;
   }

   public void setSalario(Double salario) {
      // VALIDATE
      if (salario < 0.0) {
         salario = 0.0;
      }
      this.salario = salario;
   }

   public void setCodigo(int codigo) {
      // VALIDATE
      if (codigo < 0) {
         codigo = 0;
      }
      this.codigo = codigo;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }

   // METHODS ==================================================================
   public String[] lerFuncionario() {
      // ARRAY
      String[] result = new String[5];
      
      // STATUS
      String situacao;
      if (getStatus() == true) {
         situacao = "Ativo";
      } else {
         situacao = "Inativo";
      }
      
      result[0] = "Código      : " + getCodigo();
      result[1] = "Nome        : " + getNome();
      result[2] = "Cargo       : " + getCargo();
      result[3] = "Salário     : " + getSalario();
      result[4] = "Status      : " + situacao;
    
      return result;
   }
}
