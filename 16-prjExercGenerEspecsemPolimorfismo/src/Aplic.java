
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 * @author eros
 */
public class Aplic {

    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor(23, "Carlos", "3344-5566");
        Cliente cliente = new Cliente("234.567.890-12", "Maria", "9988-7766");
        
        instrutor.setAreaAtuacao("Fisioterapia");
        cliente.setAltura(1.68);
        cliente.setPeso(63.5);
        
        System.out.println(" - INSTRUTOR - ");
        System.out.println("Nome: " + instrutor.getNome());
        System.out.println("Telefone: " + instrutor.getTelefone());
        System.out.println("Id: " + instrutor.getId());
        System.out.println("Área de Atuação: " + instrutor.getAreaAtuacao());
        System.out.println("");
        System.out.println(" - CLIENTE - ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Peso: " + cliente.getPeso() + "kg, Altura: " + cliente.getAltura() + "m");
    }
    
}
