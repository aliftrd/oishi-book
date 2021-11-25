/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author Illuminate
 */
public class CurrentDate {
    public String getCurDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");  
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
    }
}
