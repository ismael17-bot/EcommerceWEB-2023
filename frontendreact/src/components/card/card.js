import React from 'react';


const Card = ({ nome, descricao, preco, estoque, marca, peso, largura, altura, comprimento, cor, imagemURL, datacadastro }) => {

  return (
    <div className="card">
    <img src={imagemURL} alt={nome} />
      <h2>{nome}</h2>
      <p>{descricao}</p>
      <p>
        <b>Preço:</b> R${preco}
      </p>
      <p>
        <b>Estoque:</b> {estoque}
      </p>
      <p>
        <b>Marca:</b> {marca}
      </p>
      <p>
        <b>Peso:</b> {peso} kg
      </p>
      <p>
        <b>Largura:</b> {largura} cm
      </p>
      <p>
        <b>Altura:</b> {altura} cm
      </p>
      <p>
        <b>Comprimento:</b> {comprimento} cm
      </p>
      <p>
        <b>Cor:</b> {cor}
      </p>
      <p>
        <b>Data de Cadastro:</b> {datacadastro}
      </p>
    </div>
  );
}

export default Card;
