/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seguridad.Controlador;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 *
 * @author vjere
 */
public class Encriptado {
    public String encode(String s) {
    String respuesta = "error";
        try {
        respuesta = new String(Base64.getEncoder().encode(s.getBytes("UTF8")),"UTF-8");
        } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
        }
    return respuesta;
}
        
    public String decode(String s) {
    String respuesta = "error";
        try {
        respuesta = new String(Base64.getDecoder().decode(s.getBytes("UTF8")),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    return respuesta;
}        
    
}
