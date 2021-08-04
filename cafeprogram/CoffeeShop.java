

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CoffeeShop {

JFrame f;

CoffeeShop(){

        f=new JFrame("𝒞𝑜𝑓𝑓𝑒𝑒 𝒮ℎ𝑜𝑝");
        final JLabel label = new JLabel();
        f.setLocationRelativeTo(null);
        JLabel label1 = new JLabel();        
        label1.setText("𝒬𝑢𝑎𝑙 𝑠𝑒𝑢 𝑛𝑜𝑚𝑒?");
        label1.setBounds(52,223,100,100);
        JLabel label2 = new JLabel();
        label2.setBounds(52,320,200,100);
        JTextField textField= new JTextField();
        textField.setBounds(152,260,130,30);

        label.setHorizontalAlignment(JLabel.CENTER);  
        label.setSize(400,100);  
    
        JButton b=new JButton("Finalizar Compra");  
        b.setBounds(40,320,260,20);

        ImageIcon sacodecafe = new ImageIcon("C:\\Users\\noemi\\OneDrive\\Documentos\\icone\\saco-de-cafe.png");
        ImageIcon cardapio = new ImageIcon("C:\\Users\\noemi\\OneDrive\\Documentos\\icone\\cardapio.png");
    
        String[] expresso = {"Mocha", "Cappuccino", "Expresso", "Latte", "Vanilla Latte", "Coado", "Caramel Macchiato"};
    
        String[] quantexpresso= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] doce ={"Croissant", "Macaron", "Torta de Maçã", "Cheesecake", "Cupcake de Hortelã", "Bolo de Chocolate"};
        String[] quantdoce= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox jce = new JComboBox(expresso);
        JComboBox jcq1 = new JComboBox(quantexpresso);
        JComboBox jcd = new JComboBox(doce);
        JComboBox jcq2 = new JComboBox(quantdoce);
    
        //create a JOptionPane
        Object[] options = new Object[]{};
        JOptionPane jop = new JOptionPane("𝐹𝑎ç𝑎 𝑠𝑒𝑢 𝑝𝑒𝑑𝑖𝑑𝑜\n\n",JOptionPane.QUESTION_MESSAGE, JOptionPane.DEFAULT_OPTION, cardapio ,options, null);
    
        //add combos to JOptionPane
        JLabel expressotext = new JLabel("𝐸𝑥𝑝𝑟𝑒𝑠𝑠𝑜", JLabel.LEADING); //== LEFT);
        jop.add(expressotext);
        jop.add(jce);
        JLabel quanttext = new JLabel("𝒬𝑢𝑎𝑛𝑡𝑖𝑑𝑎𝑑𝑒 - 𝐸𝑥𝑝𝑟𝑒𝑠𝑠𝑜", JLabel.LEADING); //== LEFT);
        jop.add(quanttext);
        jop.add(jcq1);
        JLabel docetext = new JLabel("𝒟𝑜𝑐𝑒𝑠", JLabel.LEADING); //== LEFT);
        jop.add(docetext);
        jop.add(jcd);
        JLabel quanttext2 = new JLabel("𝒬𝑢𝑎𝑛𝑡𝑖𝑑𝑎𝑑𝑒 - 𝒟𝑜𝑐𝑒𝑠", JLabel.LEADING); //== LEFT);
        jop.add(quanttext2);
        jop.add(jcq2);
        jop.setBounds(40,20,260,220);
    
        f.add(jop);
        f.add(label);
        f.add(b);
        f.add(label1);
        f.add(textField);
        f.setLayout(null);
        f.setSize(360,440);    
        f.setVisible(true);
        

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String item = textField.getText();
                String item1 = jce.getSelectedItem().toString();
                String item2 = jcq1.getSelectedItem().toString();
                String item3 = jcd.getSelectedItem().toString();
                String item4 = jcq2.getSelectedItem().toString();

                String dados = "Seu pedido:\nExpresso: " + item1 + " - " + item2 + "\nDoce: " + item3 + " - " + item4 + "\nCliente: " + item;
                JOptionPane.showMessageDialog(null, dados, "Coffee Shop", JOptionPane.INFORMATION_MESSAGE, sacodecafe);
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        ImageIcon cafeteria = new ImageIcon("C:\\Users\\noemi\\OneDrive\\Documentos\\icone\\cafeteria.png");
        JOptionPane.showMessageDialog(null, "𝐵𝑒𝑚-𝑣𝑖𝑛𝑑𝑜 𝑎𝑜 𝒞𝑜𝑓𝑓𝑒𝑒 𝒮ℎ𝑜𝑝", "𝒞𝑜𝑓𝑓𝑒𝑒 𝒮ℎ𝑜𝑝", JOptionPane.INFORMATION_MESSAGE, cafeteria);
        new CoffeeShop();
    }
}
