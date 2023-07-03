
import axios from "axios";

const urlAPI = 'http://localhost:8081/';

export const fetchDataFromApi = async (url) => {
    try {
        const { data } = await axios.get(
            urlAPI + url,
        );
        return data;
    } catch (err) {
        console.log(err);
        return err;
    }
};

export const postLogin = async (dados) => {
    try {
        debugger;
        const email = dados.email;
        const senha = dados.password;
        const { data } = await axios.post(
            urlAPI + "Usuario/login", {
                email, senha
            }
        );

        return data;
    } catch (err) {
        console.log(err);
        return err;
    }
};


export const cadastrarUsuario = async (dados) => {
    try {
        await axios.post( urlAPI + "Usuario/add", {dados});
    } catch (err) {
        console.log(err);
        return err;
    }
};