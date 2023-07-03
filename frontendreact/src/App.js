
import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";

import Footer from "./components/footer/Footer";
import Home from "./components/home/Home";
import Newsletter from "./components/footer/Newsletter/Newsletter";
import AppContext from "./utils/contex";
import Header from "./components/header/Header";
import SingleProduct from "./components/SingleProduct/SingleProduct";
import Login from "./components/login/Login";
import Cadastro from "./components/login/Cadastro/Cadastro";


function App() {
    return (
      <BrowserRouter>
      <AppContext>
          <Header />
          <Routes>
              <Route path="*" element={<Login/>} />
              <Route path="/cadastrar" element={<Cadastro/>} />
              <Route exact path="/home" element={<Home/>} />
              <Route path="/product/:id" element={<SingleProduct/>} />
          </Routes>
      </AppContext>
  </BrowserRouter>
    );
}

export default App;