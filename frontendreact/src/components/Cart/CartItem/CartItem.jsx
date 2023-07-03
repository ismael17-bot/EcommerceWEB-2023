import React, { useContext } from "react";
import { Context } from "../../../utils/contex";
import { MdClose } from "react-icons/md";

import "./CartItem.css";
const CartItem = () => {
    const { cartItems, handleRemoveFromCart, handleCartProductQuantity } =
        useContext(Context);

    return (
        <div className="cart-products">
            {cartItems?.map((item) => (
                <div
                    className="search-result-item"
                    key={item.id}
                    onClick={() => {}}
                >
                    <div className="image-container">
                        <img
                            src={item.imagemURL}
                            alt={item.nome}
                        />
                    </div>
                    <div className="prod-details">
                        <span className="name">{item.nome}</span>
                        <MdClose
                            className="close-btn"
                            onClick={() => handleRemoveFromCart(item)}
                        />
                        <div className="quantity-buttons">
                            <span
                                onClick={() =>
                                    handleCartProductQuantity("dec", item)
                                }
                            >
                                -
                            </span>
                            <span>{item.quantity}</span>
                            <span
                                onClick={() =>
                                    handleCartProductQuantity("inc", item)
                                }
                            >
                                +
                            </span>
                        </div>
                        <div className="text">
                            <span>{item.quantity}</span>
                            <span>x</span>
                            <span className="highlight">
                                <span>R$ </span> 
                                {item.price *
                                    item.quantity}
                            </span>
                        </div>
                    </div>
                </div>
            ))}
        </div>
    );
};

export default CartItem;