package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        DespesaDAO despesaDAO = new DespesaDAO();
        // Categoria categoria = new Categoria(6L,"educação");
        //dao.inserir(categoria);

//        List<Categoria> lista = dao.listar();
//        for(Categoria c : lista) {
//            System.out.println(c.getId() + " - " + c.getCategoria());
//        }
        }
    }

