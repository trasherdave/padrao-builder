
import com.david.padrao.builder.Produto;
import com.david.padrao.builder.ProdutoBuilder;
import com.david.padrao.builder.Vendedor;
import java.time.LocalDate;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Principal {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();
        vendedor.setId(1);
        vendedor.setNome("David");

        Produto produto = new ProdutoBuilder()
                .titulo("Monitor LED")
                .descricao("Monitor LED 25")
                .marca("Samsung")
                .modelo("25FHD")
                .preco(1200)
                .dataCadastro(LocalDate.now())
                .dataUltimaAtualizacao(LocalDate.now())
                .categoria("Eletrônico")
                .vendedor(vendedor)
                .build();

        System.out.println(produto);
    }

}
