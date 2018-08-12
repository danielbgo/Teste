
package br.com.fatecpg.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RandomServlet", urlPatterns = {"/ran.php"})
public class RandomServlet extends HttpServlet {

 
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RandomServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h2>Numeros Randomicos</h2>");
            out.println("<form method = 'GET'>");
            out.println("<h3>Quantidade de numeros</h3>");
            out.println("<input type='text' name='n\'>");
            out.println("<input type='submit' value='Gerar numeros'>");
            out.println("</form>");
            /*double ale = Math.random();
            int n = (int)/*considerar como int (0 + ale *(10-0));
            n = Integer.parseInt(request.getParameter("n"));*/
            
            int r = 0;
            int n = 0;
            try{
                n = Integer.parseInt(request.getParameter("n"));
            }catch(NumberFormatException ex){}
            
            out.println("<br <h2>"+n+"</h2>");
            
            out.println("<br <h2>"+n+"</h2>");
            out.println("<hr>");
            out.println("<table border='1'>");
            out.println("<tr><th>i</th><th>N</th></tr>");
            for(int i=1;i<=n;i++);{
          
            
        }
            for (int j=1;j<=n;j++){
                int random = (int)(1000*Math.random());
            r = random;
            n = r;
                out.println("<br <h2>"+j+"</h2>");
            }
            
            
           
            out.println("<h1>Servlet RandomServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
