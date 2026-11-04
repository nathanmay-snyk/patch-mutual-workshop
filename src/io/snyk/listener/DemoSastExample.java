package io.snyk.listener;
import java.sql.*;
import javax.servlet.http.*;
// DEMO ONLY: intentionally insecure code to trigger a Snyk Code PR check. Do not merge.
public class DemoSastExample extends HttpServlet {
  private static final String DB_PASSWORD = "SuperSecret123!";
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws Exception {
    String user = req.getParameter("user");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", DB_PASSWORD);
    Statement s = c.createStatement();
    ResultSet r = s.executeQuery("SELECT * FROM users WHERE name = '" + user + "'");
    resp.getWriter().println("Hello " + user);
  }
}
