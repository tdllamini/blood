package frontend.util;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class ThemeManager {
    // ── Colors ────────────────────────────────────────────────
    public static final Color PRIMARY        = new Color(220, 53, 69);
    public static final Color PRIMARY_HOVER  = new Color(200, 35, 51);
    public static final Color PRIMARY_LIGHT  = new Color(255, 235, 237);
    public static final Color SECONDARY      = new Color(13, 110, 253);
    public static final Color SECONDARY_HOVER= new Color(9, 90, 200);
    public static final Color SECONDARY_LIGHT= new Color(230, 240, 255);
    public static final Color SUCCESS        = new Color(25, 135, 84);
    public static final Color SUCCESS_HOVER  = new Color(20, 110, 68);
    public static final Color SUCCESS_LIGHT  = new Color(232, 245, 233);
    public static final Color WARNING        = new Color(255, 193, 7);
    public static final Color WARNING_LIGHT  = new Color(255, 248, 225);
    public static final Color INFO           = new Color(23, 162, 184);
    public static final Color INFO_LIGHT     = new Color(227, 242, 245);
    public static final Color DARK           = new Color(31, 37, 45);
    public static final Color DARK_HOVER     = new Color(45, 52, 60);
    public static final Color DARK_LIGHT     = new Color(45, 50, 58);
    public static final Color CARD_BG        = Color.WHITE;
    public static final Color BORDER         = new Color(222, 226, 230);
    public static final Color BORDER_HOVER   = new Color(200, 205, 210);
    public static final Color BORDER_LIGHT   = new Color(240, 242, 245);
    public static final Color LIGHT_BG       = new Color(248, 249, 250);
    public static final Color TEXT_PRIMARY   = new Color(33, 37, 41);
    public static final Color TEXT_SECONDARY = new Color(108, 117, 125);
    public static final Color TEXT_DISABLED  = new Color(150, 158, 166);
    public static final Color SIDEBAR_TEXT   = new Color(200, 205, 210);
    public static final Color SIDEBAR_HOVER  = new Color(56, 62, 70);
    public static final Color SIDEBAR_SELECTED= new Color(45, 50, 58);
    public static final Color SHADOW         = new Color(0, 0, 0, 15);
    public static final Color PURPLE         = new Color(111, 66, 193);
    public static final Color PURPLE_HOVER   = new Color(90, 50, 160);
    public static final Color PURPLE_LIGHT   = new Color(240, 230, 250);
    public static final Color DANGER         = new Color(220, 53, 69);

    // ── Fonts ─────────────────────────────────────────────────
    public static final Font FONT_DISPLAY     = new Font("Segoe UI", Font.BOLD, 32);
    public static final Font FONT_TITLE       = new Font("Segoe UI", Font.BOLD, 24);
    public static final Font FONT_SUBTITLE    = new Font("Segoe UI", Font.BOLD, 18);
    public static final Font FONT_HEADING     = new Font("Segoe UI", Font.BOLD, 16);
    public static final Font FONT_BODY        = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font FONT_BODY_BOLD   = new Font("Segoe UI", Font.BOLD, 14);
    public static final Font FONT_SMALL       = new Font("Segoe UI", Font.PLAIN, 12);
    public static final Font FONT_SMALL_BOLD  = new Font("Segoe UI", Font.BOLD, 12);
    public static final Font FONT_INPUT       = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_BUTTON      = new Font("Segoe UI", Font.BOLD, 13);
    public static final Font FONT_BUTTON_SMALL= new Font("Segoe UI", Font.BOLD, 11);
    public static final Font FONT_MONO        = new Font("Consolas", Font.PLAIN, 12);
    public static final Font FONT_ICON        = new Font("Segoe UI Emoji", Font.PLAIN, 28);
    public static final Font FONT_ICON_ALT      = new Font("Arial", Font.PLAIN, 28);

    // ── Spacing ────────────────────────────────────────────
    public static final int PX_SMALL  = 6;
    public static final int PX_MEDIUM = 12;
    public static final int PX_LARGE  = 20;
    public static final int PX_XL     = 30;
    public static final int R_SMALL  = 4;
    public static final int R_MEDIUM = 8;
    public static final int R_LARGE  = 12;

    // ── Global L&F ────────────────────────────────────────────
    public static void applyGlobalTheme() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UIManager.put("Button.font", FONT_BUTTON);
        UIManager.put("Label.font", FONT_BODY);
        UIManager.put("TextField.font", FONT_INPUT);
        UIManager.put("PasswordField.font", FONT_INPUT);
        UIManager.put("TextArea.font", FONT_INPUT);
        UIManager.put("ComboBox.font", FONT_INPUT);
        UIManager.put("Table.font", FONT_BODY);
        UIManager.put("TableHeader.font", FONT_SMALL_BOLD);
        UIManager.put("TabbedPane.font", FONT_BODY);
        UIManager.put("MenuItem.font", FONT_BODY);
        UIManager.put("Menu.font", FONT_BODY);
        UIManager.put("ToolTip.font", FONT_SMALL);
        UIManager.put("OptionPane.messageFont", FONT_BODY);
        UIManager.put("OptionPane.buttonFont", FONT_BUTTON);
    }

    // ── Buttons ───────────────────────────────────────────────
    public static JButton primaryButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setForeground(TEXT_PRIMARY);
        colorButton(b, PRIMARY, PRIMARY_HOVER);
        return b;
    }
    public static JButton secondaryButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setForeground(TEXT_PRIMARY);
        colorButton(b, SECONDARY, SECONDARY_HOVER);
        return b;
    }
    public static JButton successButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setForeground(TEXT_PRIMARY);
        colorButton(b, SUCCESS, SUCCESS_HOVER);
        return b;
    }
    public static JButton dangerButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setForeground(TEXT_PRIMARY);
        colorButton(b, PRIMARY, PRIMARY_HOVER);
        return b;
    }
    public static JButton warningButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setForeground(TEXT_PRIMARY);
        colorButton(b, WARNING, new Color(255, 180, 0));
        return b;
    }
    public static JButton outlineButton(String text) {
        JButton b = new JButton(text);
        b.setFont(FONT_BUTTON);
        b.setBackground(CARD_BG);
        b.setForeground(TEXT_PRIMARY);
        b.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(9, 20, 9, 20)));
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        final Color[] saved = { CARD_BG, BORDER };
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                b.setBackground(BORDER_LIGHT);
                b.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(PRIMARY, 1),
                    BorderFactory.createEmptyBorder(9, 20, 9, 20)));
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
                b.setBackground(saved[0]);
                b.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(saved[1], 1),
                    BorderFactory.createEmptyBorder(9, 20, 9, 20)));
            }
        });
        return b;
    }
    private static void colorButton(JButton b, Color normal, Color hover) {
        b.setBackground(normal);
        b.setBorder(BorderFactory.createEmptyBorder(10, 24, 10, 24));
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setContentAreaFilled(true);
        b.setOpaque(true);
        final Color h = hover;
        final Color n = normal;
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) { b.setBackground(h); }
            public void mouseExited(java.awt.event.MouseEvent e) { b.setBackground(n); }
        });
    }

    // ── Inputs ────────────────────────────────────────────────
    public static JTextField input(int cols, String hint) {
        JTextField f = new JTextField(cols);
        f.setFont(FONT_INPUT);
        f.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(10, 12, 10, 12)));
        f.setBackground(CARD_BG);
        if (hint != null && !hint.isEmpty()) f.putClientProperty("JTextField.placeholderText", hint);
        return f;
    }
    public static JPasswordField passwordInput(int cols) {
        JPasswordField f = new JPasswordField(cols);
        f.setFont(FONT_INPUT);
        f.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(10, 12, 10, 12)));
        f.setBackground(CARD_BG);
        return f;
    }
    public static JComboBox<String> combo(String[] items) {
        JComboBox<String> c = new JComboBox<>(items);
        c.setFont(FONT_INPUT);
        c.setBackground(CARD_BG);
        c.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        return c;
    }
    public static void styleComboBox(JComboBox<?> combo) {
        combo.setFont(FONT_INPUT);
        combo.setBackground(CARD_BG);
        combo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
    }

    // ── Labels ────────────────────────────────────────────────
    public static JLabel lbl(String text) { return lbl(text, FONT_BODY); }
    public static JLabel lbl(String text, Font font) {
        JLabel l = new JLabel(text);
        l.setFont(font);
        l.setForeground(TEXT_PRIMARY);
        return l;
    }
    public static JLabel muted(String text) {
        JLabel l = new JLabel(text);
        l.setFont(FONT_SMALL);
        l.setForeground(TEXT_SECONDARY);
        return l;
    }

    // ── Card ──────────────────────────────────────────────────
    public static JPanel card() {
        JPanel p = new JPanel(new BorderLayout()) {
            @Override protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(CARD_BG);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
                g2.setColor(BORDER);
                g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 8, 8);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        p.setOpaque(false);
        p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        return p;
    }

    // ── Date / DateTime Pickers ───────────────────────────────
    public static JSpinner datePicker() {
        return datePicker(null);
    }

    public static JSpinner datePicker(Date initial) {
        Date val = initial != null ? initial : new Date();
        JSpinner spinner = new JSpinner(new SpinnerDateModel(val, null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "yyyy-MM-dd");
        JTextField tf = editor.getTextField();
        tf.setFont(FONT_INPUT);
        tf.setForeground(TEXT_PRIMARY);
        tf.setBackground(CARD_BG);
        tf.setCaretColor(PRIMARY);
        tf.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        spinner.setEditor(editor);
        return spinner;
    }

    public static JSpinner dateTimePicker() {
        return dateTimePicker(null);
    }

    public static JSpinner dateTimePicker(Date initial) {
        Date val = initial != null ? initial : new Date();
        JSpinner spinner = new JSpinner(new SpinnerDateModel(val, null, null, Calendar.MINUTE));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "yyyy-MM-dd HH:mm");
        JTextField tf = editor.getTextField();
        tf.setFont(FONT_INPUT);
        tf.setForeground(TEXT_PRIMARY);
        tf.setBackground(CARD_BG);
        tf.setCaretColor(PRIMARY);
        tf.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER, 1),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        spinner.setEditor(editor);
        return spinner;
    }

    // ── Table ─────────────────────────────────────────────────
    public static void styleTable(JTable table) {
        table.setFont(FONT_BODY);
        table.setRowHeight(34);
        table.setSelectionBackground(SECONDARY_LIGHT);
        table.setSelectionForeground(TEXT_PRIMARY);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(false);
        table.setGridColor(BORDER_LIGHT);
        table.setIntercellSpacing(new Dimension(0, 1));
        JTableHeader h = table.getTableHeader();
        h.setFont(FONT_SMALL_BOLD);
        h.setBackground(DARK);
        h.setForeground(CARD_BG);
        h.setPreferredSize(new Dimension(0, 38));
        h.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, BORDER));
    }
}
