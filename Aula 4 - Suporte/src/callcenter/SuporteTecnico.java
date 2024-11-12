package callcenter;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class SuporteTecnico {
    private HashMap<String, String> bancoSolucoes;
    private ArrayList<String> respostaPadrao;
    private Random gerador; 
    
    public SuporteTecnico(){
        bancoSolucoes = new HashMap<>();
        respostaPadrao = new ArrayList<>();
        preencheBancoSolucoes();
        preencheRespostaPadrao();
        gerador = new Random();
    }

    private void preencheBancoSolucoes(){ // "private" porque nenhuma outra classe vai usar esse método
        bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\ndo seu processador deve resolver o problema de performance. Você tem algum\nproblema com o software?");
        bancoSolucoes.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\nexecutando algum outro processo em paralelo?");
        bancoSolucoes.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\njá estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\ncom mais detalhes?");
        bancoSolucoes.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\njá estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\ncom mais detalhes?");
        bancoSolucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \nentre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \nentre em contato com a Apple. Não há nada que possamos fazer neste caso.");
        bancoSolucoes.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\ne comparou todas as características do nosso software com outras ofertas de mercado?");
        bancoSolucoes.put("instalacao","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\nque farão todo o trabalho para você. Você já leu as instruções\nde instalação?");
        bancoSolucoes.put("memoria", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\na memória requerida é 1.5 giga byte. Você deverá adquirir\nmais memória. Mais alguma coisa que deseja saber?");
        bancoSolucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\nMuitos deles dizem respeito a versões incompatíveis. Você poderia ser\nmais preciso?");
        bancoSolucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração.");
        bancoSolucoes.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração.");
    }   

    private void preencheRespostaPadrao(){
        respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \nQual é a sua configuração de sistema?");
        respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        respostaPadrao.add("Preciso de maiores informações a respeito.");
        respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\nque poderia detalhar melhor este problema?");
        respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        respostaPadrao.add("Você poderia explicar melhor?");    
    }

    public String buscaSolucao(String palavraChave){
        return bancoSolucoes.get(palavraChave);
    }

    public String buscaRespostaPadrao(){ // Deixei público porque achei a implementação mais fácil
        int tamanho = respostaPadrao.size();
        int indice = gerador.nextInt(tamanho);
        String retorno = respostaPadrao.get(indice);

        return retorno;

        // ou return respostaPadrao.get(gerador.nextInt(respostaPadrao.size()));
    }

    public HashMap<String, String> getBancoSolucoes() {
        return bancoSolucoes;
    }
}
