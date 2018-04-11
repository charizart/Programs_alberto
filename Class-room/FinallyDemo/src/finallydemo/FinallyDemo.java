/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallydemo;

/**
 *
 * @author Admin
 */
public class FinallyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.io.PrinWriter output = null;

        try {
            output = new java.io.PrinWriter("text.txt");

            output.Printin("wolcome to java");
        } catch (IOExcepton ex) {
            ex.pritStackTrace();

        } finally {

            if () {
                output != null
            }
            
                ){
		output.close();
            }
            Systetem.out.printin("end of program")
        
        }

    }
}
