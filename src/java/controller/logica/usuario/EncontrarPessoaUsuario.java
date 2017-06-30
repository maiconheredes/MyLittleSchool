package controller.logica.usuario;

import controller.logica.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.dao.usuario.UsuarioDao;
import model.jdbc.DataBase;

public class EncontrarPessoaUsuario implements Logica {
    @Override
    public void executa (HttpServletRequest request, HttpServletResponse response)
        throws Exception {        
        DataBase db = (DataBase) request.getAttribute("db");
        HttpSession session = request.getSession();
        
        UsuarioDao dao = new UsuarioDao(db); //Inversão de controle e injeção de dependência.
        String pessoaUsuario = dao.encontrarPessoaUsuario((String) session.getAttribute("idUsuario"));

        request.setAttribute("pessoaUsuario", pessoaUsuario);  
    }  
}
