package com.megahack.magiaambev.resources.checkout;

import com.megahack.magiaambev.domain.Cart;
import com.megahack.magiaambev.domain.Store;
import com.megahack.magiaambev.domain.User;
import com.megahack.magiaambev.dto.GenericResponseEntity;
import com.megahack.magiaambev.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(name = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @GetMapping
    public ResponseEntity<GenericResponseEntity> getCarrinho(@RequestParam("codigo_loja") Integer codigoLoja, @RequestParam("codigo_usuario") Integer codigoUsuario) {

        Cart cart = null;
        try {
            return ResponseEntity.ok().body(
                    GenericResponseEntity.builder()
                            .data(getCarrinhoCliente(codigoLoja, codigoUsuario).getItems())
                            .build()
            );
        } catch (Exception e) {
            return ResponseEntity.ok().body(
                    GenericResponseEntity.builder()
                            .data(new ArrayList<>())
                            .build()
            );
        }
    }


    private Cart getCarrinhoCliente(Integer codigoLoja, Integer codigoUsuario) throws Exception {
        return cartRepository.findOne(
                Example.of(Cart.builder()
                        .user(User.builder().id(codigoUsuario).build())
                        .store(Store.builder().id(codigoLoja).build())
                        .build())
        ).orElseThrow(() -> new Exception("Carrinho não encontrado"));
    }

}
