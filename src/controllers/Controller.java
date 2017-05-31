package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface Controller
{
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException;
}
