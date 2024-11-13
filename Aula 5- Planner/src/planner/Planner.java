package planner;

import java.util.Scanner;

public class Planner {
    public static void main(String[] args){

        Semana semana = new Semana();
        Scanner input = new Scanner(System.in);
        Compromisso compromisso = new Compromisso();
        int opcao;

        do{
            compromisso = new Compromisso();
            String descComp = new String();
            String dia = new String();
            int horario;
            int duracaoComp;

            System.out.println("");
            System.out.println("Bem vindo(a) ao seu Planner!");
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Adicionar um compromisso");
            System.out.println("2 - Exibir todos os horarios de um dia");
            System.out.println("3 - Exibir os horarios de todos os dias da semana");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Opcao: ");

            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    input.nextLine();
                    System.out.println("");
                    System.out.print("De uma breve descricao do seu compromisso: ");
                    descComp = input.nextLine();
                    compromisso.setDescricao(descComp);

                    System.out.print("Qual vai ser o tempo de duracao? ");
                    duracaoComp = input.nextInt();
                    compromisso.setDuracao(duracaoComp);

                    input.nextLine();
                    System.out.print("Em que dia da semana ele vai ocorrer? ");
                    dia = input.nextLine();
                    
                    System.out.print("Em qual horario? ");
                    horario = input.nextInt();

                    if(horario < 9 || horario >= 18){
                        System.out.println("Digite um horario entre as 9 e as 17 horas!");
                    }

                    System.out.println("");
                    if(semana.addCompromissoAoDia(compromisso, dia, horario)){
                        System.out.println("Compromisso adicionado com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel adicionar o compromisso! Confira se o dia da semana esta escrito corretamente (sem o \"feira\") e se ha disponibilidade naquele horario!");
                    }
                    break;

                case 2:
                    input.nextLine();
                    System.out.println("");
                    System.out.print("De qual dia voce deseja exibir os horarios? ");
                    dia = input.nextLine();
                    System.out.println("");
                    
                    switch(dia.toLowerCase()){
                        case "segunda":
                            System.out.println("Compromissos da segunda:");
                            semana.getSemana()[0].exibirHorarios();
                            break;
                        case "terca":
                            System.out.println("Compromissos da terca:");
                            semana.getSemana()[1].exibirHorarios();
                            break;
                        case "quarta":
                            System.out.println("Compromissos da quarta:");
                            semana.getSemana()[2].exibirHorarios();
                            break;
                        case "quinta":
                            System.out.println("Compromissos da quinta:");
                            semana.getSemana()[3].exibirHorarios();
                            break;  
                        case "sexta":
                            System.out.println("Compromissos da sexta:");
                            semana.getSemana()[4].exibirHorarios();
                            break;
                        default:
                            System.out.println("Dia invalido!");
                            break;
                    }
                    break;

                case 3:
                    for(int i = 0; i < semana.getDias().length; i++){
                        System.out.println("");
                        System.out.println("Compromissos da " + semana.getDias()[i] + ":");
                        semana.getSemana()[i].exibirHorarios();
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while(opcao != 4);

        input.close();
    }
}
