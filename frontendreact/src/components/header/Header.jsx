import { useEffect, useState, useContext } from "react";
import { useNavigate } from "react-router-dom";
import { TbSearch } from "react-icons/tb";
import { CgShoppingCart } from "react-icons/cg";
import { BiUserCircle } from "react-icons/bi";
import "./Header.css";
import { Context } from "../../utils/contex";
import Cart from "../Cart/Cart";

const Header = () => {
    const [scrolled, setScrolled] = useState(false);
    const [searchModal, setSearchModal] = useState(false);
    const navigate = useNavigate();
    const handleScroll = () => {
        const offset = window.scrollY;
        if (offset > 200) {
            setScrolled(true);
        } else {
            setScrolled(false);
        }
    };

    useEffect(() => {
        window.addEventListener("scroll", handleScroll);
    }, []);

    const { cartCount, showCart, setShowCart } = useContext(Context);

    const [isOpen, setIsOpen] = useState(false);
    const [selectedOption, setSelectedOption] = useState('');

    const handleButtonClick = () => {
        setIsOpen(!isOpen);
    };

    const handleOptionSelect = (option) => {
        setSelectedOption(option);
        setIsOpen(false);
    };
        return (
        <>
            <header
                className={`main-header ${scrolled ? "sticky-header" : ""}`}
            >
                <div className="header-content">
                    <ul className="left">
                        <li onClick={() => navigate("/")}>Home</li>
                    </ul>
                    <div className="center" onClick={() => navigate("/home")}>
                        VEGIS STORE.
                    </div>
                    <div className="right">
                        <TbSearch onClick={() => setSearchModal(true)} />
                        <span
                            className="cart-icon"
                            onClick={() => setShowCart(true)}
                        >
                            <CgShoppingCart />
                            {!!cartCount && <span>{cartCount}</span>}
                        </span>
                        <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-end' }}>
                            <button onClick={handleButtonClick}><BiUserCircle /></button>
                            {isOpen && (
                                <div style={{ position: 'absolute', right: 0 }}>
                                <select
                                    value={selectedOption}
                                    onChange={(e) => handleOptionSelect(e.target.value)}
                                >
                                    <option value="opcao1">Opção 1</option>
                                    <option value="opcao2">Opção 2</option>
                                    <option value="opcao3">Opção 3</option>
                                </select>
                                </div>
                            )}
                        </div>
                    </div>
                </div>
            </header>
            {searchModal && <busca setSearchModal={setSearchModal} />}
            {showCart && <Cart />}
        </>
    );
};

export default Header;