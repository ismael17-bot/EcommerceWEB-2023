import React, {useState, useContext} from 'react';
import { NavLink, useNavigate } from 'react-router-dom'
import { Context } from "../../utils/contex";
import {postLogin} from  "../../utils/api";
import Botao from './botaoLogin/Botao';
import Input from './input/Input';
import './Login.css';

const Login = () => {
  const { validarEmail, validarSenha} = useContext(Context);
  const [loading, setLoading] = useState()
  const [form, setForm] = useState([])
  const navigate = useNavigate()

  const handleSubmit = async (event) => {
    debugger;
    event.preventDefault();
    try {
      setLoading(true)
      const response = await postLogin(form)
      console.log('response do Login', response)
      if (response === true) {
        alert('usuário Logado com Sucesso')
        navigate('/home')
      }
      setLoading(false)
    }
    catch (err) {
      alert('Algo deu errado com o Login' + err)
    }
  }

  const handleChange = (event) => {
    debugger;
    setForm({...form, [event.target.name]: event.target.value})
  }

  const validadorInput = () => {
    return validarEmail(form.email) && validarSenha(form.password)
  }

  return (
    <div className='container'>
      <div className='form'>
        <h1>Faça o seu Login 👋</h1>
        <Input
          name='email'
          placeholder='Digite o seu e-mail'
          onChange={handleChange}
          type='email'
        />
        <Input
          name='password'
          placeholder='Digite a sua senha'
          onChange={handleChange}
          type='password'
        />
        <Botao
          type='submit'
          text='Entrar!'
          onClick={handleSubmit}
          disabled={loading === true || !validadorInput()}
        />
        <div className='sub-container-sign'>
          <p>Não possui conta?</p>
          <NavLink to="cadastrar">Cadastrar</NavLink>
        </div>
      </div>
    </div>
    
  )
}

export default Login;