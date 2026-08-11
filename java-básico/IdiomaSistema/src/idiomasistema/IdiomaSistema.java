package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        
       Locale idioma = Locale.getDefault();
        
        // Mostra o código completo (ex: pt_BR)
        System.out.println("O código do seu idioma é: " + idioma.toString());
        
        // Mostra apenas o nome do idioma escrito por extenso (ex: português)
        System.out.println("O idioma do seu sistema é: " + idioma.getDisplayLanguage());
    }
    
}
