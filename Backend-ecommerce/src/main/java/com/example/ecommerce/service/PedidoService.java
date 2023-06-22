package com.example.ecommerce.service;

import com.example.ecommerce.DTO.PedidoDTO;
import com.example.ecommerce.DTO.PedidoRequestDTO;
import com.example.ecommerce.entity.Pedidos;
import com.example.ecommerce.repository.ItemPedidoRepository;
import com.example.ecommerce.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidosRepository pedidosRepository;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public PedidoDTO createCarrinho(Integer id) {
        Optional<Pedidos> optionalOrder = pedidosRepository.findById(id);
        return new PedidoDTO(optionalOrder.get());
    }

    public void addCarrinho(PedidoRequestDTO pedido) {
    }
}
