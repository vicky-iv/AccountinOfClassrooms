import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
class MainForm extends javax.swing.JFrame {
    // Variables declaration - do not modify
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeleteCancel;
    private javax.swing.JButton jButtonDeleteOk;
    private javax.swing.JButton jButtonEditCancel;
    private javax.swing.JButton jButtonEditOk;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonViewAll;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxFunctional;
    private javax.swing.JComboBox<String> jComboBoxNumber;
    private javax.swing.JComboBox<String> jComboBoxSeats;
    private javax.swing.JComboBox<String> jComboBoxSelectNumber;
    private javax.swing.JComboBox<String> jComboBoxSoftware;
    private javax.swing.JDialog jDialogAddClass;
    private javax.swing.JDialog jDialogDeleteClass;
    private javax.swing.JDialog jDialogEditClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFunctional;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelSeats;
    private javax.swing.JLabel jLabelSoftware;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemAdd;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemEdit;
    private javax.swing.JMenuItem jMenuItemPrint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDB;
    private javax.swing.JPanel jPanelFilters;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableTaSamaya;
    private javax.swing.JTextArea jTextAreaEditSoftware;
    private javax.swing.JTextArea jTextAreaSoftware;
    private javax.swing.JTextField jTextFieldEditFunctional;
    private javax.swing.JTextField jTextFieldEditSeats;
    private javax.swing.JTextField jTextFieldFunctional;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldSeats;

    public ArrayList<DataTable> dt=new ArrayList<>();
    public DataAnalyzer da=new DataAnalyzer();
    // End of variables declaration

    /**
     * Creates new form MainForm
     */
    public MainForm() throws Exception {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws SQLException {
        try {
            dt= da.dataUpd();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        java.awt.GridBagConstraints gridBagConstraints;

        jDialogAddClass = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jTextFieldSeats = new javax.swing.JTextField();
        jTextFieldFunctional = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSoftware = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jDialogDeleteClass = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonDeleteOk = new javax.swing.JButton();
        jButtonDeleteCancel = new javax.swing.JButton();
        jDialogEditClass = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSelectNumber = new javax.swing.JComboBox<>();
        jButtonFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEditSeats = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEditFunctional = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonEditOk = new javax.swing.JButton();
        jButtonEditCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaEditSoftware = new javax.swing.JTextArea();
        jPanelSearch = new javax.swing.JPanel();
        jPanelFilters = new javax.swing.JPanel();
        jLabelNumber = new javax.swing.JLabel();
        jLabelFunctional = new javax.swing.JLabel();
        jLabelSoftware = new javax.swing.JLabel();
        jLabelSeats = new javax.swing.JLabel();
        jComboBoxFunctional = new javax.swing.JComboBox<>();
        jComboBoxSoftware = new javax.swing.JComboBox<>();
        jComboBoxSeats = new javax.swing.JComboBox<>();
        jComboBoxNumber = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonSearch = new javax.swing.JButton();
        jButtonViewAll = new javax.swing.JButton();
        jPanelDB = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemPrint = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemAdd = new javax.swing.JMenuItem();
        jMenuItemDelete = new javax.swing.JMenuItem();
        jMenuItemEdit = new javax.swing.JMenuItem();

        jDialogAddClass.setTitle("Добавить аудиторию");
        jDialogAddClass.setName("Добавить аудиторию"); // NOI18N
        jDialogAddClass.setPreferredSize(new java.awt.Dimension(356, 400));
        jDialogAddClass.setMinimumSize(new java.awt.Dimension(400, 410));
        jDialogAddClass.getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Количество посадочных мест:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Функциональное назначение:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Установленное ПО:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 17, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        jTextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 55, 0, 55);
        jPanel2.add(jTextFieldNumber, gridBagConstraints);

        jTextFieldSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSeatsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 55, 0, 55);
        jPanel2.add(jTextFieldSeats, gridBagConstraints);

        jTextFieldFunctional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunctionalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 55, 0, 55);
        jPanel2.add(jTextFieldFunctional, gridBagConstraints);

        jTextAreaSoftware.setColumns(20);
        jTextAreaSoftware.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSoftware);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 203;
        gridBagConstraints.ipady = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 55, 6, 55);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jLabel1.setText("Номер аудитории:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 15, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jButtonOk.setText("Ок");
        jButtonOk.setPreferredSize(new java.awt.Dimension(45, 50));
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 50);
        jPanel2.add(jButtonOk, gridBagConstraints);

        jButtonCancel.setText("Отмена");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 98);
        jPanel2.add(jButtonCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jDialogAddClass.getContentPane().add(jPanel2, gridBagConstraints);

        jDialogDeleteClass.setName("Удаление аудитории"); // NOI18N
        jDialogDeleteClass.getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Выберите номер аудитории:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 12);
        jPanel3.add(jLabel2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 32, 0, 0);
        jPanel3.add(jComboBox1, gridBagConstraints);

        jButtonDeleteOk.setText("Ок");
        jButtonDeleteOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 15, 12, 0);
        jPanel3.add(jButtonDeleteOk, gridBagConstraints);

        jButtonDeleteCancel.setText("Отмена");
        jButtonDeleteCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 0);
        jPanel3.add(jButtonDeleteCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jDialogDeleteClass.getContentPane().add(jPanel3, gridBagConstraints);

        jDialogEditClass.setMinimumSize(new java.awt.Dimension(320, 470));
        jDialogEditClass.getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Выберите номер аудитории:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jComboBoxSelectNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]/*TODO загони сюда номера аудиторий из бд*/ { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSelectNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectNumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel4.add(jComboBoxSelectNumber, gridBagConstraints);

        jButtonFind.setText("Найти");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 13, 0, 0);
        jPanel4.add(jButtonFind, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 247;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        jPanel4.add(jSeparator1, gridBagConstraints);

        jLabel4.setText("Количество посадочных мест:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);

        jTextFieldEditSeats.setText("jTextField1");
        jTextFieldEditSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditSeatsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 0, 19);
        jPanel4.add(jTextFieldEditSeats, gridBagConstraints);

        jLabel5.setText("Функциональное назначение:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel4.add(jLabel5, gridBagConstraints);

        jTextFieldEditFunctional.setText("jTextField2");
        jTextFieldEditFunctional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditFunctionalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 209;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 0, 19);
        jPanel4.add(jTextFieldEditFunctional, gridBagConstraints);

        jLabel9.setText("Установленное ПО:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel4.add(jLabel9, gridBagConstraints);

        jButtonEditOk.setText("Применить");
        jButtonEditOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 0);
        jPanel4.add(jButtonEditOk, gridBagConstraints);

        jButtonEditCancel.setText("Отмена");
        jButtonEditCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 0);
        jPanel4.add(jButtonEditCancel, gridBagConstraints);

        jTextAreaEditSoftware.setColumns(20);
        jTextAreaEditSoftware.setRows(5);
        jScrollPane3.setViewportView(jTextAreaEditSoftware);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 19, 8, 19);
        jPanel4.add(jScrollPane3, gridBagConstraints);

        jDialogEditClass.getContentPane().add(jPanel4, new java.awt.GridBagConstraints());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accountin of classrooms ");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelSearch.setLayout(new java.awt.GridBagLayout());

        jPanelFilters.setLayout(new java.awt.GridBagLayout());

        jLabelNumber.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabelNumber.setText("Номер аудитории:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelFilters.add(jLabelNumber, gridBagConstraints);

        jLabelFunctional.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabelFunctional.setText("Функц. назначение:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelFilters.add(jLabelFunctional, gridBagConstraints);

        jLabelSoftware.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabelSoftware.setText("Установленное ПО:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelFilters.add(jLabelSoftware, gridBagConstraints);

        jLabelSeats.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabelSeats.setText("Количество мест:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelFilters.add(jLabelSeats, gridBagConstraints);

        jComboBoxFunctional.setModel(new javax.swing.DefaultComboBoxModel(new String[]/*TODO загони сюда функционал аудиторий из бд*/ { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanelFilters.add(jComboBoxFunctional, gridBagConstraints);

        jComboBoxSoftware.setModel(new javax.swing.DefaultComboBoxModel(new String[] /*TODO загони сюда ПО аудиторий из бд*/ { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanelFilters.add(jComboBoxSoftware, gridBagConstraints);

        jComboBoxSeats.setModel(new javax.swing.DefaultComboBoxModel(new String[] /*TODO загони сюда количество мест в аудиториях из бд*/ { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanelFilters.add(jComboBoxSeats, gridBagConstraints);

        jComboBoxNumber.setModel(new javax.swing.DefaultComboBoxModel(new String[] /*TODO загони сюда номера аудиторий из бд*/ { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        jPanelFilters.add(jComboBoxNumber, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        jPanelSearch.add(jPanelFilters, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButtonSearch.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jButtonSearch.setText("Поиск");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        jPanel1.add(jButtonSearch, gridBagConstraints);

        jButtonViewAll.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jButtonViewAll.setText("Показать все");
        jButtonViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 383, 0, 0);
        jPanel1.add(jButtonViewAll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        jPanelSearch.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanelSearch, gridBagConstraints);

        jPanelDB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelDB.setAutoscrolls(true);
        jPanelDB.setLayout(new java.awt.GridBagLayout());

        //КОСТЫЛЬ
        String[][]datAr=new String[dt.size()][4];
        for(int i=0;i< datAr.length;i++){
            datAr[i][0]=dt.get(i).audN;
            datAr[i][1]=dt.get(i).plN;
            datAr[i][2]=dt.get(i).funcAud;
            datAr[i][3]=dt.get(i).po;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                datAr,
                new String [] {
                        "Номер удитории", "Количество посадочных мест", "Функциональное назначение", "Установленное программное обеспечение"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setRowHeight(18);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanelDB.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(jPanelDB, gridBagConstraints);

        jMenuFile.setText("Файл");
        jMenuFile.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItemPrint.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jMenuItemPrint.setText("Печать");
        jMenuItemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrintActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemPrint);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Редактирование списка");
        jMenuEdit.setBorderPainted(false);
        jMenuEdit.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItemAdd.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jMenuItemAdd.setText("Добавить аудиторию");
        jMenuItemAdd.setBorderPainted(false);
        jMenuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemAdd);

        jMenuItemDelete.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jMenuItemDelete.setText("Удалить");
        jMenuItemDelete.setBorderPainted(false);
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemDelete);

        jMenuItemEdit.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jMenuItemEdit.setText("Редактировать");
        jMenuItemEdit.setBorderPainted(false);
        jMenuItemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemEdit);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>

    private void jMenuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItemAddActionPerformed(java.awt.event.ActionEvent evt) {
        jDialogAddClass.setVisible(true);
    }

    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        //jDialogDeleteClass.setVisible(true);
        Object[] numbersOfClassrooms={"1","2","3"};//TODO массив с номерами аудиторий из бд, для выбора удаляемой
        String numberForDel = (String) JOptionPane.showInputDialog(this,
                "Выберите номер аудитории, \n"+"которую необходимо удалить:",
                "Удаление аудитории", JOptionPane.PLAIN_MESSAGE,
                null, numbersOfClassrooms,numbersOfClassrooms[0]);
        if ((numberForDel != null) && (numberForDel.length() > 0)) {
            //TODO манипуляции по удалению аудитории numberForDel из бд
            return;
        }
    }

    private void jMenuItemEditActionPerformed(java.awt.event.ActionEvent evt) {
        jDialogEditClass.setVisible(true);
    }

    private void jButtonViewAllActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO высветить все аудитории(SELECT *)
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO высветить аудитории по фильтрам
    }

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO считываешь значения полей jDialogAddClass и добавляешь в БД новую аудиторию

        jDialogAddClass.setVisible(false);
    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        jDialogAddClass.setVisible(false);
    }

    private void jTextFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldSeatsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldFunctionalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonDeleteOkActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonDeleteCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBoxSelectNumberActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO находишь аудиторию по номеру из поля jComboBoxSelectNumber и передаешь значения по аудитории соответствующим полям jTextFieldEditSeats, jTextFieldEditFunctional, jTextAreaEditSoftware
    }

    private void jTextFieldEditSeatsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldEditFunctionalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonEditOkActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO редактируешь аудиторию по номеру из поля jComboBoxSelectNumber и передаешь значения по аудитории в бд из соответствующих полей jTextFieldEditSeats, jTextFieldEditFunctional, jTextAreaEditSoftware

    }

    private void jButtonEditCancelActionPerformed(java.awt.event.ActionEvent evt) {
        jDialogEditClass.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainForm().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
