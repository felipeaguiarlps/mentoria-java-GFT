package Desafios.funcionários;

/**
 * Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de Herança para
 * remodelá-lo e implemente um programa que explore o domínio em questão:
 *
 * Vendedor -> Nome: String, Cpf : Long, Comissao: double, NumeroVendas: long | CalcularSalario(): double
 * Consultor ->Nome: String, Cpf: long, ValorHora: double, HorasTrabalhadas: long | CalcularSalario(): double
 *
 *
 * Regras:
 * a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para
 * armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
 * b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
 * c) Consultores ganham somente pelas horas que trabalharam.
 *
 *
 */

public abstract class Funcionario {
    private String nome;
    private long cpf;

    protected final double SALARIO_MINIMO = 1250.00;  //Constante

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }
}
