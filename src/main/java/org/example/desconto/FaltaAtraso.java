package org.example.desconto;

import java.util.Scanner;

public class FaltaAtraso {
            
        public double calculaFaltaAtraso(){

            Scanner scanner = new Scanner(System.in);

                double DSR;

                System.out.println("Quanto é o valor de um dia de trabalho deste funcionário? (ex: 49.99)");
                DSR = scanner.nextDouble();

                double horaTrabalho;

                horaTrabalho = DSR/8;
                
                int DiasFaltados = 0;
                System.out.println("Quantos dias o funcionário faltou? (responda apenas com números inteiros)");
                DiasFaltados = scanner.nextInt();
                int HorasFaltadas = 0;
                System.out.println("Quantas horas o funcionário atrasou? (responda apenas com números inteiros)");
                HorasFaltadas = scanner.nextInt();

               double valorFaltaAtraso = (DiasFaltados*DSR)+(HorasFaltadas*horaTrabalho);
                return valorFaltaAtraso;
            }

}