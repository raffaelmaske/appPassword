package appPassword;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class PasswordMain {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Password senha1 = new Password();
		CadastroDeLogin cadastro1 = new CadastroDeLogin();

		System.out.println("Nome do cartao que vai ser salvo a senha");
		cadastro1.setNome(input.nextLine());
		System.out.println("Conta = " + cadastro1);

		System.out.println("\nDigite seu Nome!");
		senha1.setNome(input.nextLine());
		System.out.println("\nDigite sua senha para ser salva!");
		senha1.setSenha(input.nextLine());
		System.out.println(cadastro1.getNome() + "\n" + senha1.getNome() + "\n" + senha1.getSenha());

	}

}
