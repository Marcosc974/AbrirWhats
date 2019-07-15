package classes;
public class ValidaTelefone {

    public boolean validaTel(String tel){
        
        if (tel.isEmpty() || tel.length() !=13 || tel.equals("")) {
            return false;
        }
        return true;
    }
}
