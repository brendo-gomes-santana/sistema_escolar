package school.management.system;

import javax.swing.*;

public class Login extends JFrame {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;

    Login() {
        super("School System");
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);

        label1 = new JLabel("SISTEMA DE NOTAS ESCOLAR");
        label1.setBounds(350, 80, 450, 40);
        add(label1);

        label2 = new JLabel("Usuário: ");
        label2.setBounds(000, 150, 450, 40);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(50, 150, 250, 40);
        add(textField2);

        label3 = new JLabel("Senha: ");
        label3.setBounds(000, 200, 450, 40);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(50, 200, 250, 40);
        add(passwordField3);
    }

    public static void main(String[] args) throws Exception {
        new Login();
    }
}


/// TÔ ALTERANDO E DEIXANDO TUDO PARAR DE FUNCIONAR
