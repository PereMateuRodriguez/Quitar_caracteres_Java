public class Main {
  public static void main(String[] args) {
    //Este codigo coge la frase la invierte y despues elimina todo lo que no sea una letra o el espacio
    
    //Frase que me dan
 
    String a = "dsla ";
    //Longitud de de la frase
    int len = a.length();
    
    //Invertir la frase
   	StringBuilder frase = new StringBuilder(a);
    String invertida = frase.reverse().toString();
    
    
    //quitar caracteres
    
    
      String charsToRemove = "<>^ª!·$%&/()=?¿@#~€¬`+^`´{},.-;:_0123456789*º[]\\";
 
        for (char c : charsToRemove.toCharArray()) {
            invertida = invertida.replace(String.valueOf(c), "");
        }
 	System.out.println(invertida);
    
     
    
  }
}
