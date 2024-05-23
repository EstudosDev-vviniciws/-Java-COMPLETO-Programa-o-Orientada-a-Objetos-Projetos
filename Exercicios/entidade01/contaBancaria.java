package Exercicios.entidade01;

public class contaBancaria {
    private int numero;
    private String titular;
    private double balanca;
    public contaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public contaBancaria(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalanca() {
        return balanca;
    }

    public void depositar(double quantia) {
        balanca += quantia;
    }

    public void sacar(double quantia) {
        balanca -= quantia + 5;
    }

    public String toString() {
        return  "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Balança: $ "
                + String.format("%.2f", balanca);
    }
}
