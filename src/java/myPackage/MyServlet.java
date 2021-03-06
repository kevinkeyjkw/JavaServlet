package myPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;

/**
 *
 * @author Kevin
 */
@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    final static int MAX=100;
    public static int counter = 0;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setHeader("Access-Control-Allow-Origin", "null");
        System.out.println("ProcessRequest called");
        PrintWriter out = response.getWriter();
        try {
            ServletContext context = this.getServletContext();
            FormBean [] formArray = (FormBean[])context.getAttribute("formBeanArray");
            
            if(formArray == null){
                formArray = new FormBean[MAX];
                context.setAttribute("formBeanArray", formArray);
            }
            
            FormBean fb = new FormBean();
            fb.setEmail(request.getParameter("email"));
            fb.setTelephone(request.getParameter("telephone"));
            fb.setfName(request.getParameter("fname"));
            fb.setlName(request.getParameter("lname"));
            if(request.getParameter("termBox")!=null)
                fb.setChecked(true);
            fb.setCompany(request.getParameter("company"));
            if(context.getAttribute("counter") == null){
                context.setAttribute("counter", counter);
            }
            formArray[(Integer)context.getAttribute("counter")] = fb;
            counter++;
            
            System.out.println(counter+" " + context.getAttribute("counter"));
            context.setAttribute("counter", counter);
           
            /*
            HttpSession session = request.getSession();
            session.setAttribute("fname", fb.getfName());
            session.setAttribute("lname", fb.getlName());
            session.setAttribute("email", fb.getEmail());
            session.setAttribute("telephone", fb.getTelephone());
            
            RequestDispatcher rd = request.getRequestDispatcher("formJSP.jsp");
            rd.forward(request, response);
            */
            //Alternative using servletContext
            /*RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher(
            "/SBUWeatherService.jsp");
            */
            //url = "result.jsp" relative to request object
            //url = "/result.jsp" relative to root of Web
    
                //request.getSession().setAttribute("fname", fb.getfName());
                //request.setAttribute("lname", fb.getlName());
                response.sendRedirect("http://localhost:8080/JavaServlet/result.jsp?name=fab&last=ulous");
            
        } finally {
            out.close();
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
        //processRequest(request, response);
        //Check if email is in FormBean, if so return JSON object, when submit is clicked, it goes through doPost
            String email = request.getParameter("email");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String telephone = request.getParameter("telephone");
            String company = request.getParameter("company");
            PrintWriter out = response.getWriter();
            FormBean []formArray = (FormBean[])this.getServletContext().getAttribute("formBeanArray");
           // System.out.println(formArray[0].getEmail());
            if(email != null && formArray != null){
                
                for(int i = 0;i < formArray.length;i++){
                    FormBean bean = formArray[i];
                    if(bean != null && email.equals(bean.getEmail())){
                        System.out.println("Email"+bean.getEmail());
                        JSONObject job = new JSONObject();
                        job.put("firstname", bean.getfName());
                        job.put("lastname", bean.getlName());
                        job.put("telephone", bean.getTelephone());
                        job.put("termBox", bean.isValid());
                        if(bean.getCompany()!=null)
                            job.put("company", bean.getCompany());
                        out.print(job.toString());
                        out.flush();
                    }
                }
                /*
                if(!email.contains("@") && !email.equals("")){
                    out.print("Please enter a valid email");
                }else{
                    out.print("ok");
                }*/
            }else if(firstname != null){
                if(firstname.matches("[a-zA-Z]+") || firstname.equals("")){
                    out.print("ok");
                }else{
                    out.print("Please enter a valid name");
                }
            }else if(lastname != null){
                if(lastname.matches("[a-zA-Z]+") || lastname.equals("")){
                    out.print("ok");
                }else{
                    out.print("Please enter valid name");
                }
            }else if(telephone != null){
                //System.out.println(telephone);
                String alteredTelephone = telephone.replaceAll("[^0-9]", "");
                 //System.out.println(telephone);
                if(alteredTelephone.length() != 10 && !telephone.equals("")){
                    out.print("Please enter a 10 digit phone number");
                }else{
                    out.print("ok");
                }
            
            }
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
