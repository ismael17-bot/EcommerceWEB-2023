
import "./Home.css";
import React, { useEffect, useContext } from "react";
import Banner from "./banner/Banner";
import {fetchDataFromApi} from  "../../utils/api";
import Products from "../products/Products";
import { Context } from "../../utils/contex";
import Newsletter from "../footer/Newsletter/Newsletter";
import Footer from "../footer/Footer";

const Home = () => {

    const { products, setProducts} = useContext(Context);
    useEffect(() => {
        getProducts();
    }, []);

    const getProducts = () => {
        fetchDataFromApi("ecommerce").then((res) => {
            setProducts(res);
        });
    };

    return (
        <>
            <div>
                <Banner />
                <div className="main-content">
                    <div className="layout">
                        <Products
                            headingText="Popular Products"
                            products={products}
                        />
                    </div>
                </div>
            </div>
            <Newsletter />
            <Footer />
        </>
    );
};

export default Home;