/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfleipelima.escola;

/**
 *
 * @author ALUNO
 */
public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
