import './styles/Header.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import * as Icon from 'react-bootstrap-icons';


function Header() {

    const logo = "/src/assets/logo.png";

    return (
      <div className='navAll'>
        <Navbar expand="lg" className="bg-body-tertiary">
              <Container className='containerBot' fluid>
                <img className='logo' src={logo}/>
                <Navbar.Toggle className='navToggle'  aria-controls="navbarScroll" />
                <Navbar.Collapse id="navbarScroll">
                    <Nav
                        className="me-auto my-2 my-lg-0"
                        style={{ maxHeight: '100px' }}
                        navbarScroll
                    >
                    </Nav>
                    <Nav.Link className='Menu' href="#action1">Quem somos</Nav.Link>
                    <Nav.Link className='Menu' href="#action2">Produtos</Nav.Link>
                    <Nav.Link className='Menu' href="#action3">Contatos</Nav.Link>
                  
                </Navbar.Collapse>
                <div id="card">
                  <Icon.Cart /><span id="card-count">0</span>
                  
                </div>
              </Container>
            </Navbar>
      </div>      
    );
}
export default Header;
