import "./products.css";
import Product from "./product/product";

const Products = ({ products, innerPage, headingText }) => {
    return (
        <div className="products-container">
            {!innerPage && <div className="sec-heading">{headingText}</div>}
            <div className="card-grid">
                {products?.map((item) => (
                    <Product
                        id={item.id}
                        data={item}
                    />
                ))}
            </div>
        </div>
    );
};

export default Products;