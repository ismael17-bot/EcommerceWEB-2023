import React from "react";
import useFetch from "../../../hooks/useFetch";
import Products from "../../products/Products";

const RelatedProducts = ({productId }) => {
    const { data } = useFetch(
        `/product/${productId}`
    );

    return (
        <div className="related-products">
            <Products headingText="Related Products" products={data} />
        </div>
    );
};

export default RelatedProducts;
