import './styles/ProdutoIndex.css'

import { useState } from 'react';
import { Row, Col, Button, Container } from 'react-bootstrap';
/** Importando para contador */

const produtos = [
  {
    nome: 'Bolinho de Bacalhau',
    imagem: "/src/assets/produtos/bolinho-1.png",
  },
  {
    nome: 'Bolinho de Bacalhau com Camarão',
    imagem: "/src/assets/produtos/bacalhau-camarao.png",
  },
  {
    nome: 'Bolinho de Bacalhau com Queijo',
    imagem: "/src/assets/produtos/bacalhau-queijo.png",
  },
  {
    nome: 'Bolinho de Bacalhau Especial',
    imagem: "/src/assets/produtos/bolinho-2.png",
  },
];

function ProductosIndex() {
  

  const [selectedIndex, setSelectedIndex] = useState(Math.floor(produtos.length / 2)); // start with the middle product selected

  

  const handlePrevious = () => {
    setSelectedIndex((prevIndex) => (prevIndex === 0? produtos.length - 1 : prevIndex - 1));
  };

  const handleNext = () => {
    setSelectedIndex((prevIndex) => (prevIndex === produtos.length - 1? 0 : prevIndex + 1));
  };


  return (
    <div className='produtosIndexContainer'>
      
      <Container className="container">
        <Row className='row-products'>
          <Col md={1} className="d-flex align-items-center justify-content-center">
            <Button variant="outline-secondary" onClick={handlePrevious}>
              {'<'}
            </Button>
          </Col>
                 
          <Col md={10} className="d-flex align-items-center justify-content-center">
            <div className='photos'> 
              <Row>
                {produtos.map((produto, i) => (
                  <Col key={i} md={3} className="col-central">
                    {i === selectedIndex && (
                      <div className='elected'>
                        <h5 className='fonte' style={{
                          fontFamily: 'Caviar Dreams',
                          fontSize: 20,
                          fontWeight: 'bold',
                          textAlign: 'center'
                          }}>{produto.nome}</h5>
                      </div>
                    )}
                    <img
                      src={produto.imagem}
                      alt={produto.nome}
                      className={`img-fluid ${i === selectedIndex? 'elected' : ''}`}
                    />
                    {i === selectedIndex && (
                      <div className='elected text-center'>
                        {/*<h5>{produto.nome}</h5>*/}
                        <Button className="add-to-cart" variant="light" 
                         style={{
                          fontFamily: 'Caviar Dreams',
                          fontSize: 15,
                          fontWeight: 'bold',
                          textAlign: 'center' 
                          }}>Comprar</Button>
                      </div> 
                    )}
                    
                  </Col>
                ))}
              </Row>
              </div>
            </Col>
          
          <Col md={1} className="d-flex align-items-center justify-content-center">
            <Button 
            variant="outline-secondary" onClick={handleNext}>
              {'>'}
            </Button>
          </Col>
        </Row>
      </Container>
    </div>
  );
}

export default ProductosIndex;

{/* onClick={handleAddToCart} */}