package com.risorlet.ATM_Simulator;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    
    ImageIcon frameIcon = new ImageIcon("F:\\Argha\\Projects\\Java\\ATM Simulator\\app\\src\\main\\resources\\images\\bank.png");
    Image bgImage = frameIcon.getImage();
    ImageIcon bgIcon = new ImageIcon(bgImage.getScaledInstance(60, 60, Image.SCALE_DEFAULT));

    Login() {
        //setting up the frame title and icon
        setTitle("ATM Simulator");
        setLocation(350, 150);
        setIconImage(frameIcon.getImage());
        
        //setting the layout manager to be null to customly put components in the frame
        setLayout(null);

        //setting up the title image at the top 
        JLabel bgImage = new JLabel(bgIcon);

        //setting up the title beside the title image
        JLabel title = new JLabel("  Welcome to ATM");
        title.setFont(new Font("Helvetica", Font.BOLD, 35));

        //adding the title image and title text inside a panel to group them
        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(150,30,400,60);
        headerPanel.setBackground(Color.WHITE);
        headerPanel.add(bgImage);
        headerPanel.add(title);
        add(headerPanel);

        //setting up the label and textfield for card number entry
        JLabel cardLabel = new JLabel("CARD NUMBER:");
        cardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));

        JTextField cardField = new JTextField(15);

        //card entry Panel
        JPanel cardPanel = new JPanel(new BorderLayout(10, 0));
        cardPanel.setBounds(150,150,400,30);
        cardPanel.setBackground(Color.WHITE);
        cardPanel.add(cardLabel,BorderLayout.LINE_START);
        cardPanel.add(cardField,BorderLayout.LINE_END);
        add(cardPanel);

        //setting up the label and passwordField for PIN entry
        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Helvetica", Font.BOLD, 20));

        JPasswordField pinField =  new JPasswordField(15);

        //PIN entry panel
        JPanel pinPanel = new JPanel(new BorderLayout(10, 0));
        pinPanel.setBounds(150,200,400,30);
        pinPanel.setBackground(Color.WHITE);
        pinPanel.add(pinLabel,BorderLayout.LINE_START);
        pinPanel.add(pinField,BorderLayout.LINE_END);
        add(pinPanel);

        //setting up the login, clear and signUp buttons
        JButton loginButton = new JButton("LOG IN");
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(255,215,0));
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setPreferredSize(new Dimension(120, 40));
        loginButton.setFocusable(false);
        loginButton.addActionListener(e -> {
            System.out.println("Logged in!");
        });

        JButton clearButton = new JButton("CLEAR");
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(new Color(255,215,0));
        clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clearButton.setPreferredSize(new Dimension(120, 40));
        clearButton.setFocusable(false);
        clearButton.addActionListener(e -> {
            cardField.setText("");
            pinField.setText("");
        });

        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(0,0,0));
        signUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signUpButton.setPreferredSize(new Dimension(120, 40));
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(e -> {
            dispose();
            new SignUp().setVisible(true);
        });

        //control buttons panel setup
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonsPanel.setBounds(200,280,300,100);
        buttonsPanel.setBackground(Color.WHITE);
        buttonsPanel.setFont(new Font("Helvetica", Font.BOLD, 18));
        buttonsPanel.add(loginButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(signUpButton);
        add(buttonsPanel);

        //setting up the size of the frame and making it visible
        setSize(700, 450);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
