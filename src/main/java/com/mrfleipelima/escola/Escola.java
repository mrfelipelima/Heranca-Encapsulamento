/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mrfleipelima.escola;

/**
 *
 * @author ALUNO
 */
public class Escola {

    public static void main(String[] args) {
        ChefeDepartamento pessoa1 = new ChefeDepartamento("Administracao", "04/07/2024", 3500.00, "2024011214", "10/07/2023", 1200.00, "Felipe Lima", "000.300.842-88", "25/07/1996");
        System.out.println(pessoa1.getCpf());
        
        Aluno pessoa2 = new Aluno("Fulano", "000.000.000-00", "01/01/2000", "2024001122");
        System.out.println(pessoa2.getNome());
    }
}
