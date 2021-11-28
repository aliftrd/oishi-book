/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Illuminate
 */
public class User {
    private static int id;
    private static String username;
    
    public static int getId() {
        return id;
    }
    
    public static void setId(int id) {
        User.id = id;
    }
    
    public static String getName() {
        return username;
    }
    
    public static void setName(String username) {
        User.username = username;
    }
}
