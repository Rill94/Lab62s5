package connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionGlassFish
{
    private DataSource dataSource;

    public ConnectionGlassFish() throws NamingException
    {
        Context ctx = new InitialContext();
        dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/_lab6s5");
    }

    public DataSource createConnection()
    {
        try
        {
            return dataSource;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}