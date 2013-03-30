/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SmiteBuilder;

import java.sql.*;

/**
 *
 * @author bg
 */
public class MySQLDB {

    /** Connection Info; used by the standalone cron jobs to access the DB */
    /*
    protected String dbDriver;
    protected String dbURL;
    protected String dbUser;
    protected String dbPassword;
     */
    protected String dbDriver = "com.mysql.jdbc.Driver";
    protected String dbURL = "jdbc:mysql://localhost/smitebuilder";
    protected String dbUser = "root";
    protected String dbPassword = "bgadm1n";
    /** Default Constructor **/
    public MySQLDB() {
    }

    /**
     *  This constructor is used to allow standalone programs to pass the connection
     *  strings and run the methods here outside the web server.  This is mainly used
     *  by the cron jobs.  JC - 12/03/08
     */
    public MySQLDB(String dbDriver, String dbURL, String dbUser, String dbPassword) {
        this.dbDriver = dbDriver;
        this.dbURL = dbURL;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public Connection getConn() throws SQLException {

        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbURL, dbUser, dbPassword);
        } catch (ClassNotFoundException x) {
            throw new SQLException(x.getMessage());
        }
    }

        public static void closeDBResources(Connection c, Statement s, ResultSet r) {
        try {
            if (r != null) {
                r.close();
                r = null;
            }
        } catch (SQLException e) {
        }
        try {
            if (s != null) {
                s.close();
                s = null;
            }
        } catch (SQLException e) {
        }
        try {
            if (c != null) {
                c.close();
                c = null;
            }
        } catch (SQLException e) {
        }
   }
}
