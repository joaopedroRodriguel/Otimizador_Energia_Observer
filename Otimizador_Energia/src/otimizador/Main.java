package otimizador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquipamentoObservavel equipamentoObservavel = new EquipamentoObservavel();
//		
		EquipamentoObservador observador = new EquipamentoObservador("Observador");
//		
//		Docente docente1 = new Docente("Alex");
//        Docente docente2 = new Docente("Valeria");
//        
//        equipamentoObservavel.adicionarDocente(docente1);
//        equipamentoObservavel.adicionarDocente(docente2);
//        
//        equipamentoObservavel.removerDocente(docente1);
//        equipamentoObservavel.removerDocente(docente2);
        
        Scanner scanner = new Scanner (System.in);
		while (true) {
			System.out.println("-------------OTIMIZADOR DE ENERGIA GPS----------\n"
						+ "1) ADICIONAR DOCENTE\n"
						+ "2) REMOVER DOCENTE\n"
						+ "3) LISTAR DOCENTES EM SALA\n"
						+ "4) SAIR");
			System.out.println("Informe uma opcao: ");
			int opcao = scanner.nextInt();
			
			if (opcao == 4) {
				System.out.println("Saindo....");
				scanner.close();
				break;
			}
			
			if (opcao == 1) {
				System.out.println("Informe o nome do docente: ");
				String nome = scanner.next();
				Docente docente1 = new Docente(nome);
				equipamentoObservavel.adicionarDocente(docente1);
			}
			if (opcao == 2) {
				System.out.println(equipamentoObservavel.getDocentes()); 
				System.out.println("Informe o index do docente a ser removido (COMEÇA NO 0): ");
				int index = scanner.nextInt();
				Docente docente = equipamentoObservavel.getDocentes().get(index);
				equipamentoObservavel.removerDocente(docente);
			}
			if (opcao == 3) {
				if (equipamentoObservavel.isEmpty()==true) {
					System.out.println("SALA VAZIA.");
				}
				else {
					System.out.println(equipamentoObservavel.getDocentes());
				}
				
			}
		}
	}

}
