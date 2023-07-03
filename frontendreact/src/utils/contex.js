import { useEffect } from "react";
import { createContext, useState } from "react";
import { useLocation } from "react-router-dom";

export const Context = createContext();

const AppContext = ({ children }) => {
    const [categories, setCategories] = useState();
    const [products, setProducts] = useState();
    const [showCart, setShowCart] = useState(false);
    const [cartItems, setCartItems] = useState([]);
    const [cartCount, setCartCount] = useState(0);
    const [cartSubTotal, setCartSubTotal] = useState(0);
    const location = useLocation();

    useEffect(() => {
        window.scrollTo(0, 0);
    }, [location]);

    useEffect(() => {
        let count = 0;
        cartItems?.map((item) => (count += item.quantity));
        setCartCount(count);

        let subTotal = 0;
        cartItems.map(
            (item) =>
                (subTotal += item.price * item.quantity)
        );
        setCartSubTotal(subTotal);
    }, [cartItems]);

    const handleAddToCart = (product, quantity) => {
        debugger;
        let items = [...cartItems];
        let index = items?.findIndex((p) => p.id === product?.id);
        if (index !== -1) {
            items[index].quantity += quantity;
        } else {
            product.quantity = quantity;
            items = [...items, product];
        }
        setCartItems(items);
    };

    const handleRemoveFromCart = (product) => {
        let items = [...cartItems];
        items = items?.filter((p) => p.id !== product?.id);
        setCartItems(items);
    };

    const handleCartProductQuantity = (type, product) => {
        let items = [...cartItems];
        let index = items?.findIndex((p) => p.id === product?.id);
        if (type === "inc") {
            items[index].quantity += 1;
        } else if (type === "dec") {
            if (items[index].quantity === 1) return;
            items[index].quantity -= 1;
        }
        setCartItems(items);
    };

    const validarEmail = (email) => {
    return email?.toString().includes('@') && email?.toString().includes('.')
    }
    
    const validarSenha = (senha) => {
    return senha?.toString().length > 6
    }
    
    const validarNome = (nome) => {
    return nome?.toString().length > 2
    }
    
    const validarTelefone = (telefone) => {
    return telefone?.toString().length >= 8
    }
    
    const validarConfirmarSenha = (senha, confirmarSenha) => {
    return validarSenha(senha) && senha === confirmarSenha
    }

    return (
        <Context.Provider
            value={{
                products,
                setProducts,
                categories,
                setCategories,
                cartItems,
                setCartItems,
                handleAddToCart,
                cartCount,
                handleRemoveFromCart,
                showCart,
                setShowCart,
                handleCartProductQuantity,
                cartSubTotal,
                validarEmail,
                validarSenha,
                validarNome,
                validarTelefone,
                validarConfirmarSenha
            }}
        >
            {children}
        </Context.Provider>
    );
};

export default AppContext;