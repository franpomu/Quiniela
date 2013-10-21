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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTo
 */
public class DesdeCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntidadBancariaDAO entidadBancariaDAO=new EntidadBancariaDAOImplJDBC();
        
        
        EntidadBancaria ent=new EntidadBancaria(1,"0001","Entidad1","0123", TipoEntidadBancaria.Banco);
        SucursalBancaria suc=new SucursalBancaria(2,"Entidad1","0236598","Bankia");
        EntidadBancaria ent1=new EntidadBancaria(2,"124a4","Entidad55","546585", TipoEntidadBancaria.CajadeAhorro);
        
       /*ent= entidadBancaria.read(1);
       System.out.println(ent.getIdEntidad());
       System.out.println(ent.getCodigoEntidad());
       System.out.println(ent.getNombre());
       System.out.println(ent.getCif());
       System.out.println(ent.getTipoEntidad());
       entidadBancaria.insert(ent);
       entidadBancaria.delete(1);
       entidadBancaria.update(ent1);*/
        List<EntidadBancaria> lista=entidadBancariaDAO.findAll();
        
        /*for(EntidadBancaria e:lista){
            System.out.println(e.getIdEntidad());
            System.out.println(e.getCodigoEntidad());
            System.out.println(e.getCif());
            System.out.println(e.getNombre());
            System.out.println(e.getTipoEntidad());
        }*/
        
    }
}
