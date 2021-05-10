import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class app {

    public static void main(String[] args) {
        
        Scanner entr = new Scanner(System.in);
        LinkedList<itens> lista = new LinkedList<itens>();
        int opc;
    

    do {
        System.out.println("\n\tMenu principal\n");
        System.out.println("(0) Sair");
        System.out.println("(1) Agregar item");
        System.out.println("(2) Buscar item");
        System.out.println("(3) Remover item");
        System.out.println("(4) Atualizar item");
        System.out.println("(5) Listar item");
        //System.out.println("(6) Filtrar item");


        System.out.println("\n\tDigite a opcao desejada\n");
        opc = entr.nextInt();

        switch (opc) {
            case 0:
                break;

            case 1: // agregar os itens
                    agregarItem(lista);
                break;

            case 2: // Buscar itens
                    buscarItens(lista);
                break;

            case 3: //remover itens
                    removerItem(lista);
                break;

            case 4:
                    atualizarItem(lista);
                break;

            case 5: //listar os itens
                    listarItens(lista);
                break;

            /*case 5: //filtrar itens
                    filtrarItem(lista);
                break;*/
        
            default:
                System.out.println("\n\tError: Valor invalido\n");
                break;
        }
        

    } while (opc>0);
        System.out.println("\n\tFim do programa\n");
}

    public static void agregarItem(LinkedList <itens> lista) {
        itens novoItem;
        String nome, tipo;
        double valor;
        Scanner entr = new Scanner(System.in);

        System.out.println("\n\tDigite o nome do item\n");
        nome = entr.nextLine();
        System.out.println("\n\tDigite o Tipo do produto\n");
        tipo = entr.nextLine();
        System.out.println("\n\tDigite o valor do produto\n");
        valor = entr.nextDouble();

        novoItem = new itens(nome, tipo, valor);

        lista.add(novoItem);
    }

    public static void listarItens(LinkedList <itens> lista) {
        System.out.println("\n\tItens\n");
            for (itens item : lista) {          
                System.out.print("\tNome: "+item.getNome());
                System.out.print("\tTipo: "+item.getTipo());
                System.out.print("\tValor R$: "+item.getValor()+"\n");
            }
        

        
    }

    public static void buscarItens(LinkedList <itens> lista) {
        String buscar;
        Scanner entr = new Scanner(System.in);
        System.out.println("Digite o nome do item: ");
        buscar = entr.nextLine();

        for (itens item : lista) {
            if (buscar.equals(item.getNome())) {
                System.out.println("\n\tItens\n");
                System.out.print("\tNome: "+item.getNome());
                System.out.print("\tTipo: "+item.getTipo());
                System.out.print("\tValor R$: "+item.getValor()+"\n");
                return;
            }
        }
        System.out.println("\nError: O item nao existe na lista");
    }

    public static void removerItem(LinkedList <itens> lista) {
        String remover;
        Scanner entr = new Scanner(System.in);
        System.out.println("Digite o nome do item que deseja remover: ");
        remover = entr.nextLine();

        for (itens item : lista) {
            if (remover.equals(item.getNome())) {
                lista.remove(item);
                return;
            }
        }
        System.out.println("\nError: O item nao existe na lista");
    }

    public static void atualizarItem(LinkedList <itens> lista) {
        Scanner entr = new Scanner(System.in);
        String att;
        System.out.println("Digite o nome do produto que deseja atualizar: ");
        att = entr.nextLine();

        for (itens item : lista) {
            if (att.equals(item.getNome())) {
                lista.remove(item);
                agregarItem(lista);
                return;
            }
        }
        System.out.println("\nError: O item nao existe na lista");
        
    }

    /*public static void filtrarItem(LinkedList <itens> lista){
        int opc;
        Scanner entr = new Scanner(System.in);
        System.out.println("\n\rDigite o valor do filtro: ");
        opc = entr.nextInt();

       
        List<E> listaFiltrada = itens.stream().filter((itens item) -> item.getValor() < opc).collect(Collectors.toList());
        listaFiltrada.forEach(System.out.println());

    }
    */
}

    
    
