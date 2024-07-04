/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfleipelima.escola;

/**
 *
 * @author ALUNO
 */
public class Funcionario extends Pessoa {
    protected String matricula;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario(String matricula, String dataAdmissao, double salario, String nome, String cpf, String dataNasc) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
