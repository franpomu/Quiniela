/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desdecero;

import Datos.EntidadBancariaDAO;
import Datos.EntidadBancariaDAOImplJDBC;
import Negocio.EntidadBancaria;
import Negocio.SucursalBancaria;
import Negocio.TipoEntidadBancaria;

/**
 *
 * @author iTo
 */
public class DesdeCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntidadBancariaDAO entidadBancaria=new EntidadBancariaDAOImplJDBC();
        
        EntidadBancaria ent=new EntidadBancaria(1,"0001","Entidad1","0123", TipoEntidadBancaria.Banco);
        SucursalBancaria suc=new SucursalBancaria(2,"Entidad1","0236598","Bankia");
        
       ent= entidadBancaria.read(1);
       System.out.println(ent.getIdEntidad());
       System.out.println(ent.getCodigoEntidad());
       System.out.println(ent.getNombre());
       System.out.println(ent.getCif());
       System.out.println(ent.getTipoEntidad());
        //entidadBancaria.insert(ent);
        
    }
}
