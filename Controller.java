package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    public TextField Miara;

    @FXML
    public TextField WynikMiara;

    @FXML
    public TextField Czas;

    @FXML
    public TextField WynikCzas;

    @FXML
    public TextField Powierzchnia;

    @FXML
    public TextField WynikPowierzchnia;

    @FXML
    public TextField Masa;

    @FXML
    public TextField WynikMasa;

    @FXML
    public TextField Dane;

    @FXML
    public TextField WynikDane;

    @FXML
    public Text CommunicatMiara;

    @FXML
    public RadioButton znm;

    @FXML
    public RadioButton zmm;

    @FXML
    public RadioButton zcm;

    @FXML
    public RadioButton zdm;

    @FXML
    public RadioButton zm;

    @FXML
    public RadioButton zkm;

    @FXML
    public RadioButton zcal;

    @FXML
    public RadioButton zstopa;

    @FXML
    public RadioButton zjard;

    @FXML
    public RadioButton zmilal;

    @FXML
    public RadioButton zmilam;

    @FXML
    public RadioButton nanm;

    @FXML
    public RadioButton namm;

    @FXML
    public RadioButton nacm;

    @FXML
    public RadioButton nadm;

    @FXML
    public RadioButton nam;

    @FXML
    public RadioButton nakm;

    @FXML
    public RadioButton nacal;

    @FXML
    public RadioButton nastopa;

    @FXML
    public RadioButton najard;

    @FXML
    public RadioButton namilal;

    @FXML
    public RadioButton namilam;

    @FXML
    public RadioButton zsek;

    @FXML
    public RadioButton zmin;

    @FXML
    public RadioButton zgodz;

    @FXML
    public RadioButton zdni;

    @FXML
    public RadioButton nasek;

    @FXML
    public RadioButton namin;

    @FXML
    public RadioButton nagodz;

    @FXML
    public RadioButton nadni;

    @FXML
    public RadioButton zcm2;

    @FXML
    public RadioButton zdm2;

    @FXML
    public RadioButton zm2;

    @FXML
    public RadioButton zar;

    @FXML
    public RadioButton zha;

    @FXML
    public RadioButton zkm2;

    @FXML
    public RadioButton nacm2;

    @FXML
    public RadioButton nadm2;

    @FXML
    public RadioButton nam2;

    @FXML
    public RadioButton naar;

    @FXML
    public RadioButton naha;

    @FXML
    public RadioButton nakm2;

    @FXML
    public RadioButton zmg;

    @FXML
    public RadioButton zg;

    @FXML
    public RadioButton zdg;

    @FXML
    public RadioButton zkg;

    @FXML
    public RadioButton zt;

    @FXML
    public RadioButton namg;

    @FXML
    public RadioButton nag;

    @FXML
    public RadioButton nadg;

    @FXML
    public RadioButton nakg;

    @FXML
    public RadioButton nat;

    @FXML
    public RadioButton zbity;

    @FXML
    public RadioButton nabity;

    @FXML
    public RadioButton zbajty;

    @FXML
    public RadioButton nabajty;

    public void Miara() {
        String text = Miara.getText();
        float number1 = 0;
        float z = 0;
        float na = 0;

        if (znm.isSelected() && nanm.isSelected() || zmm.isSelected() && namm.isSelected() || zcm.isSelected() && nacm.isSelected() || zdm.isSelected()
                && nadm.isSelected() || zm.isSelected() && nam.isSelected() || zkm.isSelected() && nakm.isSelected() || zcal.isSelected()
                && nacal.isSelected() || zstopa.isSelected() && nastopa.isSelected() || zjard.isSelected() && najard.isSelected() || zmilal.isSelected()
                && namilal.isSelected() || zmilam.isSelected() && namilam.isSelected()) {

            CommunicatMiara.setText("Zaznaczono takie same jednostki!");
        } else {

            if (znm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.0001;
            }
            if (zmm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.001;
            }
            if (zcm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.01;
            }
            if (zdm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.1;
            }
            if (zm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 1;
            }
            if (zkm.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 1000;
            }
            if (zcal.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.024;
            }
            if (zstopa.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.3048;
            }
            if (zjard.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 0.9144;
            }
            if (zmilal.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 1609;
            }
            if (zmilam.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 1852;
            }
            if (nanm.isSelected()) {
                na = (float) 0.0001;
            }
            if (namm.isSelected()) {
                na = (float) 0.001;
            }
            if (nacm.isSelected()) {
                na = (float) 0.01;
            }
            if (nadm.isSelected()) {
                na = (float) 0.1;
            }
            if (nam.isSelected()) {
                na = 1;
            }
            if (nakm.isSelected()) {
                na = 1000;
            }
            if (nacal.isSelected()) {
                na = (float) 0.024;
            }
            if (nastopa.isSelected()) {
                na = (float) 0.3048;
            }
            if (najard.isSelected()) {
                na = (float) 0.9144;
            }
            if (namilal.isSelected()) {
                na = (float) 1609;
            }
            if (namilam.isSelected()) {
                na = (float) 1852;
            }
                float unit = z / na;
                String result = String.valueOf(number1 * unit);
                WynikMiara.setText(result);
            }
        }
    public void Czas() {
        String text = Czas.getText();
        float number1 = 0;
        float z = 0;
        float na = 0;

        if (zsek.isSelected() && nasek.isSelected() || zmin.isSelected() && namin.isSelected() || zgodz.isSelected() && nagodz.isSelected() || zdni.isSelected()
                && nadni.isSelected()) {

            //CommunicatCzas.setText("Zaznaczono takie same jednostki!");
        } else {

            if (zsek.isSelected()) {
                number1 = Float.parseFloat(Czas.getText());
                z = (float) 1;
            }
            if (zmin.isSelected()) {
                number1 = Float.parseFloat(Czas.getText());
                z = (float) 60;
            }
            if (zgodz.isSelected()) {
                number1 = Float.parseFloat(Czas.getText());
                z = (float) 3600;
            }
            if (zdni.isSelected()) {
                number1 = Float.parseFloat(Miara.getText());
                z = (float) 86400;
            }
            if (nasek.isSelected()) {
                na = (float) 1;
            }
            if (namin.isSelected()) {
                na = (float) 60;
            }
            if (nagodz.isSelected()) {
                na = (float) 3600;
            }
            if (nadni.isSelected()) {
                na = (float) 86400;
            }
            float unit = z / na;
            String result = String.valueOf(number1 * unit);
            WynikCzas.setText(result);
        }
    }
    public void Powierzchnia() {
        String text = Powierzchnia.getText();
        float number1 = 0;
        float z = 0;
        float na = 0;

        if (zcm2.isSelected() && nacm2.isSelected() || zdm2.isSelected() && nadm2.isSelected() || zm2.isSelected() && nam2.isSelected() || zar.isSelected()
                && naar.isSelected() || zha.isSelected() && naha.isSelected() || zkm2.isSelected() && nakm2.isSelected()) {

            //CommunicatPowierzchina.setText("Zaznaczono takie same jednostki!");
        } else {

            if (zcm2.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 0.01;
            }
            if (zdm2.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 0.1;
            }
            if (zm2.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 1;
            }
            if (zar.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 100;
            }
            if (zha.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 10000;
            }
            if (zkm2.isSelected()) {
                number1 = Float.parseFloat(Powierzchnia.getText());
                z = (float) 1000000;
            }
            if (nacm2.isSelected()) {
                na = (float) 0.01;
            }
            if (nadm2.isSelected()) {
                na = (float) 0.1;
            }
            if (nam2.isSelected()) {
                na = (float) 1;
            }
            if (naar.isSelected()) {
                na = (float) 100;
            }
            if (naha.isSelected()) {
                na = 10000;
            }
            if (nakm2.isSelected()) {
                na = 1000000;
            }
            float unit = z / na;
            String result = String.valueOf(number1 * unit);
            WynikPowierzchnia.setText(result);
        }
    }
    public void Masa() {
        String text = Masa.getText();
        float number1 = 0;
        float z = 0;
        float na = 0;

        if (zmg.isSelected() && namg.isSelected() || zg.isSelected() && nag.isSelected() || zdg.isSelected() && nadg.isSelected() || zkg.isSelected()
                && nakg.isSelected() || zt.isSelected() && nat.isSelected()) {

            //CommunicatMasa.setText("Zaznaczono takie same jednostki!");
        } else {

            if (zmg.isSelected()) {
                number1 = Float.parseFloat(Masa.getText());
                z = (float) 0.1;
            }
            if (zg.isSelected()) {
                number1 = Float.parseFloat(Masa.getText());
                z = (float) 1;
            }
            if (zdg.isSelected()) {
                number1 = Float.parseFloat(Masa.getText());
                z = (float) 100;
            }
            if (zkg.isSelected()) {
                number1 = Float.parseFloat(Masa.getText());
                z = (float) 1000;
            }
            if (zt.isSelected()) {
                number1 = Float.parseFloat(Masa.getText());
                z = (float) 1000000;
            }
            if (namg.isSelected()) {
                na = (float) 0.1;
            }
            if (nag.isSelected()) {
                na = (float) 1;
            }
            if (nadg.isSelected()) {
                na = (float) 100;
            }
            if (nakg.isSelected()) {
                na = (float) 1000;
            }
            if (nat.isSelected()) {
                na = 1000000;
            }
            float unit = z / na;
            String result = String.valueOf(number1 * unit);
            WynikMasa.setText(result);
        }
    }
    public void Dane() {
        String text = Dane.getText();
        float number1 = 0;
        float z = 0;
        float na = 0;

        if (zbity.isSelected() && nabity.isSelected() || zbajty.isSelected() && nabajty.isSelected()) {

            //CommunicatDane.setText("Zaznaczono takie same jednostki!");
        } else {

            if (zbity.isSelected()) {
                number1 = Float.parseFloat(Dane.getText());
                z = (float) 1;
            }
            if (zbajty.isSelected()) {
                number1 = Float.parseFloat(Dane.getText());
                z = (float) 8;
            }
            if (nabity.isSelected()) {
                na = (float) 1;
            }
            if (nabajty.isSelected()) {
                na = (float) 8;
            }
            float unit = z / na;
            String result = String.valueOf(number1 * unit);
            WynikDane.setText(result);
        }
    }
    public void pasteMiara (){

        Miara.setText(" ");
        WynikMiara.setText(" ");
        CommunicatMiara.setText(" ");
    }
    public void pasteCzas (){

        Czas.setText(" ");
        WynikCzas.setText(" ");
        //CommunicatCzas.setText(" ");
    }
    public void pastePowierzchnia (){

        Powierzchnia.setText(" ");
        WynikPowierzchnia.setText(" ");
        //CommunicatPowierzchnia.setText(" ");
    }
    public void pasteMasa (){

        Masa.setText(" ");
        WynikMasa.setText(" ");
        //CommunicatMasa.setText(" ");
    }
    public void pasteDane (){

        Dane.setText(" ");
        WynikDane.setText(" ");
        //CommunicatDane.setText(" ");
    }
}
