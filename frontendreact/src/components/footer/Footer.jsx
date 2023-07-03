import React from "react";
import "./Footer.css";
import { FaLocationArrow, FaMobileAlt, FaEnvelope } from "react-icons/fa";
import Payment from "../../assets/payments.png";

const Footer = () => {
    return (
        <div className="footer">
            <div className="footer-content">
                <div className="col">
                    <div className="title">Sobre</div>
                    <div className="text">
                        Este trabalho teve como objetivo aplicar todos conhecimentos
                        aprendido na aula e tambem fora da universidade, houveram algumas
                        dificuldades mas foi possivel encontrar documentações.
                    </div>
                </div>
                <div className="col">
                    <div className="title">Contato</div>
                    <div className="c-item">
                        <FaLocationArrow />
                        <div className="text">
                            Universidade estadual de santa Catarina
                            Joinville, xxxxxxx
                        </div>
                    </div>
                    <div className="c-item">
                        <FaMobileAlt />
                        <div className="text">Telefone: xxxxxxxxxxx</div>
                    </div>
                    <div className="c-item">
                        <FaEnvelope />
                        <div className="text">Email: store@ismael.com</div>
                    </div>
                </div>
                <div className="col">
                    <div className="title">Categorias</div>
                    <span className="text">Fones</span>
                    <span className="text">Relogio smart</span>
                    <span className="text">NotBooks</span>
                    <span className="text">Celulares</span>
                    <span className="text">Home Theatre</span>
                    <span className="text">Projectors</span>
                </div>
                <div className="col">
                    <div className="title">Páginas</div>
                    <span className="text">Pagina Inicial</span>
                    <span className="text">sobre</span>
                    <span className="text">Politica de privacidade</span>
                    <span className="text">Devoluções</span>
                    <span className="text">Termos e condições</span>
                    <span className="text">Fale conosco</span>
                </div>
            </div>
            <div className="bottom-bar">
                <div className="bottom-bar-content">
                    <span className="text">
                        Criado em 2023 Por ismael e luis
                    </span>
                    <img src={Payment} />
                </div>
            </div>
        </div>
    );
};

export default Footer;