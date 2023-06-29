package main;

import controller.Backup;
import controller.BackupEjecution;
import java.io.File;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Casa
 */
public class MainSystem {

    public static void main(String[] args) {
        
        File file = new File("json/User.json");
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        ProgressBacKup progress = new ProgressBacKup();
        Login login = new Login();

        /*Backup Viernes*/
        if (file.exists()) {
            if (dayOfWeek == Calendar.FRIDAY) {
                progress.setVisible(true);
                initData();//Backup ejecution
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(100);
                        progress.porcentaje.setText(Integer.toString(i) + "%");
                        progress.barra.setValue(i);
                        if (i == 100) {
                            /*Aparicion de */
                            progress.setVisible(false);
                            login.setVisible(true);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error al ejecutar barra progresiva");
                }
                System.out.println("Es Viernes, ejecutando el código...");
            } else {
                login.setVisible(true);
            }
        }else {
            login.setVisible(true);
        }
    }

    public static void initData() {
        Backup.createCarpetBackup();
        Backup.createCarpetJson();
        BackupEjecution ejecutor = new BackupEjecution();
        Thread hilo = new Thread(ejecutor);
        hilo.start();
    }

}
