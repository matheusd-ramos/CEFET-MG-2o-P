public class CifraDeCesar {
    private Chave chave;

    public CifraDeCesar(Chave chave){
        this.chave = chave;
    }

    public String cifrar(String mensagem){
        String[] string = new String[mensagem.length()];
        string = mensagem.split("");

        for(int i = 0; i < mensagem.length(); i++){
            string[i] = String.valueOf((char) ((mensagem.charAt(i) - 'a' + chave.getDeslocamento()) % 26) + 'a') ;
        }

        String resultado = String.join("", string);
        return resultado;
    }

    public String decifrar(String mensagem){
        String[] string = new String[mensagem.length()];
        String c = new String();
        
        for(int i = 0; i < mensagem.length(); i++){
            c = String.valueOf((char) (mensagem.charAt(i)));
            if(chave.buscarIndice(c) > chave.getDeslocamento())
                string[i] = String.valueOf((char) ((mensagem.charAt(i) - 'a' - chave.getDeslocamento()) + 26) + 'a');
            
            
        }

        String resultado = String.join("", string);
        return resultado;
    }
}
