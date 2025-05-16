/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.estacio.projetoestacio.testes;

import br.estacio.projetoestacio.visao.ClienteDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author 16380127763
 */
public class TesteLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria o EntityManager a partir da unidade de persistência
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_Projeto");
        EntityManager em = emf.createEntityManager();

        // Instancia o LoginService com o EntityManager
        ClienteDAO logarUsuario = new ClienteDAO(em);

        // Solicita ao usuário a matrícula e a senha
        String matricula = JOptionPane.showInputDialog("Digite sua matrícula:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        // Tenta autenticar
        boolean autenticado = logarUsuario.autenticar(matricula, senha);

        // Exibe resultado
        if (autenticado) {
            JOptionPane.showMessageDialog(null, "Bem-vindo!");
            // Exibir próxima tela ou executar ações para o usuário autenticado
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }

        // Fecha o EntityManager
        em.close();
        emf.close();
    }
    
}
