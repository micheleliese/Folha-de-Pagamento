
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import java.text.DecimalFormat;
import javax.swing.text.MaskFormatter;

/*
    Obtenha o valor para a variável HT (horas trabalhadas no mês); 
    Obtenha o valor para a variável VH (valor hora trabalhada): 
    Obtenha o valor para a variável PD (percentual de desconto); 
    Calcule o salário bruto => SB = HT * VH; 
    Calcule o total de desconto => TD = (PD/100)*SB; 
    Calcule o salário líquido => SL = SB – TD; 
    Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário Liquido. 
 */
 // @author Michele Liese

public class Exe2Tela extends javax.swing.JFrame {
    int HT = 0;
    float VH = 0;
    float PD = 0;
    float SB = 0;
    float SL = 0;
    float TD = 0;
        DecimalFormat fv = new DecimalFormat("###,##0.00");
        
    public Exe2Tela() {
        initComponents();
        //jFInsereHT.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jFInsereVH.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jFInserePD.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPainelPrincipal = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLHT = new javax.swing.JLabel();
        jLVH = new javax.swing.JLabel();
        jLPD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLTítuloHome = new javax.swing.JLabel();
        jBHome = new javax.swing.JButton();
        jFInsereHT = new javax.swing.JTextField();
        jFInsereVH = new javax.swing.JTextField();
        jFInserePD = new javax.swing.JTextField();
        jPanelFolhaPag = new javax.swing.JPanel();
        jPFP = new javax.swing.JPanel();
        jLTítuloFP1 = new javax.swing.JLabel();
        jLHorasTrabFP = new javax.swing.JLabel();
        jLDescFP = new javax.swing.JLabel();
        jLSalBrutoFP = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLsalLiquidFdP = new javax.swing.JLabel();
        jLImagemFP = new javax.swing.JLabel();
        jLHorasTrabaFDP = new javax.swing.JLabel();
        jLTotalDescTR = new javax.swing.JLabel();
        jLSalarioBrutoTR = new javax.swing.JLabel();
        jPanelCalcPag = new javax.swing.JPanel();
        jPCP = new javax.swing.JPanel();
        jLTítuloFP = new javax.swing.JLabel();
        jPSalLiquidoCFP = new javax.swing.JPanel();
        jLCalculandoSalLiq = new javax.swing.JLabel();
        jFresultsalLiq = new javax.swing.JFormattedTextField();
        jPSalBrutoCFP = new javax.swing.JPanel();
        jLCalculandoSalBruto = new javax.swing.JLabel();
        jFresultsalBruto = new javax.swing.JFormattedTextField();
        jPDescontosCFP = new javax.swing.JPanel();
        jLCalculandoDesc = new javax.swing.JLabel();
        jFresultDesc = new javax.swing.JFormattedTextField();
        jLImagemCFP = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jHome = new javax.swing.JMenu();
        jFolhaPag = new javax.swing.JMenu();
        jCalcFolhaPAG = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jLabel3.setText("jLabel3");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPainelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelHome.setBackground(new java.awt.Color(204, 204, 204));

        jLHT.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLHT.setForeground(new java.awt.Color(0, 51, 51));
        jLHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHT.setText("Horas Trabalhadas no Mês");
        jLHT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jLVH.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLVH.setForeground(new java.awt.Color(0, 51, 51));
        jLVH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLVH.setText("Valor p/ hora trabalhada");
        jLVH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jLPD.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLPD.setForeground(new java.awt.Color(0, 51, 51));
        jLPD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPD.setText("Percentual de Desconto");
        jLPD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLTítuloHome.setBackground(new java.awt.Color(0, 51, 102));
        jLTítuloHome.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLTítuloHome.setForeground(new java.awt.Color(255, 255, 255));
        jLTítuloHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTítuloHome.setText("PORTAL FUNCIONARIO");
        jLTítuloHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        jBHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNC.png"))); // NOI18N
        jBHome.setToolTipText("Click para Calcular");
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });

        jFInsereHT.setBackground(new java.awt.Color(0, 102, 102));
        jFInsereHT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFInsereHT.setForeground(new java.awt.Color(255, 255, 255));
        jFInsereHT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jFInsereVH.setBackground(new java.awt.Color(0, 102, 102));
        jFInsereVH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFInsereVH.setForeground(new java.awt.Color(255, 255, 255));
        jFInsereVH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jFInserePD.setBackground(new java.awt.Color(0, 102, 102));
        jFInserePD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFInserePD.setForeground(new java.awt.Color(255, 255, 255));
        jFInserePD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLHT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVH, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFInsereHT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFInsereVH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFInserePD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLHT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFInsereHT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLVH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFInsereVH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFInserePD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        jPainelPrincipal.add(jPanelHome, "cardhome");

        jPFP.setBackground(new java.awt.Color(0, 102, 102));

        jLTítuloFP1.setBackground(new java.awt.Color(0, 51, 102));
        jLTítuloFP1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLTítuloFP1.setForeground(new java.awt.Color(255, 255, 255));
        jLTítuloFP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTítuloFP1.setText("TOTAL A RECEBER");
        jLTítuloFP1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));

        javax.swing.GroupLayout jPFPLayout = new javax.swing.GroupLayout(jPFP);
        jPFP.setLayout(jPFPLayout);
        jPFPLayout.setHorizontalGroup(
            jPFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloFP1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPFPLayout.setVerticalGroup(
            jPFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloFP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        jLHorasTrabFP.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLHorasTrabFP.setForeground(new java.awt.Color(0, 51, 51));
        jLHorasTrabFP.setText("HORAS TRABALHADAS   ---------------------------------------------------------------------------------------------------------------");

        jLDescFP.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLDescFP.setForeground(new java.awt.Color(0, 51, 51));
        jLDescFP.setText("TOTAL DE DESCONTOS ---------------------------------------------------------------------------------------------------------------");

        jLSalBrutoFP.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLSalBrutoFP.setForeground(new java.awt.Color(0, 51, 51));
        jLSalBrutoFP.setText("SALARIO BRUTO              ---------------------------------------------------------------------------------------------------------------");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Salário Líquido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLsalLiquidFdP.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLsalLiquidFdP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLsalLiquidFdP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLsalLiquidFdP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLsalLiquidFdP, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLImagemFP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagemsalpag.jpg"))); // NOI18N

        jLHorasTrabaFDP.setBackground(new java.awt.Color(153, 153, 153));
        jLHorasTrabaFDP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLTotalDescTR.setBackground(new java.awt.Color(153, 153, 153));
        jLTotalDescTR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLSalarioBrutoTR.setBackground(new java.awt.Color(153, 153, 153));
        jLSalarioBrutoTR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanelFolhaPagLayout = new javax.swing.GroupLayout(jPanelFolhaPag);
        jPanelFolhaPag.setLayout(jPanelFolhaPagLayout);
        jPanelFolhaPagLayout.setHorizontalGroup(
            jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFolhaPagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFolhaPagLayout.createSequentialGroup()
                        .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFolhaPagLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLImagemFP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFolhaPagLayout.createSequentialGroup()
                                .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLDescFP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLSalBrutoFP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLHorasTrabFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLSalarioBrutoTR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLTotalDescTR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLHorasTrabaFDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelFolhaPagLayout.setVerticalGroup(
            jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFolhaPagLayout.createSequentialGroup()
                .addComponent(jPFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLImagemFP)
                .addGap(23, 23, 23)
                .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLHorasTrabFP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHorasTrabaFDP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSalBrutoFP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSalarioBrutoTR, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFolhaPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTotalDescTR, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDescFP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPainelPrincipal.add(jPanelFolhaPag, "cardfp");

        jPCP.setBackground(new java.awt.Color(0, 102, 102));

        jLTítuloFP.setBackground(new java.awt.Color(0, 51, 102));
        jLTítuloFP.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLTítuloFP.setForeground(new java.awt.Color(255, 255, 255));
        jLTítuloFP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTítuloFP.setText("CONTRACHEQUE");
        jLTítuloFP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));

        javax.swing.GroupLayout jPCPLayout = new javax.swing.GroupLayout(jPCP);
        jPCP.setLayout(jPCPLayout);
        jPCPLayout.setHorizontalGroup(
            jPCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloFP, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPCPLayout.setVerticalGroup(
            jPCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTítuloFP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        jPSalLiquidoCFP.setBackground(new java.awt.Color(204, 204, 204));
        jPSalLiquidoCFP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Salário Líquido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jFresultsalLiq.setEditable(false);
        jFresultsalLiq.setBorder(null);
        jFresultsalLiq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFresultsalLiq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFresultsalLiq.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPSalLiquidoCFPLayout = new javax.swing.GroupLayout(jPSalLiquidoCFP);
        jPSalLiquidoCFP.setLayout(jPSalLiquidoCFPLayout);
        jPSalLiquidoCFPLayout.setHorizontalGroup(
            jPSalLiquidoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalLiquidoCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCalculandoSalLiq, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jFresultsalLiq, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPSalLiquidoCFPLayout.setVerticalGroup(
            jPSalLiquidoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSalLiquidoCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSalLiquidoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFresultsalLiq)
                    .addComponent(jLCalculandoSalLiq, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPSalBrutoCFP.setBackground(new java.awt.Color(204, 204, 204));
        jPSalBrutoCFP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Salário Bruto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jFresultsalBruto.setEditable(false);
        jFresultsalBruto.setBorder(null);
        jFresultsalBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFresultsalBruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFresultsalBruto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPSalBrutoCFPLayout = new javax.swing.GroupLayout(jPSalBrutoCFP);
        jPSalBrutoCFP.setLayout(jPSalBrutoCFPLayout);
        jPSalBrutoCFPLayout.setHorizontalGroup(
            jPSalBrutoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalBrutoCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCalculandoSalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jFresultsalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPSalBrutoCFPLayout.setVerticalGroup(
            jPSalBrutoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPSalBrutoCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSalBrutoCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFresultsalBruto)
                    .addComponent(jLCalculandoSalBruto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPDescontosCFP.setBackground(new java.awt.Color(204, 204, 204));
        jPDescontosCFP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Descontos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLCalculandoDesc.setBackground(new java.awt.Color(153, 153, 153));

        jFresultDesc.setEditable(false);
        jFresultDesc.setBorder(null);
        jFresultDesc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFresultDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFresultDesc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPDescontosCFPLayout = new javax.swing.GroupLayout(jPDescontosCFP);
        jPDescontosCFP.setLayout(jPDescontosCFPLayout);
        jPDescontosCFPLayout.setHorizontalGroup(
            jPDescontosCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDescontosCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCalculandoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jFresultDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPDescontosCFPLayout.setVerticalGroup(
            jPDescontosCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDescontosCFPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDescontosCFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCalculandoDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jFresultDesc))
                .addContainerGap())
        );

        jLImagemCFP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gnucash-icon-256x256.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCalcPagLayout = new javax.swing.GroupLayout(jPanelCalcPag);
        jPanelCalcPag.setLayout(jPanelCalcPagLayout);
        jPanelCalcPagLayout.setHorizontalGroup(
            jPanelCalcPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCalcPagLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCalcPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPSalBrutoCFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPSalLiquidoCFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDescontosCFP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLImagemCFP, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCalcPagLayout.setVerticalGroup(
            jPanelCalcPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalcPagLayout.createSequentialGroup()
                .addComponent(jPCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanelCalcPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCalcPagLayout.createSequentialGroup()
                        .addComponent(jPDescontosCFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPSalLiquidoCFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPSalBrutoCFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLImagemCFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPainelPrincipal.add(jPanelCalcPag, "cardcp");

        jHome.setText("Home");
        jHome.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jHome.setPreferredSize(new java.awt.Dimension(230, 19));
        jHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHomeMouseClicked(evt);
            }
        });
        jMenu.add(jHome);

        jFolhaPag.setText("Folha de Pagamento");
        jFolhaPag.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jFolhaPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFolhaPag.setPreferredSize(new java.awt.Dimension(230, 19));
        jFolhaPag.setRequestFocusEnabled(false);
        jFolhaPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFolhaPagMouseClicked(evt);
            }
        });
        jMenu.add(jFolhaPag);

        jCalcFolhaPAG.setText("Cálculo Folha de pagamento");
        jCalcFolhaPAG.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jCalcFolhaPAG.setPreferredSize(new java.awt.Dimension(220, 19));
        jCalcFolhaPAG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalcFolhaPAGMouseClicked(evt);
            }
        });
        jMenu.add(jCalcFolhaPAG);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHomeMouseClicked
        CardLayout card = (CardLayout) jPainelPrincipal.getLayout();
        card.show(jPainelPrincipal, "cardhome");
    }//GEN-LAST:event_jHomeMouseClicked

    private void jFolhaPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFolhaPagMouseClicked
        CardLayout card = (CardLayout) jPainelPrincipal.getLayout();
        card.show(jPainelPrincipal, "cardfp");
    }//GEN-LAST:event_jFolhaPagMouseClicked

    private void jCalcFolhaPAGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalcFolhaPAGMouseClicked
        CardLayout card = (CardLayout) jPainelPrincipal.getLayout();
        card.show(jPainelPrincipal, "cardcp");
    }//GEN-LAST:event_jCalcFolhaPAGMouseClicked

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
       HT = Integer.parseInt(jFInsereHT.getText());
       VH = Float.parseFloat(jFInsereVH.getText());
       PD = Float.parseFloat(jFInserePD.getText());
       
       SB = HT * VH;     //Salário Bruto
       TD = (PD/100)*SB; //Total de desconto
       SL = SB - TD;     //Salário Líquido
       
       jLCalculandoDesc.setText("TD = " + "(" + PD + "/" + "100" + ") *" + SB);
       jLCalculandoSalLiq.setText("SL = " + SB + " - " + TD);
       jLCalculandoSalBruto.setText("SB = " + HT + " * " + VH);
       jFresultDesc.setText(fv.format(TD));
       jFresultsalLiq.setText(fv.format(SL));
       jFresultsalBruto.setText(fv.format(SB));
       
       jLHorasTrabaFDP.setText(String.valueOf(HT));
       jLSalarioBrutoTR.setText(fv.format(SB));
       jLTotalDescTR.setText(fv.format(TD));
       jLsalLiquidFdP.setText(fv.format(SL));
    }//GEN-LAST:event_jBHomeActionPerformed

    public static void main(String args[]) {
       //<editor-fold> LOOK AND FEEL
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exe2Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exe2Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exe2Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exe2Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exe2Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBHome;
    private javax.swing.JMenu jCalcFolhaPAG;
    private javax.swing.JTextField jFInsereHT;
    private javax.swing.JTextField jFInserePD;
    private javax.swing.JTextField jFInsereVH;
    private javax.swing.JMenu jFolhaPag;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFresultDesc;
    private javax.swing.JFormattedTextField jFresultsalBruto;
    private javax.swing.JFormattedTextField jFresultsalLiq;
    private javax.swing.JMenu jHome;
    private javax.swing.JLabel jLCalculandoDesc;
    private javax.swing.JLabel jLCalculandoSalBruto;
    private javax.swing.JLabel jLCalculandoSalLiq;
    private javax.swing.JLabel jLDescFP;
    private javax.swing.JLabel jLHT;
    private javax.swing.JLabel jLHorasTrabFP;
    private javax.swing.JLabel jLHorasTrabaFDP;
    private javax.swing.JLabel jLImagemCFP;
    private javax.swing.JLabel jLImagemFP;
    private javax.swing.JLabel jLPD;
    private javax.swing.JLabel jLSalBrutoFP;
    private javax.swing.JLabel jLSalarioBrutoTR;
    private javax.swing.JLabel jLTotalDescTR;
    private javax.swing.JLabel jLTítuloFP;
    private javax.swing.JLabel jLTítuloFP1;
    private javax.swing.JLabel jLTítuloHome;
    private javax.swing.JLabel jLVH;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLsalLiquidFdP;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPCP;
    private javax.swing.JPanel jPDescontosCFP;
    private javax.swing.JPanel jPFP;
    private javax.swing.JPanel jPSalBrutoCFP;
    private javax.swing.JPanel jPSalLiquidoCFP;
    private javax.swing.JPanel jPainelPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCalcPag;
    private javax.swing.JPanel jPanelFolhaPag;
    private javax.swing.JPanel jPanelHome;
    // End of variables declaration//GEN-END:variables
}
