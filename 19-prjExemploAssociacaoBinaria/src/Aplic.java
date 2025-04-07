
import fatec.poo.model.*;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Adinistrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("Func. Horista: " + funcHor.getNome() +
                            " - Departamento: " + funcHor.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        System.out.println("Func. Mensalista: " + funcMen.getNome() +
                            " - Departamento: " + funcMen.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("Func. Comissionado: " + funcCom.getNome() +
                            " - Departamento: " + funcCom.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        System.out.println("\nRESUMO: Departamentos");
        dep1.listarFuncionarios();
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);
        dep2.listarFuncionarios();
        
        
        // daqui pra frente fui eu que fiz...
        // instanciando projetos:
        Projeto proj1 = new Projeto(12, "Natal");
        Projeto proj2 = new Projeto(13, "Pascoa");
        
        proj1.setDtInicio("01-12-2024");
        proj1.setDtTermino("25-12-2024");
        proj2.setDtInicio("01-04-2025");
        proj2.setDtTermino("30-04-2025");
        
        // associando Funcionario e Projeto
        funcCom.setProjeto(proj1);
        funcHor.setProjeto(proj1);
        funcMen.setProjeto(proj2);
        
        proj1.addFuncionario(funcCom);
        proj1.addFuncionario(funcHor);
        proj2.addFuncionario(funcMen);
        
        // listando funcionerios por projeto
        System.out.println("\nRESUMO: Projetos");
        proj1.listarFuncionarios();
        proj2.listarFuncionarios();
    
    }    
}
