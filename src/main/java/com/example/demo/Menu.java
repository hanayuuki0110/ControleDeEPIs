package com.example.demo;

import com.example.demo.dto.epi.EpiRequest;
import com.example.demo.dto.funcionario.FuncionarioRequest;
import com.example.demo.service.EpiService;
import com.example.demo.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
@RequiredArgsConstructor
    public class Menu implements CommandLineRunner {

        private final EpiService epiService;
        private final FuncionarioService funcionarioService;


        @Override
        public void run(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n ========= MENU - CONTROLE DE EPI SYSTEM ========= ");
                System.out.println("1 - CADASTRAR EPI");
                System.out.println("2 - LISTAR EPIs");
                System.out.println("3 - CADASTRAR FUNCIONÁRIO");
                System.out.println("4 - LISTAR FUNCIONÁRIOS");
                System.out.println("0 - SAIR");
                System.out.println("SEJA BEM VINDO! ESCOLHA UMA OPÇÃO PARA COMEÇAR");

                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarEpi(sc);
                        break;

                    case 2:
                        listarEpi();
                        break;
                    case 3:
                        cadastrarFuncionario(sc);
                        break;

                    case 4:
                        listarFuncionarios();
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema...");
                        System.out.println (0);


                    default:
                        System.out.println("Opção invállida ou Indisponível");
                }
            }
        }

        private void cadastrarEpi(Scanner sc) {
            System.out.println("=== Cadastro de EPI ====");
            System.out.println("Digite o nome do EPI:");
            String nome = sc.nextLine();

            System.out.println("Quantidade total (Estoque) : ");
            int qtd = sc.nextInt();
            sc.nextLine();

            EpiRequest epiRequest = new EpiRequest();
            epiRequest.setNomeEpi(nome);
            epiRequest.setQtdTotal(qtd);
            epiRequest.setQtdDisponivel(qtd);

            epiService.cadastrarEpi(epiRequest);
            System.out.println("EPI cadastrado com sucesso!");

        }

        private void listarEpi() {
            System.out.println("=== Listar EPI ====");
            epiService.listarEpis().forEach(System.out::println);
        }

        private void cadastrarFuncionario(Scanner sc) {
            System.out.println("=== Cadastro de Funcionário ====");
            System.out.println("Nome do funcionário: ");
            String nome = sc.nextLine();

            System.out.println("Informe o Email:");
            String email = sc.nextLine();

            FuncionarioRequest funcionarioRequest = new FuncionarioRequest();
            funcionarioRequest.setNomeFuncionario(nome);
            funcionarioRequest.setEmail(email);

            funcionarioService.cadastrarFuncionario(funcionarioRequest);
            System.out.println("Funcionário cadastro com sucesso!");
        }

        private void listarFuncionarios() {
            System.out.println("=== Listagem de EPIs ===");
            funcionarioService.listarFuncionarios().forEach(System.out::println);
        }
}
