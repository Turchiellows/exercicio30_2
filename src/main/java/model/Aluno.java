package model;

public class Aluno {

   // ATTRIBUTES ===============================================================
   private String nome;
   private String endereco;
   private int matricula;
   private double mensalidade;

   // CONSTRUCTORS =============================================================
   public Aluno() {
      this("Desconhecido", "Planeta terra", 0, 480.99);
   }

   public Aluno(String nome, String endereco, int matricula, double mensalidade) {
      this.nome = nome;
      this.endereco = endereco;
      this.matricula = matricula;
      this.mensalidade = mensalidade;
   }

   // GETTERS AND SETTERS ======================================================
   public String getNome() {
      return nome;
   }

   public String getEndereco() {
      return endereco;
   }

   public int getMatricula() {
      return matricula;
   }

   public double getMensalidade() {
      return mensalidade;
   }

   public void setNome(String nome) {
      // VALIDATE
      if (nome.length() == 0) {
         nome = "Desconhecido";
      }
      this.nome = nome;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public void setMatricula(int matricula) {
      // VALIDATE
      if (matricula < 0) {
         matricula = 0;
      }
      this.matricula = matricula;
   }

   public void setMensalidade(double mensalidade) {
      // VALIDATE
      if (mensalidade < 0) {
         mensalidade = 480.99;
      }
      this.mensalidade = mensalidade;
   }
   
   
   // METHODS ==================================================================
   public String[] lerAluno() {
      String[] result = new String[4];
      result[0] = "Matrícula   : " + getMatricula();
      result[1] = "Nome        : " + getNome();
      result[2] = "Endereço    : " + getEndereco();
      result[3] = "Mensalidade : " + getMensalidade();
    
      return result;
   }

}
