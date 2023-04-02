package com.vitorcamara.projetos;
import java.util.Scanner;

public class DownloadEmSegundos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do arquivo em MB:");
		double arquivoMb = scan.nextDouble();

		System.out.println("Entre com a velocidade da internet em Mbps:");
		double velocidadeMbps = scan.nextDouble();

		double tempoDownload = arquivoMb / velocidadeMbps;

		System.out.println("Seu download sera feito em aproximadamente " + tempoDownload + " segundo(s)");

	}

}
