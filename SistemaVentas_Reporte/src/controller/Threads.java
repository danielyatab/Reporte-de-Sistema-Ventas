
package controller;
/**
 *
 * @author yatac
 */
public class Threads implements Runnable{
    // Creamos un objeto Runnable que ejecuta varios métodos en paralelo
            public void run() {
                // Creamos una instancia de la otra clase y llamamos a su método
                FileJson.verifRuteUser("json/User.json");
                

                // Llamamos a otro método en esta misma clase
               
                
                ///Conexion.conectar_db();
            }
            
}

