/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;
import java.sql.*;
/**
 *
 * @author milton
 */
public class BaseConeccion {
    
    Connection connect = null;
    
    public Connection getConnection()
    {
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/BenedictoXVI";
        String user = "postgres";
        String password = "postgres";
        try{
            Class.forName(driver);
            connect = DriverManager.getConnection(connectString, user , password);
            return connect;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            return connect;
        }
    }
    
    public void Close()
    {
        try
        {
            if (connect != null)
            {
                connect.close();
            }
        }
        catch(Exception ex)
        {
          System.out.println(ex.getMessage());
        }

    }

}
