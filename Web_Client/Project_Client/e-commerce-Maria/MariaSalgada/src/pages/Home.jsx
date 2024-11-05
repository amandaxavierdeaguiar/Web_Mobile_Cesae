import 'bootstrap/dist/css/bootstrap.min.css';

import Header from "./Header"
import Banner from "./Banner"
import ProductosIndex from './ProdutosIndex';

function Home() {
    return(
        <body>
            
            <Header/>
            <Banner/>
            <ProductosIndex/>
        </body>
    )
}

export default Home