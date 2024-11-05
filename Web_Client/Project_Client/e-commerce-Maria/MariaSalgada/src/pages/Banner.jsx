import 'bootstrap/dist/css/bootstrap.min.css';
import './styles/Banner.css'
import Image from 'react-bootstrap/Image';

function Banner(){

    const Banner = "/src/assets/banner-inicial5.png";

    return (
        <div className="banner">
            <Image src={Banner} className="banner-image" alt='Foto Bacalhau' />
            <div className='slogan'>
                <h1 className='slogan-text' style={{
                position: 'absolute',
                top: 250,
                left: 50,
                right: 0,
                fontFamily: 'Caviar Dreams',
                fontWeight: 'bold',
                fontSize: 60,
                color: 'white',
                textAlign: 'left',
                textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)'
                }}>
                Óh Maria deixa <br/>eu provar <br/>teu bacalhau
                </h1>
            </div>
            <div className='frase'>
                <h1 className='frase-text' style={{
                position: 'absolute',
                top: 580,
                left: 0,
                right: 50,
                fontFamily: 'Caviar Dreams',
                fontWeight: 'bold',
                fontSize: 30,
                textAlign: 'right',
                textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)'
                }}>
                UMA EXPLOSÃO DE SABORES!
                </h1>
            </div>
        </div>
        
    )
}

export default Banner