package com.example.demo;

import com.example.demo.dto.epi.EpiRequest;
import com.example.demo.dto.funcionario.FuncionarioRequest;
import com.example.demo.service.EpiService;
import com.example.demo.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
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
                    case 1 -> {
                        System.out.println("Nome do Epi: ");
                        String nome = sc.nextLine();
                        EpiRequest req = new EpiRequest();
                        req.setNomeEpi(nome);

                        epiService.cadastrarEpi();
                        System.out.println("Epi cadastrado com sucesso!");
                    }

                    case 2 -> {
                        var lista = epiService.listarEpis();
                        lista.forEach(System.out::println);
                    }

                    case 3 -> {
                        System.out.println("Nome do funcionário: ");
                        String nomeFuncionario = sc.nextLine();
                        FuncionarioRequest funcionarioRequest = new FuncionarioRequest();
                        funcionarioRequest.setNomeFuncionario(nomeFuncionario);

                        funcionarioService.cadastrarFuncionario(funcionarioRequest);
                        System.out.println("Funcionario cadastrado com sucesso!");
                    }

                    case 4 -> {
                        var listaF = funcionarioService.listarFuncionarios();
                        listaF.forEach(System.out::println);
                    }

                    case 0 -> {
                        System.out.println("Finalizando operação....");
                        sc.close();
                        return;
                    }

                    default -> System.out.println("Opção Inválida ou indisponível !");
                }
            }
        }
    }
