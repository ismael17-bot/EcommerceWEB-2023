import React from "react";
import {
    FaFacebookF,
    FaTwitter,
    FaInstagram,
    FaLinkedinIn,
} from "react-icons/fa";
import "./Newsletter.css";

const Newsletter = () => {
    return (
        <div className="newsletter-section">
            <div className="newsletter-content">
                <span className="small-text"></span>
                <span className="big-text">
                    Inscreva-se para as últimas atualizações e ofertas
                </span>
                <div className="form">
                    <input type="text" placeholder="Email Address" />
                    <button>Se inscrever</button>
                </div>
                <span className="text">
                    Será usado de acordo com nossa Política de Privacidade
                </span>
                <span className="social-icons">
                    <div className="icon">
                        <FaLinkedinIn size={14} />
                    </div>
                    <div className="icon">
                        <FaFacebookF size={14} />
                    </div>
                    <div className="icon">
                        <FaTwitter size={14} />
                    </div>
                    <div className="icon">
                        <FaInstagram size={14} />
                    </div>
                </span>
            </div>
        </div>
    );
};

export default Newsletter;