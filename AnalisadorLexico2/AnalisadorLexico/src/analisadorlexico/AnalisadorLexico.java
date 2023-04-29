/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisadorlexico;

/**
 *
 * @author Reginaldo junior - Unilins
 */
public class AnalisadorLexico {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        AlgumaLexico lexico = new AlgumaLexico("file.txt");
        Token token = null;

        while((token = lexico.proximoToken()).nome != TipoToken.Fim){
            System.out.println(token);
        }
    }    
}
