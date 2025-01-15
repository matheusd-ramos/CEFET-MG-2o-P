public class CifraDeCesar {
    private Chave chave;

    public CifraDeCesar(Chave chave){
        this.chave = chave;
    }

    public String cifrar(String mensagem){
        String[] string = new String[mensagem.length()];

        for(int i = 0; i < mensagem.length(); i++){
            int indiceNoAlfabeto = chave.buscarIndice(Character.toString(mensagem.charAt(i)));
            string[i] = chave.getAlfabeto()[(indiceNoAlfabeto + chave.getDeslocamento()) % 26] ;
        }

        String resultado = String.join("", string);
        return resultado;
    }

    public String decifrar(String mensagem){
        String[] string = new String[mensagem.length()];
        
        for(int i = 0; i < mensagem.length(); i++){
            int indiceNoAlfabeto = chave.buscarIndice(Character.toString(mensagem.charAt(i)));
            string[i] = chave.getAlfabeto()[(indiceNoAlfabeto - chave.getDeslocamento() + 26) % 26];
        }

        String resultado = String.join("", string);
        return resultado;
    }

    public String verificarMensagem (String mensagem) throws DecifragemInvalidaException{
        String mensagemCifrada = cifrar(mensagem);
        String mensagemDecifrada = decifrar(mensagemCifrada);

        if(!mensagem.equals(mensagemDecifrada))
            throw new DecifragemInvalidaException();

        return "Decifragem aceita!";
    } 
}
