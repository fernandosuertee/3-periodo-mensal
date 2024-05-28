package view;

import model.entity.Atendente;
import model.entity.ClienteVisitante;
import model.entity.MaquinaSorvete;
import model.entity.Pedido;
import model.entity.Sorvete;

import model.service.AtendenteService;
import model.service.ClienteVisitanteService;
import model.service.MaquinaSorveteService;
import model.service.PedidoService;
import model.service.SorveteService;


public class teste {
    public static void main(String[] args) {
        // Testando AtendenteService
        AtendenteService atendenteService = new AtendenteService();
        Atendente atendente = new Atendente();
        atendente.setNome("João");
        atendente.setEndereco("Rua A, 123");
        atendente.setSalario(2000);
        atendente.setCargo("Atendente");
        atendenteService.save(atendente);
        atendenteService.findByName("João").forEach(a -> System.out.println("Atendente encontrado: " + a.getNome()));

        // Testando ClienteVisitanteService
        ClienteVisitanteService clienteVisitanteService = new ClienteVisitanteService();
        ClienteVisitante clienteVisitante = new ClienteVisitante();
        clienteVisitante.setCpf("12345678900");
        clienteVisitante.setNome("Maria");
        clienteVisitanteService.save(clienteVisitante);
        clienteVisitanteService.findByCpf("12345678900").forEach(c -> System.out.println("Cliente Visitante encontrado: " + c.getNome()));

        // Testando MaquinaSorveteService
        MaquinaSorveteService maquinaSorveteService = new MaquinaSorveteService();
        MaquinaSorvete maquinaSorvete = new MaquinaSorvete();
        maquinaSorvete.setModelo("Modelo X");
        maquinaSorvete.setCapacidade(300);
        maquinaSorveteService.save(maquinaSorvete);
        maquinaSorveteService.findByCapacidade(300).forEach(m -> System.out.println("Máquina de Sorvete encontrada: " + m.getModelo()));

        // Testando PedidoService
        PedidoService pedidoService = new PedidoService();
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(12345);
        pedido.setData(new java.sql.Timestamp(System.currentTimeMillis()));
        pedido.setQuantidade(2);
        pedido.setValorPedido(20.0f);
        pedido.setPrecoUnitario(10.0f);
        pedido.setItensPedido("2 Sorvetes de Chocolate");
        pedido.setCpfCliente("12345678900");
        pedido.setIdSorvete(1);
        pedido.setStatusPedido("Em andamento");
        pedidoService.save(pedido);
        pedidoService.findByStatus("Em andamento").forEach(p -> System.out.println("Pedido encontrado: " + p.getNumeroPedido()));

        // Testando SorveteService
        SorveteService sorveteService = new SorveteService();
        Sorvete sorvete = new Sorvete();
        sorvete.setSabor("Chocolate");
        sorvete.setTipo("Copo");
        sorvete.setPreco(10.0f);
        sorveteService.save(sorvete);
        sorveteService.findBySabor("Chocolate").forEach(s -> System.out.println("Sorvete encontrado: " + s.getSabor()));
    }
}
