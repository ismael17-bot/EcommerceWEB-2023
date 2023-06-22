package com.example.ecommerce.controller;

import com.example.ecommerce.DTO.PedidoRequestDTO;
import com.example.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public void addPedido(@RequestBody PedidoRequestDTO pedido) {
        pedidoService.addCarrinho(pedido);
    }
}
