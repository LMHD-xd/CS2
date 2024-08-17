
package App.Controller.Validator;

import java.util.Date;
import java.text.SimpleDateFormat;


public abstract class CommonsValidator {
    public void isValidString(String element, String value) throws Exception{
        if (value.equals("")){
            throw new Exception (element + " no puede ser un valor vacío ");
        }
    }
    
    public int isValidInteger (String element, String value) throws Exception{
        isValidInteger(element, value);
        try{
            return Integer.parseInt(value);
        }catch (Exception e){
            throw new Exception (element + " debe ser una valor valido");
        }
    }
    
    public long isValidLong (String element, String value) throws Exception{
        isValidLong(element, value);
        try{
            return Long.parseLong(value);
        }catch (Exception e){
            throw new Exception (element + " debe ser un valor valido");
        }
    }
    
    public double isValidDouble (String element, String value) throws Exception{
        isValidDouble(element, value);
        try{
            return Double.parseDouble(value);
        }catch (Exception e){
            throw new Exception (element + " debe ser un valor valido");
        }
    }
    
  
    }

