package CONTROLLER;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXToggleButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.dialog.FontSelectorDialog;

public class MAINController implements Initializable {

    // <editor-fold defaultstate="collapsed" desc=" JAVAFX COMPONENTS IMPORT ">
    @FXML
    private JFXButton btnOutputPANE;
    @FXML
    private JFXButton btnInputPANE;
    @FXML
    private Pane paneINPUT;
    @FXML
    private JFXToggleButton btnToggle1;
    @FXML
    private JFXToggleButton btnToggle2;
    @FXML
    private JFXToggleButton btnToggle3;
    @FXML
    private FontAwesomeIcon exitBTN;
    @FXML
    private Pane paneOUTPUT;
    @FXML
    private TableView<MAINdata> resultTABLE;
    @FXML
    private TableColumn<MAINdata, String> column1;
    @FXML
    private TableColumn<MAINdata, String> column2;
    @FXML
    private TableColumn<MAINdata, String> column3;
    @FXML
    private TableColumn<MAINdata, String> column4;
    @FXML
    private TableColumn<MAINdata, String> column5;
    @FXML
    private TableColumn<MAINdata, String> column6;
    @FXML
    private TableColumn<MAINdata, String> column7;
    @FXML
    private TableColumn<MAINdata, String> column8;
    @FXML
    private TableColumn<MAINdata, String> column9;
    @FXML
    private JFXButton btnRESET;
    @FXML
    private JFXTextArea textAREA;
    @FXML
    private JFXButton btnCALCULATE;
    private Label totalLBL;
    @FXML
    private TableColumn<MAINdata, String> column10;
    @FXML
    private TableColumn<MAINdata, String> column11;
    @FXML
    private TableColumn<MAINdata, String> column12;
    @FXML
    private TableColumn<MAINdata, String> column13;
    @FXML
    private JFXButton btnSETTINGS;
    @FXML
    private Pane paneSETTINGS;
    @FXML
    private JFXCheckBox checkBOX1;
    @FXML
    private JFXButton btnFONTINIT;
    @FXML
    private JFXButton btnRESETSETTINGS;
    @FXML
    private JFXButton btnLOGS;
    @FXML
    private Pane paneLOGS;
    @FXML
    private TextArea textLOG;
    
// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc=" LAUNCH PROGRAM ">
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        paneINPUT.setVisible(true);
        paneOUTPUT.setVisible(false);
        paneSETTINGS.setVisible(false);
        paneLOGS.setVisible(false);
        exitBTN.toFront();
        loadLOGS();
        textLOG.positionCaret(0);
        
    }

// </editor-fold>    

    // <editor-fold defaultstate="collapsed" desc=" SWITCH BETWEEN PANES ">
    @FXML
    private void btnOutputPANEfunc(ActionEvent event) {
        
        paneOUTPUT.setVisible(true);
        paneOUTPUT.toFront();
        paneINPUT.setVisible(false);
        paneSETTINGS.setVisible(false);
        paneLOGS.setVisible(false);
        exitBTN.toFront();
        
    }
    
    @FXML
    private void btnInputPANEfunc(ActionEvent event) {
        
        paneINPUT.setVisible(true);
        paneINPUT.toFront();
        paneOUTPUT.setVisible(false);
        paneSETTINGS.setVisible(false);
        paneLOGS.setVisible(false);
        exitBTN.toFront();
        
    }
    
    @FXML
    private void btnSETTINGSfunc(ActionEvent event) {
        
        paneSETTINGS.setVisible(true);
        paneSETTINGS.toFront();
        paneOUTPUT.setVisible(false);
        paneINPUT.setVisible(false);
        paneLOGS.setVisible(false);
        exitBTN.toFront();
        
    }
    
    @FXML
    private void btnLOGSfunc(ActionEvent event) {
        
        paneLOGS.setVisible(true);
        paneLOGS.toFront();
        paneOUTPUT.setVisible(false);
        paneINPUT.setVisible(false);
        paneSETTINGS.setVisible(false);
        exitBTN.toFront();
        
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" UI CONTROLS ">
    
    // <editor-fold defaultstate="collapsed" desc=" HIDE COLUMN 1 ">
    
    @FXML
    private void btnToggle1func(ActionEvent event) {
        
        if (btnToggle1.isSelected()) {
            
            column4.setVisible(true);
            column10.setVisible(true);
            
        } else {
            
            column4.setVisible(false);
            column10.setVisible(false);
            
        }
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" HIDE COLUMN 2 ">
    
    @FXML
    private void btnToggle2func(ActionEvent event) {
        
        if (btnToggle2.isSelected()) {
            
            column5.setVisible(true);
            column11.setVisible(true);
            
        } else {
            
            column5.setVisible(false);
            column11.setVisible(false);
            
        }
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" HIDE COLUMN 3 ">
    
    @FXML
    private void btnToggle3func(ActionEvent event) {
        
        if (btnToggle3.isSelected()) {
            
            column6.setVisible(true);
            column12.setVisible(true);
            
        } else {
            
            column6.setVisible(false);
            column12.setVisible(false);
            
        }
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" EXIT PROGRAM ">
    
    @FXML
    private void exitBTNfunc(MouseEvent event) {
        
        System.exit(0);
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" RESET ITEMS ">
    
    @FXML
    private void btnRESETfunc(ActionEvent event) {
        
        textAREA.clear();
        resultTABLE.getItems().clear();
        processDONE();
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" CALCULATE CODE ">
    @FXML
    private void btnCALCULATEfunc(ActionEvent event) {
        
        try {
            
            calculateDATA();
            
        } catch (Exception e) {
            
            processERROR();
            
        }
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" FONT SELECTION ">
    
    @FXML
    private void btnFONTINITfunc(ActionEvent event) {
        
        try {
            
            fontSELECT();
            
        } catch (Exception e) {
            
            processERROR();
            
        }
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" RESET SETTINGS ">
    
    @FXML
    private void btnRESETSETTINGSfunc(ActionEvent event) {
        
        resetSETTINGS();
        processDONE();
        
    }

// </editor-fold>

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" DATA CALCULATION ">
    
    public void calculateDATA() {
        
    // <editor-fold defaultstate="collapsed" desc=" INITIALIZATION OF VARIABLES ">
    
        // <editor-fold defaultstate="collapsed" desc=" INITIALIZE INT VARIABLES ">
        
        int datTicks = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int mIn = 0;
        int mOut = 0;
        int maxIn = 0;
        int maxOut = 0;
        int mInElec = 0;
        int maxInElec = 0;
        int mOutElec = 0;
        int maxOutElec = 0;
        int mOutBonus = 0;
        int maxOutBonus = 0;

// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" INITIALIZE FLOAT VARIABLES ">
        
        float[] totalAvgIn = new float[50];
        float[] totalAvgOut = new float[50];
        float[] totalAvgInElec = new float[50];
        float[] totalAvgOutElec = new float[50];
        float[] totalAvgOutBonus = new float[50];

// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" INITIALIZE STRING VARIABLES ">
        
        String strRule = textAREA.getText();
        String[] strTemp = strRule.split("[\\s,=\"]");
        String strTotalIn = "";
        String strTotalOut = "";
        String strTotalInElec = "";
        String strTotalOutElec = "";
        String strTotalOutBonus = "";
        String[] strEachTotalIn = new String[50];
        String[] strEachTotalOut = new String[50];
        String[] strEachTotalInElec = new String[50];
        String[] strEachTotalOutElec = new String[50];
        String[] strEachTotalOutBonus = new String[50];
        
        for (i = 0; i < 50; i++) {
            
            strEachTotalIn[i] = "";
            strEachTotalOut[i] = "";
            strEachTotalInElec[i] = "";
            strEachTotalOutElec[i] = "";
            strEachTotalOutBonus[i] = "";
            
        }

// </editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" INITIALIZE INT, STRING, AND ARRAY VARIABLES ">
        
        int inCtr = 1, outCtr = 1;
        String[] strEachIn = new String[50];
        
        int[] inAmnt = new int[50];
        String[] strEachOut = new String[50];
        
        int[] outAmnt = new int[50];
        Object[][] row = new Object[strTemp.length][13];
        
        int inElecCtr = 1;
        String[] strEachInElec = new String[50];
        
        int outElecCtr = 1;
        String[] strEachOutElec = new String[50];
        
        int outBonusCtr = 1;
        String[] strEachOutBonus = new String[50];
        
        int[] inElecAmnt = new int[50];
        int[] outElecAmnt = new int[50];
        int[] outBonusAmnt = new int[50];

// </editor-fold>

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" <!--"NAME"--><Rule">
    
    for (i = 0; i < strTemp.length; i++) {

        if (strTemp[i].contains("<!--")) {

            j = i + 1;

            String strName = "";

            while (!strTemp[j].contains("-->")) {

                strName = strName.concat(strTemp[j] + " ");
                j++;

            }

            row[l][0] = strName;
            j = 0;

        }

        if (strTemp[i].contains("<Rule")) {

            mIn = 0;
            mOut = 0;
            mInElec = 0;

            datTicks = 1;

        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" INPUT ">
    
        if (strTemp[i].contains("input") && !strTemp[i].contains("input_electrification_bonus")) {

            j = i + 2;

            String strIn = "";

            while (strTemp[j].length() == 8) {

                if (strTemp[j].contains(strTemp[j + 1]) && !strTemp[j + 1].isEmpty()) {

                    inCtr++;

                } else {

                    strIn = strIn.concat(rscID(strTemp[j]) + " x " + inCtr + " ");
                    row[l][1] = strIn;
                    inAmnt[mIn] = inCtr;
                    strEachIn[mIn] = rscID(strTemp[j]);
                    inCtr = 1;
                    mIn++;

                }

                j++;

            }
        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" OUTPUT ">
    
        if (strTemp[i].contains("output") && !strTemp[i].contains("output_distance_bonus") && !strTemp[i].contains("output_electrification_bonus")) {

            j = i + 2;

            String strOut = "";

            while (strTemp[j].length() == 8) {

                if (strTemp[j].contains(strTemp[j + 1]) && !strTemp[j + 1].isEmpty()) {

                    outCtr++;

                } else {

                    strOut = strOut.concat(rscID(strTemp[j]) + " x " + outCtr + " ");
                    row[l][2] = strOut;
                    outAmnt[mOut] = outCtr;
                    strEachOut[mOut] = rscID(strTemp[j]);
                    outCtr = 1;
                    mOut++;

                }

                j++;

            }
        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" INPUT ELECTRIFICATION BONUS ">
        if (strTemp[i].contains("input_electrification_bonus")) {

            j = i + 2;

            String strInElec = "";

            while (strTemp[j].length() == 8) {

                if (strTemp[j].contains(strTemp[j + 1]) && !strTemp[j + 1].isEmpty()) {

                    inElecCtr++;

                } else {

                    strInElec = strInElec.concat(rscID(strTemp[j]) + " x " + inElecCtr + " ");
                    row[l][3] = strInElec;
                    inElecAmnt[mInElec] = inElecCtr;
                    strEachInElec[mInElec] = rscID(strTemp[j]);
                    inElecCtr = 1;
                    mInElec++;

                }

                j++;
            }

        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" OUTPUT DISTANCE BONUS ">
    
        if (strTemp[i].contains("output_distance_bonus")) {

            j = i + 2;

            String strOutBonus = "";

            while (strTemp[j].length() == 8) {

                if (strTemp[j].contains(strTemp[j + 1]) && !strTemp[j + 1].isEmpty()) {

                    outCtr++;

                } else {

                    strOutBonus = strOutBonus.concat(rscID(strTemp[j]) + " x " + outBonusCtr + " ");
                    row[l][4] = strOutBonus;
                    outBonusAmnt[mOutBonus] = outBonusCtr;
                    strEachOutBonus[mOutBonus] = rscID(strTemp[j]);
                    outBonusCtr = 1;
                    mOutBonus++;

                }

                j++;
            }

        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" OUTPUT ELECTRIFICATION BONUS ">
    
        if (strTemp[i].contains("output_electrification_bonus")) {

            j = i + 2;

            String strOutElec = "";

            while (strTemp[j].length() == 8) {

                if (strTemp[j].contains(strTemp[j + 1]) && !strTemp[j + 1].isEmpty()) {

                    outElecCtr++;

                } else {

                    strOutElec = strOutElec.concat(rscID(strTemp[j]) + " x " + outElecCtr + " ");
                    row[l][5] = strOutElec;
                    outElecAmnt[mOutElec] = outElecCtr;
                    strEachOutElec[mOutElec] = rscID(strTemp[j]);
                    outElecCtr = 1;
                    mOutElec++;

                }

                j++;
            }

        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" TIME STEPS ">
    
        if (strTemp[i].contains("time_steps")) {

            datTicks = Integer.parseInt(strTemp[i + 2]);

        }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" REQUIRE EPOCHA, AVERAGE COMPUTATION ">
    
        if (strTemp[i].contains("require_epocha")) {

            j = i + 1;

            String strEpocha = "";

            while (!strTemp[j].contains("/>")) {

                strEpocha = strEpocha.concat(strTemp[j] + " ");
                j++;

            }

            row[l][12] = strEpocha;

        }

        if (strTemp[i].contains("/>")) {

            row[l][6] = datTicks;

            float inAvg = 0;
            float outAvg = 0;
            float inElecAvg = 0;
            float outElecAvg = 0;
            float outBonusAvg = 0;

            String strInAvg = "";
            String strOutAvg = "";
            String strInElecAvg = "";
            String strOutElecAvg = "";
            String strOutBonusAvg = "";

            k = 0;

            while (mIn != 0) {

                inAvg = (float) inAmnt[k] / (float) datTicks;

                strInAvg = strInAvg.concat(strEachIn[k] + " x " + String.format("%.2f", inAvg) + " ");

                if (itExist(strEachTotalIn, strEachIn[k])) {

                    for (j = 0; j < maxIn; j++) {

                        if (strEachIn[k].equals(strEachTotalIn[j])) {

                            totalAvgIn[j] += inAvg;

                        }
                    }
                } else if (!itExist(strEachTotalIn, strEachIn[k])) {

                    strEachTotalIn[maxIn] = strEachIn[k];
                    totalAvgIn[maxIn] = inAvg;
                    maxIn++;

                }

                inAmnt[k] = 0;
                strEachIn[k] = "";
                k++;
                mIn--;

            }

            k = 0;

            while (mInElec != 0) {

                inElecAvg = (float) inElecAmnt[k] / (float) datTicks;

                strInElecAvg = strInElecAvg.concat(strEachInElec[k] + " x " + String.format("%.2f", inElecAvg) + " ");

                if (itExist(strEachTotalInElec, strEachInElec[k])) {

                    for (j = 0; j < maxInElec; j++) {

                        if (strEachInElec[k].equals(strEachTotalInElec[j])) {

                            totalAvgInElec[j] += inElecAvg;

                        }
                    }
                } else if (!itExist(strEachTotalInElec, strEachInElec[k])) {

                    strEachTotalInElec[maxInElec] = strEachInElec[k];
                    totalAvgInElec[maxInElec] = inElecAvg;
                    maxInElec++;

                }

                inElecAmnt[k] = 0;
                strEachInElec[k] = "";
                k++;
                mInElec--;

            }

            while (mOutElec != 0) {

                outElecAvg = (float) outElecAmnt[k] / (float) datTicks;

                strOutElecAvg = strOutElecAvg.concat(strEachOutElec[k] + " x " + String.format("%.2f", outElecAvg) + " ");

                if (itExist(strEachTotalOutElec, strEachOutElec[k])) {

                    for (j = 0; j < maxOutElec; j++) {

                        if (strEachOutElec[k].equals(strEachTotalOutElec[j])) {

                            totalAvgOutElec[j] += outElecAvg;

                        }
                    }
                } else if (!itExist(strEachTotalOutElec, strEachOutElec[k])) {

                    strEachTotalOutElec[maxOutElec] = strEachOutElec[k];
                    totalAvgOutElec[maxOutElec] = outElecAvg;
                    maxOutElec++;

                }

                outElecAmnt[k] = 0;
                strEachOutElec[k] = "";
                k++;
                mOutElec--;

            }

            while (mOutBonus != 0) {

                outBonusAvg = (float) outBonusAmnt[k] / (float) datTicks;

                strOutBonusAvg = strOutBonusAvg.concat(strEachOutBonus[k] + " x " + String.format("%.2f", outBonusAvg) + " ");

                if (itExist(strEachTotalOutBonus, strEachOutBonus[k])) {

                    for (j = 0; j < maxOutBonus; j++) {

                        if (strEachOutBonus[k].equals(strEachTotalOutBonus[j])) {

                            totalAvgOutBonus[j] += outBonusAvg;

                        }
                    }
                } else if (!itExist(strEachTotalOutBonus, strEachOutBonus[k])) {

                    strEachTotalOutBonus[maxOutBonus] = strEachOutBonus[k];
                    totalAvgOutBonus[maxOutBonus] = outBonusAvg;
                    maxOutBonus++;

                }

                outBonusAmnt[k] = 0;
                strEachOutBonus[k] = "";
                k++;
                mOutBonus--;

            }

            k = 0;

            while (mOut != 0) {

                outAvg = (float) outAmnt[k] / (float) datTicks;

                strOutAvg = strOutAvg.concat(strEachOut[k] + " x " + String.format("%.2f", outAvg) + " ");

                if (itExist(strEachTotalOut, strEachOut[k])) {

                    for (j = 0; j < maxOut; j++) {

                        if (strEachOut[k].equals(strEachTotalOut[j])) {

                            totalAvgOut[j] += outAvg;

                        }
                    }
                } else if (!itExist(strEachTotalOut, strEachOut[k])) {

                    strEachTotalOut[maxOut] = strEachOut[k];
                    totalAvgOut[maxOut] = outAvg;
                    maxOut++;

                }

                outAmnt[k] = 0;
                strEachOut[k] = "";
                k++;
                mOut--;

            }

            row[l][7] = strInAvg;
            row[l][8] = strOutAvg;
            row[l][9] = strInElecAvg;
            row[l][10] = strOutBonusAvg;
            row[l][11] = strOutElecAvg;

            l++;
            inCtr = 1;
            outCtr = 1;

        }

    }

    for (i = 0; i < maxIn; i++) {
        
        strTotalIn = strTotalIn.concat(strEachTotalIn[i] + " x " + String.format("%.2f", totalAvgIn[i]) + " ");
        
    }
    
    for (i = 0; i < maxOut; i++) {
        
        strTotalOut = strTotalOut.concat(strEachTotalOut[i] + " x " + String.format("%.2f", totalAvgOut[i]) + " ");
        
    }
    
    for (i = 0; i < maxInElec; i++) {
        
        strTotalInElec = strTotalInElec.concat(strEachTotalInElec[i] + " x " + String.format("%.2f", totalAvgInElec[i]) + " ");
        
    }
    
    for (i = 0; i < maxOutElec; i++) {
        
        strTotalOutElec = strTotalOutElec.concat(strEachTotalOutElec[i] + " x " + String.format("%.2f", totalAvgOutElec[i]) + " ");
        
    }
    
    for (i = 0; i < maxOutBonus; i++) {
        
        strTotalOutBonus = strTotalOutBonus.concat(strEachTotalOutBonus[i] + " x " + String.format("%.2f", totalAvgOutBonus[i]) + " ");
        
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" GET VALUES FOR EACH ROWS ">
    
    String q0 = String.valueOf(Arrays.deepToString(row[0]));
    String q1 = String.valueOf(Arrays.deepToString(row[1]));
    String q2 = String.valueOf(Arrays.deepToString(row[2]));
    String q3 = String.valueOf(Arrays.deepToString(row[3]));
    String q4 = String.valueOf(Arrays.deepToString(row[4]));
    String q5 = String.valueOf(Arrays.deepToString(row[5]));
    String q6 = String.valueOf(Arrays.deepToString(row[6]));
    String q7 = String.valueOf(Arrays.deepToString(row[7]));
    String q8 = String.valueOf(Arrays.deepToString(row[8]));
    String q9 = String.valueOf(Arrays.deepToString(row[9]));
    String q10 = String.valueOf(Arrays.deepToString(row[10]));
    String q11 = String.valueOf(Arrays.deepToString(row[11]));
    String q12 = String.valueOf(Arrays.deepToString(row[12]));

    row[l][0] = q0;
    row[l][1] = q1;
    row[l][2] = q2;
    row[l][3] = q3;
    row[l][4] = q4;
    row[l][5] = q5;
    row[l][6] = q6;
    row[l][7] = q7;
    row[l][8] = q8;
    row[l][9] = q9;
    row[l][10] = q10;
    row[l][11] = q11;
    row[l][12] = q12;

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" DISPLAY TOTAL VALUES ">
    
    row[12][0] = "";
    row[12][1] = "";
    row[12][2] = "";
    row[12][3] = "";
    row[12][4] = "";
    row[12][5] = "";
    row[12][6] = "TOTAL";
    row[12][7] = strTotalIn;
    row[12][8] = strTotalOut;
    row[12][9] = strTotalInElec;
    row[12][10] = strTotalOutBonus;
    row[12][11] = strTotalOutElec;
    row[12][12] = "";

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" PASS VALUE TO MAINCONVERT(TO DISPLAYING VALUES) ">
    
    MAINconvert(row, l + 1);

// </editor-fold>

    }

// </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc=" METHODS ">
    
    public void MAINconvert(Object[][] row, int amnt) {

    // <editor-fold defaultstate="collapsed" desc=" GET VALUE ON EACH ROWS ">
        
        String q1 = Arrays.toString(row[0]);
        String q2 = Arrays.toString(row[1]);
        String q3 = Arrays.toString(row[2]);
        String q4 = Arrays.toString(row[3]);
        String q5 = Arrays.toString(row[4]);
        String q6 = Arrays.toString(row[5]);
        String q7 = Arrays.toString(row[6]);
        String q8 = Arrays.toString(row[7]);
        String q9 = Arrays.toString(row[8]);
        String q10 = Arrays.toString(row[9]);
        String q11 = Arrays.toString(row[10]);
        String q12 = Arrays.toString(row[11]);
        String q13 = Arrays.toString(row[12]);

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" REMOVAL OF BRACKETS ON EACH ROWS ">
        
        q1 = removeBRACKET(q1);
        q2 = removeBRACKET(q2);
        q3 = removeBRACKET(q3);
        q4 = removeBRACKET(q4);
        q5 = removeBRACKET(q5);
        q6 = removeBRACKET(q6);
        q7 = removeBRACKET(q7);
        q8 = removeBRACKET(q8);
        q9 = removeBRACKET(q9);
        q10 = removeBRACKET(q10);
        q11 = removeBRACKET(q11);
        q12 = removeBRACKET(q12);

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" SPLITTING OF DATA FOR POPULATING TABLE ">
        
        String[] queue1 = q1.split(", ");
        String[] queue2 = q2.split(", ");
        String[] queue3 = q3.split(", ");
        String[] queue4 = q4.split(", ");
        String[] queue5 = q5.split(", ");
        String[] queue6 = q6.split(", ");
        String[] queue7 = q7.split(", ");
        String[] queue8 = q8.split(", ");
        String[] queue9 = q9.split(", ");
        String[] queue10 = q10.split(", ");
        String[] queue11 = q11.split(", ");
        String[] queue12 = q12.split(", ");
        String[] queue13 = q13.split(", ");

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" POPULATING THE TABLE WITH DATA ">
        
        final ObservableList<MAINdata> list = FXCollections.observableArrayList(
            new MAINdata(queue1[0], queue1[1], queue1[2], queue1[3], queue1[4], queue1[5], queue1[6], queue1[7], queue1[8], queue1[9], queue1[10], queue1[11], queue1[12]),
            new MAINdata(queue2[0], queue2[1], queue2[2], queue2[3], queue2[4], queue2[5], queue2[6], queue2[7], queue2[8], queue2[9], queue2[10], queue2[11], queue2[12]),
            new MAINdata(queue3[0], queue3[1], queue3[2], queue3[3], queue3[4], queue3[5], queue3[6], queue3[7], queue3[8], queue3[9], queue3[10], queue3[11], queue3[12]),
            new MAINdata(queue4[0], queue4[1], queue4[2], queue4[3], queue4[4], queue4[5], queue4[6], queue4[7], queue4[8], queue4[9], queue4[10], queue4[11], queue4[12]),
            new MAINdata(queue5[0], queue5[1], queue5[2], queue5[3], queue5[4], queue5[5], queue5[6], queue5[7], queue5[8], queue5[9], queue5[10], queue5[11], queue5[12]),
            new MAINdata(queue6[0], queue6[1], queue6[2], queue6[3], queue6[4], queue6[5], queue6[6], queue6[7], queue6[8], queue6[9], queue6[10], queue6[11], queue6[12]),
            new MAINdata(queue7[0], queue7[1], queue7[2], queue7[3], queue7[4], queue7[5], queue7[6], queue7[7], queue7[8], queue7[9], queue7[10], queue7[11], queue7[12]),
            new MAINdata(queue8[0], queue8[1], queue8[2], queue8[3], queue8[4], queue8[5], queue8[6], queue8[7], queue8[8], queue8[9], queue8[10], queue8[11], queue8[12]),
            new MAINdata(queue9[0], queue9[1], queue9[2], queue9[3], queue9[4], queue9[5], queue9[6], queue9[7], queue9[8], queue9[9], queue9[10], queue9[11], queue9[12]),
            new MAINdata(queue10[0], queue10[1], queue10[2], queue10[3], queue10[4], queue10[5], queue10[6], queue10[7], queue10[8], queue10[9], queue10[10], queue10[11], queue10[12]),
            new MAINdata(queue11[0], queue11[1], queue11[2], queue11[3], queue11[4], queue11[5], queue11[6], queue11[7], queue11[8], queue11[9], queue11[10], queue11[11], queue11[12]),
            new MAINdata(queue12[0], queue12[1], queue12[2], queue12[3], queue12[4], queue12[5], queue12[6], queue12[7], queue12[8], queue12[9], queue12[10], queue12[11], queue12[12]),
            new MAINdata(queue13[0], queue13[1], queue13[2], queue13[3], queue13[4], queue13[5], queue13[6], queue13[7], queue13[8], queue13[9], queue13[10], queue13[11], queue13[12])
        );
        
        column1.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input1"));
        column2.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input2"));
        column3.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input3"));
        column4.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input4"));
        column5.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input5"));
        column6.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input6"));
        column7.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input7"));
        column8.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input8"));
        column9.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input9"));
        column10.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input10"));
        column11.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input11"));
        column12.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input12"));
        column13.setCellValueFactory(new PropertyValueFactory<MAINdata, String>("input13"));
        
        resultTABLE.setItems(list);
        removeDUPLICATION(list);
        processDONE();
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" REMOVE DUPLICATION ">
    
    public void removeDUPLICATION(final ObservableList<MAINdata> list) {
        
        String textCOUNT = String.valueOf(textAREA.getText().split("\n").length);

            if (textCOUNT.equals("1")) {

            list.remove(1);

            } else if (textCOUNT.equals("2")) {

                list.remove(2);

            } else if (textCOUNT.equals("3")) {

                list.remove(3);

            } else if (textCOUNT.equals("4")) {

                list.remove(4);

            } else if (textCOUNT.equals("5")) {

                list.remove(5);

            } else if (textCOUNT.equals("6")) {

                list.remove(6);

            } else if (textCOUNT.equals("7")) {

                list.remove(7);

            } else if (textCOUNT.equals("8")) {

                list.remove(8);

            } else if (textCOUNT.equals("9")) {

                list.remove(9);

            } else if (textCOUNT.equals("10")) {

                list.remove(10);

            } else if (textCOUNT.equals("11")) {

                list.remove(11);

        }
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" REMOVE BRACKET ">
    
    public static String removeBRACKET(String removeQUEUE) {
        
        removeQUEUE = removeQUEUE.substring(1);
        removeQUEUE = removeQUEUE.substring(0, removeQUEUE.length() - 1);

        return removeQUEUE;
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" CASE SWITCH FOR VALUES ">
    
    public String rscID(String rscName) {
        switch (rscName) {
            case "F0000000":
                return "Money Token";
            case "F07C5273":
                return "Plank Token";
            case "F1283C03":
                return "Coal Token";
            case "F27DB683":
                return "Iron Token";
            case "F29BF6C1":
                return "Oil Token";
            case "F8E3D3EC":
                return "Steel Token";
            case "F9D8BF64":
                return "Electricty Token";
            case "FAD8464A":
                return "Cement Token";
            case "0BA458C8":
                return "People/Passengers";
            case "3199AA74":
                return "Wood";
            case "6ACBCBA9":
                return "Coal";
            case "448DDF23":
                return "Planks";
            case "61A13BCE":
                return "Iron";
            case "7C13D1C9":
                return "Iron Bars";
            case "0F822763":
                return "Mail";
            case "19CFBDA7":
                return "Oil";
            case "B388ED8C":
                return "Goods";
            case "53F1B093":
                return "Oil Barrel";
            case "88D1A491":
                return "Steel";
            case "94032E35":
                return "Sand";
            case "C74198A7":
                return "Food";
            case "762F8F3E":
                return "Limestone";
            case "8DFA75B5":
                return "Cement";
            default:
                return "";
        }
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" CHECK IF THE VALUE EXISTS ">
    private boolean itExist(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" RESET SETTINGS ">
    
    public void resetSETTINGS() {
        
        textAREA.setFont(Font.font("System", 15.0));
        textLOG.setFont(Font.font("System", 15.0));
        resultTABLE.setStyle("-fx-font-size: " + "12px");
        
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" FONT SELECTION ">
    
    public void fontSELECT() {
        
        FontSelectorDialog initSETTINGS = new FontSelectorDialog(null);
        initSETTINGS.setTitle("Choose Font From List");
        Optional<Font> userRESPONSE = initSETTINGS.showAndWait();
        
        String userFONTFAMILY = userRESPONSE.get().getFamily();
        double userFONTSIZE = userRESPONSE.get().getSize();
        
        if (userFONTFAMILY != null && checkBOX1.isSelected() == false) {
            
            textAREA.setFont(Font.font(userFONTFAMILY, userFONTSIZE));
            textLOG.setFont(Font.font(userFONTFAMILY, userFONTSIZE));
            processDONE();
            
        }
        
        if (userFONTFAMILY != null && checkBOX1.isSelected() == true) {
            
            textAREA.setFont(Font.font(userFONTFAMILY, userFONTSIZE));
            textLOG.setFont(Font.font(userFONTFAMILY, userFONTSIZE));
            resultTABLE.setStyle("-fx-font-size: " + userFONTSIZE + "px");
            processDONE();
            
        }
        
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" CHANGELOGS ">
    
    public void loadLOGS() {
        
        textLOG.appendText(
                
                "CHANGELOG\n\n" +
                
                "RESOURCE CALCULATOR v4.0:\n" +
                        
                "\tAdded:\n" +
                "\t\tPopup Notifications.\n\n" +
                        
                "\tVarious UI Changes:\n" +
                "\t\tAdded Popup Notifications to notify user on successful, or unsuccessful operation.\n" +
                "\t\tChanged the version label on UI.\n\n" +
                        
                "\tOther Changes:\n" +
                "\t\tSignificantly refactored the source code to improve code readability, and performance.\n\n" +
                        
                "\tPlanned Changes For The Next Version:\n" + 
                "\t\tAdd support to change table appearance.\n"+
                "\t\tImprove (refactor) the whole code to improve performance, again.\n" +
                "\t\tRemove the appearance of null in the result table if there is no data present.\n" +
                "\t\tRevamp UI appearance to be more \"User Friendly\", again.\n\n" +
                        
                ////////////////////////////////////////////////////////////
                        
                "RESOURCE CALCULATOR v3.0:\n" +
                        
                "\tAdded:\n" +
                "\t\tSettings Page (To change application appearance).\n" +
                "\t\tChange Logs Page (Added, in order to track down changes into the program).\n\n" +
                        
                "\tVarious UI Changes:\n" +
                "\t\tAdded window dragging to the program.\n" +
                "\t\tAdded version label on UI.\n\n" +
                        
                "\tBug Fixes:\n" +
                "\t\tFixed duplication bug.\n" +
                "\t\tFixed the bracket bug.\n\n" +
                        
                "\tOther Changes:\n" +
                "\t\tRefactored some of the code to improve code readability.\n\n" +
                        
                "\tPlanned Changes For The Next Version:\n" + 
                "\t\tAdd support to change table appearance.\n"+
                "\t\tImprove (refactor) the whole code to improve performance.\n" +
                "\t\tRemove the appearance of null in the result table if there is no data present.\n" +
                "\t\tRevamp UI appearance to be more \"User Friendly\".\n\n" +
                        
                ////////////////////////////////////////////////////////////       
                        
                "RESOURCE CALCULATOR v2.0:\n" +
                        
                "\tAdded:\n" +
                "\t\tAdded support to read the following codes: \n" +
                "\t\t\tTime step.\n" +
                "\t\t\tElectrification Bonus (Input).\n" +
                "\t\t\tElectrification Bonus (Output).\n" +
                "\t\t\tOutput Distance Bonus.\n" +
                "\t\t\tRequire Epocha.\n\n" +
                        
                "\t\tAdded code to calculate the following:\n " +
                "\t\t\tAverage Input Per Tick.\n" +
                "\t\t\tAverage Output Per Tick.\n" +
                "\t\t\tAverage Electrification Bonus (Input) Per Tick.\n" +
                "\t\t\tAverage Electrification Bonus (Output) Per Tick.\n" +
                "\t\t\tAverage Output Distance Bonus Per Tick.\n\n" +
                        
                "\t\tAdded code to calculate the total of the following:\n" +
                "\t\t\tTotal Average Input Per Tick.\n" +
                "\t\t\tTotal Average Output Per Tick.\n" +
                "\t\t\tTotal Average Electrification Bonus (Input) Per Tick.\n" +
                "\t\t\tTotal Average Electrification Bonus (Output) Per Tick.\n" +
                "\t\t\tTotal Average Output Distance Bonus Per Tick.\n\n" +
                        
                "\tOther Changes:\n" +
                "\t\tMigrated the program code from Java Swing into Java FX GUI Framework.\n\n" +
                        
                 ////////////////////////////////////////////////////////////    
                        
                "RESOURCE CALCULATOR v1.0:\n" +
                "\tIDK HAWHHHHAHHAHAHAHHA.\n"
        );
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" NOTIFICATION: SUCCESSFUL ">
    
    public void processDONE() {
        
        Image img = new Image("/ASSETS/DONE.png");
        Notifications notifBuilder = Notifications.create()
                
                .title("OPERATION SUCCESSFUL")
                .text("Operation Processed Successfully.")
                .graphic(new ImageView(img))
                .hideAfter(Duration.seconds(2))
                .position(Pos.TOP_RIGHT);
        
        notifBuilder.show();
        Toolkit.getDefaultToolkit().beep();
    }

// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" NOTIFICATION: UNSUCCESSFUL ">
    public void processERROR() {
        
        Image img = new Image("/ASSETS/ERROR.png");
        Notifications notifBuilder = Notifications.create()
                
                .title("OPERATION UNSUCCESSFUL")
                .text("Check If The Inputted Code Is Valid.")
                .graphic(new ImageView(img))
                .hideAfter(Duration.seconds(2))
                .position(Pos.TOP_RIGHT);
        
        notifBuilder.show();
        Toolkit.getDefaultToolkit().beep();
    }

// </editor-fold>
    
// </editor-fold>

    
}
