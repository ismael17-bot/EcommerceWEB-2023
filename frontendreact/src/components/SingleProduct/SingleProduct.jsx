import { useContext, useState } from "react";
import { Context } from "../../utils/contex";
import { useParams } from "react-router-dom";
import useFetch from "../../hooks/useFetch";

import {
    FaFacebookF,
    FaTwitter,
    FaInstagram,
    FaLinkedinIn,
    FaPinterest,
    FaCartPlus,
} from "react-icons/fa";
import "./SingleProduct.css";


const SingleProduct = () => {
    const [quantity, setQuantity] = useState(1);
    const { id } = useParams();
    const { handleAddToCart } = useContext(Context);
    const { data } = useFetch(`ecommerce/product/${id}`);

    const decrement = () => {
        setQuantity((prevState) => {
            if (prevState === 1) return 1;
            return prevState - 1;
        });
    };
    const increment = () => {
        setQuantity((prevState) => prevState + 1);
    };

    if (!data) return;
    const product = data;

    return (
        <div className="single-product-main-content">
            <div className="layout">
                <div className="single-product-page">
                    <div className="left">
                        <img
                            src={data.imagemURL}
                            alt={data.nome}
                        />
                    </div>
                    <div className="right">
                        <span className="name">{product.nome}</span>
                        <span className="price">{product.price}</span>
                        <span className="desc">{product.descricao}</span>

                        <div className="cart-buttons">
                            <div className="quantity-buttons">
                                <span onClick={decrement}>-</span>
                                <span>{quantity}</span>
                                <span onClick={increment}>+</span>
                            </div>
                            <button
                                className="add-to-cart-button"
                                onClick={() => {
                                    handleAddToCart(data, quantity);
                                    setQuantity(1);
                                }}
                            >
                                <FaCartPlus size={20} />
                                ADD AO CARRINHO
                            </button>
                        </div>

                        <span className="divider" />
                        <div className="info-item">
                            <span className="text-bold">
                                {/* Category:{" "}
                                <span>
                                    {
                                        product.categories.data[0].attributes
                                            .nome
                                    }
                                </span> */}
                            </span>
                            <span className="text-bold">
                                Compartilhar:
                                <span className="social-icons">
                                    <FaFacebookF size={16} />
                                    <FaTwitter size={16} />
                                    <FaInstagram size={16} />
                                    <FaLinkedinIn size={16} />
                                    <FaPinterest size={16} />
                                </span>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default SingleProduct;
