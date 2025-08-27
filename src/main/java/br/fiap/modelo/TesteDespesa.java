package br.fiap.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {
    public static void main(String[] args) {
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();

//        despesa.setId(107L);
//        despesa.setDescricao("Viagem de Uber para a festa da Fiap");
//        despesa.setValor(2500.00);
//        despesa.setData(LocalDate.parse("20/08/1976", mascara));
//        despesa.setCategoria(new Categoria(6L, ""));
//        dao.inserir(despesa);

        List<Despesa> lista = dao.relatorio();
        for (Despesa d : lista) {
            System.out.println(d.getDescricao());
            System.out.println("R$" + d.getValor());
            System.out.println(d.getData().format(mascara));
            System.out.println(d.getCategoria().getCategoria());
            System.out.println("=====================================");
        }
    }
}
