/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190698_stack;
import java.util.Stack;//import library Stack
/**
 *
 * @author Acer
 */
public class E31190698_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack mentah = new Stack();//pendeklarasian objek stack mentah
        Stack matang = new Stack();//pendeklarasian objek stack matang
        
        for(int i = 1; i <= 5; i++){//menggunakan perulangan for
            mentah.push("buah" +i);//proses memasukkan data buah pada stack
        }
        System.out.println("SEBELUM MATANG" + "\nJumlah buah mentah : " + mentah.size()+ "\nJumlah buah matang : " + matang.size()+
                "\nKumpulan buah mentah : ");//menampilkan jumlah buah mentah
        
        for (int i = 1; i<= 5; i++){//menggunakan perulangan for dengan kondisi i=1 ikurang dari atau sama dengan 5 maka i increment
            System.out.println(mentah.peek());
            matang.push(mentah.pop());//proses pengeluaran data buah pada stack
                    
        }
        System.out.println("\nSETELAH MATANG" + "\nJumlah buah mentah :" + mentah.size()+ "\nJumlah buah matang :"+ matang.size()+
                           "\nKumpulan buah matang");//menampilkan jumlah buah matang
        
        for(int i=4; i >= 0; i--){//menggunakan perulangan for dengan kondisi i=4 ilebih dari atau sama dengan 0 maka i decrement
        
        System.out.println(matang.elementAt(i));
        
    }
    
}
}
