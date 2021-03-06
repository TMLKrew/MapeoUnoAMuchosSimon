package es.albarregas.daofactory;

import es.albarregas.dao.GenericoDAO;
import es.albarregas.dao.IGenericoDAO;
import es.albarregas.dao.IPersonaDAO;
import es.albarregas.dao.PersonaDAO;

public class MySQLDAOFactory extends DAOFactory{


    @Override
    public IGenericoDAO getGenericoDAO() {
        return new GenericoDAO();
    }

    @Override
    public IPersonaDAO getPersonaDAO() {
        return new PersonaDAO();
    }

 

    

    
    
}
