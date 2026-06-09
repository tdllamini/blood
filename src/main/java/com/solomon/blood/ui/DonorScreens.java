package com.solomon.blood.ui;

import javax.swing.*;
import java.awt.*;

public class DonorScreens extends JFrame {
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);
    
    public DonorScreens() {
        setTitle("Blood Bank Management System - Donor Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
        mainPanel.add(createLoginPanel(), "LOGIN");
        mainPanel.add(createDashboardPanel(), "DASHBOARD");
        mainPanel.add(createBookPanel(), "BOOK");
        mainPanel.add(createAppointmentsPanel(), "APPOINTMENTS");
        mainPanel.add(createHistoryPanel(), "HISTORY");
        mainPanel.add(createProfilePanel(), "PROFILE");
        
        add(mainPanel);
    }
    
    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(241, 250, 238));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        JPanel form = new JPanel(new GridLayout(3, 1, 10, 10));
        form.setBackground(Color.WHITE);
        form.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        JTextField username = new JTextField(20);
        JPasswordField password = new JPasswordField(20);
        JButton loginBtn = new JButton("Login");
        loginBtn.setBackground(new Color(230, 57, 70));
        loginBtn.setForeground(Color.WHITE);
        
        form.add(new JLabel("Username:"));
        form.add(username);
        form.add(new JLabel("Password:"));
        form.add(password);
        form.add(new JLabel());
        form.add(loginBtn);
        
        loginBtn.addActionListener(e -> cardLayout.show(mainPanel, "DASHBOARD"));
        
        panel.add(form);
        return panel;
    }
    
    private JPanel createDashboardPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(241, 250, 238));
        
        // Header
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        header.setBackground(new Color(46, 134, 171));
        header.setPreferredSize(new Dimension(0, 50));
        JLabel title = new JLabel("Blood Bank System - Donor Portal");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        header.add(title);
        panel.add(header, BorderLayout.NORTH);
        
        // Content
        JPanel content = new JPanel(new BorderLayout());
        content.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel welcome = new JLabel("Welcome, John Smith", SwingConstants.LEFT);
        welcome.setFont(new Font("Arial", Font.BOLD, 20));
        content.add(welcome, BorderLayout.NORTH);
        
        JPanel cards = new JPanel(new GridLayout(1, 3, 15, 0));
        cards.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        
        JPanel statusCard = new JPanel(new BorderLayout());
        statusCard.setBackground(new Color(168, 218, 220));
        statusCard.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        statusCard.add(new JLabel("Donation Status:"), BorderLayout.NORTH);
        JLabel eligible = new JLabel("Eligible to Donate");
        eligible.setOpaque(true);
        eligible.setBackground(new Color(42, 157, 143));
        eligible.setForeground(Color.WHITE);
        statusCard.add(eligible, BorderLayout.CENTER);
        
        JPanel countCard = new JPanel(new BorderLayout());
        countCard.setBackground(new Color(168, 218, 220));
        countCard.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        countCard.add(new JLabel("Total Donations:"), BorderLayout.NORTH);
        JLabel count = new JLabel("12");
        count.setFont(new Font("Arial", Font.BOLD, 36));
        count.setForeground(new Color(46, 134, 171));
        count.setHorizontalAlignment(SwingConstants.CENTER);
        countCard.add(count, BorderLayout.CENTER);
        
        JPanel typeCard = new JPanel(new BorderLayout());
        typeCard.setBackground(new Color(168, 218, 220));
        typeCard.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        typeCard.add(new JLabel("Blood Type: O+"), BorderLayout.CENTER);
        
        cards.add(statusCard);
        cards.add(countCard);
        cards.add(typeCard);
        content.add(cards, BorderLayout.CENTER);
        
        JButton bookBtn = new JButton("Book Appointment");
        bookBtn.setBackground(new Color(42, 157, 143));
        bookBtn.setForeground(Color.WHITE);
        bookBtn.addActionListener(e -> cardLayout.show(mainPanel, "BOOK"));
        
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPanel.add(bookBtn);
        content.add(btnPanel, BorderLayout.SOUTH);
        
        panel.add(content, BorderLayout.CENTER);
        return panel;
    }
    
    private JPanel createBookPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(241, 250, 238));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel title = new JLabel("Book Donation Appointment");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);
        
        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        
        form.add(new JLabel("Preferred Date:"));
        form.add(new JTextField("2026-06-15"));
        form.add(new JLabel("Time Slot:"));
        form.add(new JComboBox<>(new String[]{"08:00 - 10:00", "10:00 - 12:00", "13:00 - 15:00"}));
        form.add(new JLabel("Location:"));
        form.add(new JComboBox<>(new String[]{"Main Center", "North Branch", "Mobile Unit"}));
        form.add(new JLabel("Campaign:"));
        form.add(new JComboBox<>(new String[]{"None", "Community Drive 2026"}));
        
        JButton confirmBtn = new JButton("Confirm Booking");
        confirmBtn.setBackground(new Color(42, 157, 143));
        confirmBtn.setForeground(Color.WHITE);
        
        panel.add(form, BorderLayout.CENTER);
        panel.add(confirmBtn, BorderLayout.SOUTH);
        
        return panel;
    }
    
    private JPanel createAppointmentsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(241, 250, 238));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel title = new JLabel("My Appointments");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);
        
        String[][] data = {{"2026-06-15", "09:00", "Main Center", "Scheduled"}};
        String[] cols = {"Date", "Time", "Location", "Status"};
        JTable table = new JTable(data, cols);
        table.setFillsViewportHeight(true);
        
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        
        return panel;
    }
    
    private JPanel createHistoryPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(241, 250, 238));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel title = new JLabel("Donation History");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);
        
        String[][] data = {
            {"2026-05-20", "O+", "Main Center", "Completed"},
            {"2026-03-15", "O+", "North Branch", "Completed"}
        };
        String[] cols = {"Date", "Blood Type", "Location", "Status"};
        JTable table = new JTable(data, cols);
        
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        
        return panel;
    }
    
    private JPanel createProfilePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(241, 250, 238));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel title = new JLabel("Edit Profile");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);
        
        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        
        form.add(new JLabel("Full Name:"));
        form.add(new JTextField("John Smith"));
        form.add(new JLabel("Phone:"));
        form.add(new JTextField("555-0123"));
        form.add(new JLabel("Email:"));
        form.add(new JTextField("john@example.com"));
        form.add(new JLabel("Date of Birth:"));
        form.add(new JTextField("1990-01-15"));
        form.add(new JLabel("Blood Type:"));
        form.add(new JComboBox<>(new String[]{"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"}));
        
        JButton saveBtn = new JButton("Save Changes");
        saveBtn.setBackground(new Color(46, 134, 171));
        saveBtn.setForeground(Color.WHITE);
        
        panel.add(form, BorderLayout.CENTER);
        panel.add(saveBtn, BorderLayout.SOUTH);
        
        return panel;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DonorScreens().setVisible(true));
    }
}