package com.megahack.magiaambev.resources.checkout;

import com.megahack.magiaambev.domain.Cart;
import com.megahack.magiaambev.domain.ItemCart;
import com.megahack.magiaambev.domain.Store;
import com.megahack.magiaambev.domain.User;
import com.megahack.magiaambev.dto.GenericResponseEntity;
import com.megahack.magiaambev.dto.cart.UpdateItemCartQuantityRequest;
import com.megahack.magiaambev.repositories.CartRepository;
import com.megahack.magiaambev.repositories.ItemCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart/items")
public class ItemCartController {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ItemCartRepository itemCartRepository;

    @PostMapping
    public ResponseEntity addItem() {
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping
    public ResponseEntity removeItem() {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping
    public ResponseEntity updateQuantity(@RequestBody UpdateItemCartQuantityRequest request) {

        Cart cart = cartRepository.findOne(
                Example.of(Cart.builder()
                        .user(User.builder().id(request.getUserId()).build())
                        .store(Store.builder().id(request.getStoreId()).build())
                        .build())
        ).orElseThrow(RuntimeException::new);

        Optional<ItemCart> produtoCarrinho = cart.getItems().stream().filter(p -> p.getProduto().getId().equals(request.getProductId())).findFirst();

        if (produtoCarrinho.isPresent()) {
            produtoCarrinho.get().setQuantidade(request.getQuantity());
            //salva nova quantidade do produto no carrinho
            itemCartRepository.save(produtoCarrinho.get());
        }

        return ResponseEntity.ok().body(
                GenericResponseEntity.builder()
                        .data(cart.getItems())
                        .message("Produto atualizado com sucesso")
                        .build()
        );
    }
}
