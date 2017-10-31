/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggim.control;

/**
 *
 * @author ubuntu
 */
public class GestionUsuariosTest implements GestionUsuarios {

    @Override
    public Boolean existUser(String uname, String pass) {
        if(uname.equals("isma")&&pass.equals("123")){
            return true;
        }else{
            return false;
        }
    }
    
}
