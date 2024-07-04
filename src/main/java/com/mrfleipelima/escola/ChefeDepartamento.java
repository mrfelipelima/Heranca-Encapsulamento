/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfleipelima.escola;

/**
 *
 * @author ALUNO
 */
public class ChefeDepartamento extends Funcionario {
    protected String departamento;
    protected String dataPromocao;
    protected double gratificacao;

    public ChefeDepartamento(String departamento, String dataPromocao, double gratificacao, String matricula, String dataAdmissao, double salario, String nome, String cpf, String dataNasc) {
        super(matricula, dataAdmissao, salario, nome, cpf, dataNasc);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    
}
