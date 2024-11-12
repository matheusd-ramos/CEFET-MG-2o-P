package planner;

import java.util.Scanner;

public class Planner {
    public static void main(String[] args){

        Semana semana = new Semana();
        Scanner input = new Scanner(System.in);
        Compromisso compromisso = new Compromisso();

        do{
            compromisso = new Compromisso();
            String descComp = new String();
            int duracaoComp;
            String dia = new String();
            String horario = new String();

            System.out.println("");
            System.out.println("Bem vindo(a) ao seu Planner!");
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Adicionar um compromisso");
            System.out.println("2 - Exibir todos os horarios de um dia");
            System.out.println("3 - Exibir os horarios de todos os dias da semana");
            System.out.println("4 - Sair");

            switch(input.nextInt()){
                case 1:
                    System.out.println("");
                    System.out.print("De uma breve descricao do seu compromisso: ");
                    descComp = input.nextLine();
                    compromisso.setDescricao(descComp);

                    System.out.print("Qual vai ser o tempo de duracao? ");
                    duracaoComp = input.nextInt();
                    compromisso.setDuracao(duracaoComp);

                    System.out.print("Em que dia da semana ele vai ocorrer? ");
                    dia = input.nextLine();
                    
                    System.out.print("Em qual horario? ");
                    horario = input.nextLine();

                    System.out.println("");
                    if(semana.addCompromissoAoDia(compromisso, dia, horario)){
                        System.out.println("Compromisso adicionado com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel adicionar o compromisso!");
                    }
                    break;

                case 2:
                    System.out.println("");
                    System.out.print("Em qual dia voce deseja exibir os horarios? ");
                    dia = input.nextLine();
                    switch(dia){
                        case "segunda":
                            semana.getSemana()[0].exibirHorarios();
                            break;
                        case "terca":
                            semana.getSemana()[1].exibirHorarios();
                            break;
                        case "quarta":
                            semana.getSemana()[2].exibirHorarios();
                            break;
                        case "quinta":
                            semana.getSemana()[3].exibirHorarios();
                            break;  
                        case "sexta":
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

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while(input.nextInt() != 4);

        input.close();
    }
}
