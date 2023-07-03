import React from "react";
import { useNavigate } from "react-router-dom";
import "./product.css";

const Product = ({ data, id }) => {
    const navigate = useNavigate();
    debugger;
    let s = data;

    return (
        <div
            className="product-card"
            onClick={() => navigate("/product/" + id)}
        >
            <div className="thumbnail">
                <img
                    src={data.imagemURL}
                    alt={data.nome}
                />
            </div>
            <div className="prod-details">
                <span className="name">{data.nome}</span>
                <span className="price">{data.price}</span>
            </div>
        </div>
    );
};

export default Product;