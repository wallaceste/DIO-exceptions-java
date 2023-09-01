package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Formato invalido, informe um número inteiro!" + e.getMessage());
                e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                e.printStackTrace();
            }finally {
                System.out.println("Chegou no finally!");
            }
        }while (continueLooping);

        System.out.println("O código continua...");
    }

    private static int dividir(int a, int b) {
        return a / b;
    }


}
