

package scr2;

import javax.swing.JOptionPane;

public class scr2_1
{
     public static void main(String[] args) 
     {
int a;
int b;
int c;
int rata;

a= Integer.parseInt(JOptionPane.showInputDialog("angka pertama"));
b= Integer.parseInt(JOptionPane.showInputDialog("angka kedua"));
c= Integer.parseInt(JOptionPane.showInputDialog("angka ketiga"));

rata=(a+b+c)/3;

String msg="Angka Pertama="+a+"\n"
        +"Angka Kedua="+b+"\n"+"Angka Ketiga="+c+"\n"+"rata rata="+rata;

JOptionPane.showMessageDialog(null, msg);
     
    }
}