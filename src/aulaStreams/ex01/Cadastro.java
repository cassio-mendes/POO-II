package aulaStreams.ex01;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;

public class Cadastro extends JFrame {

    private JFormattedTextField cpfField, dataField, telefoneField;
    private JTextField nomeField, sobrenomeField, enderecoField, emailField;
    private JScrollPane formulario;
    private JTextArea areaFormulario;
    private File arquivo = new File("src/aulaStreams/ex01/formulario.bin");

    public Cadastro(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);

        JPanel container = new JPanel();
        container.setLayout(null);
        this.add(container);

        Font fonte = new Font("Arial", Font.PLAIN, 18);

        //Campos de entada:

        JLabel cpfLabel = new JLabel("CPF: ");
        cpfLabel.setFont(fonte);
        cpfLabel.setBounds(45, 60, 50, 20);
        container.add(cpfLabel);

        try {
            MaskFormatter formatoCPF = new MaskFormatter("###.###.###-##");
            formatoCPF.setPlaceholderCharacter('_');

            cpfField = new JFormattedTextField(formatoCPF);
            cpfField.setFont(fonte);
            cpfField.setBounds(100, 60, 200, 20);
            container.add(cpfField);

        } catch(ParseException e) {
            JOptionPane.showMessageDialog(this, "ERRO no text field", "ERRO",
                    JOptionPane.ERROR_MESSAGE);

            System.out.println(e.getMessage());
            System.exit(0);
        }

        JLabel nomeLabel = new JLabel("Nome: ");
        nomeLabel.setFont(fonte);
        nomeLabel.setBounds(35, 100, 70, 20);
        container.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setFont(fonte);
        nomeField.setBounds(100, 100, 200, 20);
        container.add(nomeField);

        JLabel sobrenomeLabel = new JLabel("Sobrenome: ");
        sobrenomeLabel.setFont(fonte);
        sobrenomeLabel.setBounds(5, 140, 115, 20);
        container.add(sobrenomeLabel);

        sobrenomeField = new JTextField();
        sobrenomeField.setFont(fonte);
        sobrenomeField.setBounds(115, 140, 200, 20);
        container.add(sobrenomeField);

        JLabel dataLabel = new JLabel("Data: ");
        dataLabel.setFont(fonte);
        dataLabel.setBounds(40, 180, 70, 20);
        container.add(dataLabel);

        try {
            MaskFormatter formatoData = new MaskFormatter("##/##/####");
            formatoData.setPlaceholderCharacter('_');

            dataField = new JFormattedTextField(formatoData);
            dataField.setFont(fonte);
            dataField.setBounds(100, 180, 100, 20);
            container.add(dataField);

        } catch(ParseException e) {
            JOptionPane.showMessageDialog(this, "ERRO no text field", "ERRO",
                    JOptionPane.ERROR_MESSAGE);

            System.out.println(e.getMessage());
            System.exit(0);
        }

        JLabel enderecoLabel = new JLabel("Endereço: ");
        enderecoLabel.setFont(fonte);
        enderecoLabel.setBounds(20, 220, 100, 20);
        container.add(enderecoLabel);

        enderecoField = new JTextField();
        enderecoField.setFont(fonte);
        enderecoField.setBounds(110, 220, 200, 20);
        container.add(enderecoField);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setFont(fonte);
        emailLabel.setBounds(40, 260, 80, 20);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(fonte);
        emailField.setBounds(105, 260, 200, 20);
        container.add(emailField);

        JLabel telefoneLabel = new JLabel("Telefone: ");
        telefoneLabel.setFont(fonte);
        telefoneLabel.setBounds(30, 300, 90, 20);
        container.add(telefoneLabel);

        try {
            MaskFormatter formatoTelefone = new MaskFormatter("(##) #####-####");
            formatoTelefone.setPlaceholderCharacter('_');

            telefoneField = new JFormattedTextField(formatoTelefone);
            telefoneField.setFont(fonte);
            telefoneField.setBounds(120, 300, 200, 20);
            container.add(telefoneField);

        } catch(ParseException e) {
            JOptionPane.showMessageDialog(this, "ERRO no text field", "ERRO",
                    JOptionPane.ERROR_MESSAGE);

            System.out.println(e.getMessage());
            System.exit(0);
        }

        //Botões:

        JButton salvarBtn = new JButton("SALVAR");
        salvarBtn.setBackground(Color.WHITE);
        salvarBtn.setFont(fonte);
        salvarBtn.setBounds(80, 340, 110, 30);
        container.add(salvarBtn);

        JButton limparBtn = new JButton("LIMPAR");
        limparBtn.setBackground(Color.WHITE);
        limparBtn.setFont(fonte);
        limparBtn.setBounds(200, 340, 110, 30);
        container.add(limparBtn);

        addActionListeners(salvarBtn, limparBtn); //Adicionando funcionalidade aos botões

        //Formulário:

        JLabel formularioLabel = new JLabel("FORMULÁRIO:");
        formularioLabel.setFont(fonte);
        formularioLabel.setBounds(470, 30, 140, 20);
        container.add(formularioLabel);

        areaFormulario = new JTextArea();
        areaFormulario.setFont(new Font("Arial", Font.PLAIN, 12));
        areaFormulario.setEditable(false);
        areaFormulario.setLineWrap(true);       // Quebra a linha automaticamente ao atingir a borda
        areaFormulario.setWrapStyleWord(true);

        formulario = new JScrollPane(areaFormulario);
        formulario.setBounds(340, 50, 400, 360);
        container.add(formulario);

        preencheFormulario();

        this.setVisible(true);
    }

    private void addActionListeners(JButton salvarBtn, JButton limparBtn) {
        salvarBtn.addActionListener(e -> {
            try {
                ArrayList<Pessoa> pessoas = carregarObjetos();

                String cpf = cpfField.getText();
                String nome = nomeField.getText();
                String sobrenome = sobrenomeField.getText();
                String data = dataField.getText();
                String endereco = enderecoField.getText();
                String email = emailField.getText();
                String telefone = telefoneField.getText();

                Pessoa p = new Pessoa(cpf, nome, sobrenome, data, endereco, email, telefone);
                pessoas.add(p);

                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo));
                outputStream.writeObject(pessoas);
                outputStream.close();

                preencheFormulario();
            } catch(IOException ex) {
                System.out.println("ERRO: " + ex.getMessage());
            }
        });

        limparBtn.addActionListener(e -> {
            cpfField.setText("");
            nomeField.setText("");
            sobrenomeField.setText("");
            dataField.setText("");
            enderecoField.setText("");
            emailField.setText("");
            telefoneField.setText("");
        });
    }

    private void preencheFormulario() {
        areaFormulario.setText("");
        ArrayList<Pessoa> pessoas = carregarObjetos();

        for (Pessoa p : pessoas) areaFormulario.append(p.toString() + "\n"); //Adiciona as linhas
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Pessoa> carregarObjetos() {
        if(!arquivo.exists() || arquivo.length() <= 0) return new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (ArrayList<Pessoa>) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    static void main() {
        SwingUtilities.invokeLater(() -> new Cadastro("Cadastro"));
    }

}
